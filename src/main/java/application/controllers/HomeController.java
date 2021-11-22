package application.controllers;    //pacote da hierarquização de pastas.

import org.springframework.stereotype.Controller;   //import controlador de tipo de anotação, normalmente usado em combinação com métodos de manipulador anotados com base na RequestMapping. 
import org.springframework.web.bind.annotation.RequestMapping;  //import do RequestMapping, é usado para mapear solicitações da web em métodos manipuladores em classes de manipulação de solicitações.
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(method=RequestMethod.GET)
    public String index() {
        return "home/index.jsp";
    }
}