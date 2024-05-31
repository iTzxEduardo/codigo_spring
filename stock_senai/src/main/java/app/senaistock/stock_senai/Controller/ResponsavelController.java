package app.senaistock.stock_senai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import app.senaistock.stock_senai.Model.Responsaveis;
import app.senaistock.stock_senai.Repository.ResponsaveisRepository;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ResponsavelController {
    @Autowired
    private ResponsaveisRepository repository;

    boolean acessoResponsavel = false; //Definir o estado do login do usuário (logado/não logado)

    private String email;

    @GetMapping("/interna-responsavel")
    public String acessoPaginaInternaResponsavel(Model model) {
        String vaiPara = "";
        String responsavelEmail = email;
        Responsaveis responsaveis = repository.findByEmail(responsavelEmail);
        if (acessoResponsavel) {
            model.addAttribute("nome", responsaveis.getNome_responsavel());
            vaiPara = "interna/interna-responsavel";
        } else {
            vaiPara = "redirect:/login-responsavel";
        }
        return vaiPara;
    }

    @PostMapping("acesso-responsavel")
    public String acessoResponsavel(@RequestParam String email, @RequestParam String senha, Model model) {
        this.email = email;
        try{
            boolean verificaEmail = repository.existsByEmail(email);
            boolean verificaSenha = repository.findByEmail(email).getSenha().equals(senha);
            String url = "";
            if (verificaEmail && verificaSenha) {
                acessoResponsavel = true;
                url = "redirect:/interna-responsavel";
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

    @GetMapping("/logout-responsavel")
    public String logoutResponsavel() {
        acessoResponsavel = false;
        return "redirect:/login-responsavel";
    }
    
    
    


}
