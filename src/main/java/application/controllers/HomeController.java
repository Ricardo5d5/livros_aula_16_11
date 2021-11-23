package application.controllers;    // Pacote application e indica em qual pacote este controllers (Controlador) estará localizado.

import org.springframework.stereotype.Controller;   //import controlador de tipo de anotação, normalmente usado em combinação com métodos de manipulador anotados com base na RequestMapping. 
import org.springframework.web.bind.annotation.RequestMapping;  //import do RequestMapping, é usado para mapear solicitações da web em métodos manipuladores em classes de manipulação de solicitações.
import org.springframework.web.bind.annotation.RequestMethod;   // Importa o pacote de Métodos de Requisição (GET, POST, DELETE, PUT, ETC) do Framework Spring.

@Controller //A anotação @Controller indica que a classe é um “Controller” controlador, atuando como um estereótipo para a classe anotada, indicando o seu papel (dentro do contexto do padrão MVC ele é o 'C').
public class HomeController {   // Cria a classe pública HomeController e abre o escopo de corpo dela.
    @RequestMapping(method=RequestMethod.GET)   // Anotação para mapear solicitações da web em métodos em classes de tratamento de solicitações com assinaturas de método flexíveis.

    public String index() { // Cria uma função de retorno público de tipo String com o nome index, sem parâmetros.

        return "home/index.jsp";    //Indica o retorno do arquivo "index.jsp" que está na pasta "home".
    }   //Fecha o método index().
}   //Fecha a classe HomeController.