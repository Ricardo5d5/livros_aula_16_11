package application.controllers;    //pacote da hierarquização de pastas.

import org.springframework.stereotype.Controller;   //import controlador de tipo de anotação, normalmente usado em combinação com métodos de manipulador anotados com base na RequestMapping. 
import org.springframework.web.bind.annotation.RequestMapping;  //import do RequestMapping, é usado para mapear solicitações da web em métodos manipuladores em classes de manipulação de solicitações.
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //A anotação @Controller indica que a classe é um “Controller” controlador, atuando como um estereótipo para a classe anotada, indicando o seu papel (dentro do contexto do padrão MVC ele é o 'C').
public class HomeController {
    @RequestMapping(method=RequestMethod.GET)
    public String index() {
        return "home/index.jsp";    //retorna o arquivo index.jsp que se encontra na pasta home.
    }
}