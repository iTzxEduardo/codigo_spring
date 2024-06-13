package app.senaistock.stock_senai.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    // index page
/*     @GetMapping("/")
    public String acessoHome() {
        return "index";
    }
     */
    
    // index page
    @GetMapping("/login-responsavel")
    public String acessoHome2() {
        return "index";
    }
/* 
    @GetMapping("/home")
    public String acessoLoginResponsavel() {
        return "pages/home";
    } */

    @GetMapping("/sobre-nos")
    public String acessoSobreNos() {
        return "pages/about-us-page";
    }
}
