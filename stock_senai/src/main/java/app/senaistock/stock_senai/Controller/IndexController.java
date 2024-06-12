package app.senaistock.stock_senai.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // index page
    @GetMapping("/login-responsavel")
    public String acessoLogin() {
        return "index";
    }

}
