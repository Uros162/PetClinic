package urketa.spring.petclinic.petclinic.Contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControler {

    @RequestMapping({"/","","index.html","index"})
    public String index(){
        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler(){
        return "notimplementedd";
    }
}
