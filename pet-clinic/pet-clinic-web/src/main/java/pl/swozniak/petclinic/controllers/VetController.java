package pl.swozniak.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    @RequestMapping({"/", "/index", "/index.html", ""})
    public String listVets(){

        return "vets/index";
    }
}
