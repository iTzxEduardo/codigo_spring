package app.senaistock.stock_senai.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import app.senaistock.stock_senai.Model.Cargos;
import app.senaistock.stock_senai.Model.Categorias;
import app.senaistock.stock_senai.Model.Patrimonio;
import app.senaistock.stock_senai.Model.Salas;
import app.senaistock.stock_senai.Model.Areas;
import app.senaistock.stock_senai.Model.Blocos;
import app.senaistock.stock_senai.Model.Responsaveis;
import app.senaistock.stock_senai.Repository.CargosRepository;
import app.senaistock.stock_senai.Repository.CategoriasRepository;
import app.senaistock.stock_senai.Repository.PatrimonioRepository;
import app.senaistock.stock_senai.Repository.ResponsaveisRepository;
import app.senaistock.stock_senai.Repository.SalasRepository;
import app.senaistock.stock_senai.Repository.BlocosRepository;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ResponsavelController {
    @Autowired
    private ResponsaveisRepository responsavelRepository;

    @Autowired
    private CargosRepository cargosRepository;

    @Autowired

    private CategoriasRepository categoriasRepository;

    @Autowired
    private BlocosRepository blocosRepository;

    @Autowired
    private PatrimonioRepository patrimonioRepository;

    private SalasRepository salasRepository;

    boolean acessoResponsavel = false; // Definir o estado do login do usuário (logado/não logado)

    private String email;

    @GetMapping("/interna-responsavel")
    public String acessoPaginaInternaResponsavel(Model model) {
        String vaiPara = "";
        String responsavelEmail = email;
        Responsaveis responsaveis = responsavelRepository.findByEmail(responsavelEmail);
        if (acessoResponsavel) {
            model.addAttribute("nome", responsaveis.getNome_responsavel());
            model.addAttribute("foto", responsaveis.getFoto());
            Cargos cargo = responsaveis.getId_cargo();
            if (cargo != null) {
                model.addAttribute("cargo", cargo.getNome_cargo());
            } else {
                model.addAttribute("cargo", "Cargo não encontrado!");
            }
            vaiPara = "pages/internal-user-page";
        } else {
            vaiPara = "redirect:/login-responsavel";
        }
        return vaiPara;
    }

    @PostMapping("acesso-responsavel")
    public String acessoResponsavel(@RequestParam String email, @RequestParam String senha, Model model) {
        this.email = email;
        try {
            boolean verificaEmail = responsavelRepository.existsByEmail(email);
            boolean verificaSenha = responsavelRepository.findByEmail(email).getSenha().equals(senha);
            String url = "";
            if (verificaEmail && verificaSenha) {
                acessoResponsavel = true;
                if ("adm@senai.com".equals(email)) {
                    url = "redirect:/interna-adm";
                } else {
                    url = "redirect:/home";
                }
            } else {
                model.addAttribute("mensagem", "erro ao realizar o login.");
                url = "redirect:/login-responsavel";
            }
            return url;
        } catch (Exception e) {
            model.addAttribute("mensagem", "algo deu errado!");
            return "redirect:/login-responsavel";
        }
    }

    @PostMapping("cadastro-responsavel")
    public String cadastrarResponsavelBanco(Responsaveis responsavel, Model model) {
        try {
            responsavelRepository.save(responsavel); // cadastro um obj responsavel no banco de dados
            model.addAttribute("mensagem",
                    "O Responsavel " + responsavel.getNome_responsavel() + " foi cadastrado com Sucesso!");
        } catch (Exception e) {
            model.addAttribute("mensagem", "Erro ao cadastrar responsavel. Por favor, tente novamente.");
        }
        return "/cadastro/cadastro-responsavel";
    }

    @GetMapping("/cadastro-responsavel")
    public String acessoPageInternaCadastroResponsavel(Model model) {
        String vaiPara = "";
        if (acessoResponsavel) {
            List<Cargos> cargos = cargosRepository.findAll();
            model.addAttribute("cargos", cargos);
            vaiPara = "cadastro/cadastro-responsavel";
        } else {
            vaiPara = "redirect:/login-responsavel";
        }
        return vaiPara;
    }

    // Pegar as salas em que o responsável é responsável
    @GetMapping("/salas-responsaveis")
    public String listarSalasResponsavel(Model model) {
        Responsaveis responsaveis = responsavelRepository.findByEmail(email);
        if (acessoResponsavel) {
            Salas salasCadastradas = responsaveis.getIdsala();
            model.addAttribute("salasCadastradas", salasCadastradas);
            Salas sala = responsaveis.getIdsala();
            Areas area = sala.getId_area();
            model.addAttribute("sala", sala);
            model.addAttribute("area", area.getNome_area());
            return "interna/salas-responsaveis";
        } else {
            return "redirect:/login-responsavel";
        }
    }

    // Listar todos os blocos
    @GetMapping("/home")
    public String listarBlocos(Model model) {
        if (acessoResponsavel) {
            List<Blocos> blocos = (List<Blocos>) blocosRepository.findAll();
            model.addAttribute("blocos", blocos);
            return "pages/home";
        } else {
            return "redirect:/login-responsavel";
        }
    }

    @GetMapping("/logout-responsavel")
    public String logoutResponsavel() {
        acessoResponsavel = false;
        return "redirect:/login-responsavel";
    }

    @GetMapping("/interna-adm")
    public String acessoPaginaInternaAdm(Model model) {
        if (acessoResponsavel && "adm@senai.com".equals(email)) {
            return "interna/interna-adm";
        } else {
            return "redirect:/interna-responsavel";
        }
    }

    // listar salas de acordo com o Bloco clicado
    @GetMapping("/detalhes-bloco/{id}")
    public String detalhesBloco(@PathVariable("id") Long id_bloco, Model model) {

        Blocos bloco = blocosRepository.findById(id_bloco).orElse(null);
        if (bloco != null) {
            List<Salas> salasDoBloco = salasRepository.findByIdbloco(bloco);
            model.addAttribute("bloco", bloco);
            model.addAttribute("salasDoBloco", salasDoBloco);

            return "/pages/list-room-page";
        } else {
            // Lidar com o bloco não encontrado
            return "redirect:/listar-blocos";
        }
    }

    // listar os patrimônios de acordo com a sala clicada
    @GetMapping("/detalhes-sala/{id}")
    public String detalhesSala(@PathVariable("id") Long id_sala, Model model) {
        Salas sala = salasRepository.findById(id_sala).orElse(null);
        if (sala != null) {
            List<Patrimonio> patrimoniosDaSala = patrimonioRepository.findByIdsala(sala);
            Iterable<Categorias> categorias = categoriasRepository.findAll();
            model.addAttribute("sala", sala);
            model.addAttribute("categoria", categorias);
            model.addAttribute("patrimoniosDaSala", patrimoniosDaSala);

            return "/pages/details-room-page";
        } else {
            // Lidar com o bloco não encontrado
            return "redirect:/detalhes-bloco";
        }
    }

    // R - Listar os usuários
    @GetMapping("/listar-responsaveis")
    public String listarResponsaveis(Model model) {
        if (acessoResponsavel && "adm@senai.com".equals(email)) {
            List<Responsaveis> responsaveis = (List<Responsaveis>) responsavelRepository.findAll();
            model.addAttribute("responsaveis", responsaveis);
            return "interna/listar-responsaveis";
        } else {
            return "redirect:/login-responsavel";
        }
    }

    // D - deletar usuário
    @PostMapping("/deletar-responsavel/{id}")
    public String deletarResponsavel(@PathVariable("id") Long id, Model model) {
        if (acessoResponsavel && "adm@senai.com".equals(email)) {
            try {
                responsavelRepository.deleteById(id);
                model.addAttribute("mensagem", "Responsável deletado com sucesso.");
            } catch (Exception e) {
                model.addAttribute("mensagem", "Erro ao deletar responsável. Por favor, tente novamente.");
            }
        } else {
            model.addAttribute("mensagem", "Acesso negado.");
        }
        return "redirect:/listar-responsaveis";
    }

    // U - update do usuário
    @PutMapping("/atualizar-responsavel/{id}")
    public String atualizarResponsavel(@PathVariable("id") Long id, Responsaveis responsavel, Model model) {
        if (acessoResponsavel && "adm@senai.com".equals(email)) {
            try {
                Optional<Responsaveis> idResponsavel = responsavelRepository.findById(id);
                if (idResponsavel.isPresent()) {
                    responsavel.setId_responsavel(id);
                    responsavelRepository.save(responsavel);
                }
            } catch (Exception e) {
                model.addAttribute("mensagem", "Erro ao atualizar responsável. Por favor, tente novamente.");
            }
        } else {
            model.addAttribute("mensagem", "Acesso negado.");
        }
        return "redirect:/listar-responsaveis";
    }

}
