package urketa.spring.petclinic.petclinic.Contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import urketa.spring.petclinic.petclinic.services.VetService;

@Controller
public class VetController
{

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","vets/index","vets/index.html","/vets.html"})
    public String listOfVets(Model model)
    {
        model.addAttribute("vets",vetService.findAll());
    return "vets/index";
    }
}
