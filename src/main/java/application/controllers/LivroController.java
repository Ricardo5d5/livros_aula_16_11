package application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Optional;
import application.models.Livro;
import application.repositories.LivroRepository;

import org.springframework.ui.Model;

@Controller //A anotação @Controller indica que a classe é um “Controller” controlador, atuando como um estereótipo para a classe anotada, indicando o seu papel (dentro do contexto do padrão MVC ele é o 'C').
@RequestMapping("/livro") //A anotação @RequestMapping indica que o controlador, que neste caso é a classe "LivroController", receberá as requisições feitas à URL www.DNS_da_aplicação/LivroController.
public class LivroController {  //
  @Autowired  //A anotação @Autowired permite que você pule as configurações em outro lugar do que injetar e faça isso por você.
  private LivroRepository livrosRepo;

  @RequestMapping("/list")
  public String list(Model model) {
    model.addAttribute("livros", livrosRepo.findAll());
    return "list.jsp";
  }

  public String listar() {
    return "livro/list.jsp";
  }

  @RequestMapping("/insert")
  public String formInsert() {
    return "insert.jsp";
  }

  // inserindo os dados via formulário
  @RequestMapping(value = "/insert", method = RequestMethod.POST)
  public String saveInsert(@RequestParam("titulo") String titulo) {
    Livro livro = new Livro();
    livro.setTitulo(titulo);
    livrosRepo.save(livro);
    return "redirect:/livro/list";
  }

  // deletando os dados via formulário
  @RequestMapping("/delete/{id}")
  public String formDelete(Model model, @PathVariable int id) {
    Optional<Livro> livro = livrosRepo.findById(id);
    if (!livro.isPresent())
      return "redirect:/livro/list";
    model.addAttribute("livro", livro.get());

    return "/livro/delete.jsp";

  }

  @RequestMapping(value = "/delete", method = RequestMethod.POST)
  public String confirmDelete(@RequestParam("id") int id) {
    livrosRepo.deleteById(id);
    return "redirect:/livro/list";

  }

  // atualizando os dados via formulário
  @RequestMapping("/update/{id}")
  public String formUpdate(Model model, @PathVariable int id) {
    Optional<Livro> livro = livrosRepo.findById(id);
    if (!livro.isPresent())
      return "redirect:/livro/list";
    model.addAttribute("livro", livro.get());
    // return "redirect:/livro/update.jsp";
    return "/livro/update.jsp";
  }

  @RequestMapping(value = "/update", method = RequestMethod.POST)
  public String saveUpdate(@RequestParam("titulo") String titulo, @RequestParam("id") int id) {
    Optional<Livro> livro = livrosRepo.findById(id);
    if (!livro.isPresent())
      return "redirect:/livro/list";
    livro.get().setTitulo(titulo);
    livrosRepo.save(livro.get());

    return "redirect:/livro/list";

  }
}
