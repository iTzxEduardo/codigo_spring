package app.senaistock.stock_senai.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    // index page
    @GetMapping("/")
    public String acessoHome() {
        return "index";
    }
    
    // index page
    @GetMapping("/home")
    public String acessoHome2() {
        return "index";
    }

    @GetMapping("/login-responsavel")
    public String acessoLoginResponsavel() {
        return "login/login-responsavel";
    }
}
