package application.controllers;    // Pacote application e indica em qual pacote este controllers (Controlador) estará localizado.

import java.util.Optional;  // Improta um pacote "Optinal" do java.util.

import org.springframework.beans.factory.annotation.Autowired;  // Importa o Autowired do springframerwork.
import org.springframework.stereotype.Controller; // Importa o pacote de Mapeamento de Requisições do Framework Spring.
import org.springframework.web.bind.annotation.RequestMapping;  // Importa do RequestMapping, é usado para mapear solicitações da web em métodos manipuladores em classes de manipulação de solicitações.
import org.springframework.web.bind.annotation.RequestMethod; // Importa o pacote de Métodos de Requisição (GET, POST, DELETE, PUT, ETC) do Framework Spring.
import org.springframework.web.bind.annotation.RequestParam;  // Importa o RequestParam do springframerwork.
import org.springframework.web.bind.annotation.PathVariable;  // Importa o PathVariable do springframerwork.

import application.models.Livro;  // Importa o modelo Livro da aplicação.
import application.repositories.LivroRepository;  // Importa o repositório LivroRepository da aplicação.
import org.springframework.ui.Model;  // Importa um kit de ui do framework spring

@Controller // A anotação @Controller indica que a classe é um “Controller” controlador, atuando como um estereótipo para a classe anotada, indicando o seu papel (dentro do contexto do padrão MVC ele é o 'C').
@RequestMapping("/livro") //A anotação @RequestMapping indica que o controlador, que neste caso é a classe "LivroController", receberá as requisições feitas à URL www.DNS_da_aplicação/LivroController.
public class LivroController {  // Cria a classe pública LivroController e abre o escopo de corpo dela.
  @Autowired  // O Autowired (@Autowired) é a anotação mais utiliza com relação a injeção de dependências. Como o próprio nome diz, o Autowired, indica um ponto aonde a injeção automática deve ser aplicada.
  private LivroRepository livrosRepo; //Cria um objeto privado chamado livrosRepo do tipo LivroRepository.

  @RequestMapping("/list")  //O método "list" também está anotado com a anotação @RequestMapping, indicando que esse método irá receber as requisições feitas a URL www.DNS_da_aplicação/LvroController sempre que se tratar de uma requisição HTTP GET.
  public String list(Model model) { // Cria uma função de retorno público de tipo String com o nome list, com o parâmetro model do tipo Model, que serve para listar todos livros.
    model.addAttribute("livros", livrosRepo.findAll()); // Adiciona o atributo livros ao modelo e preenche com todos livros do livrosRepo.
    return "list.jsp";  // Indica o retorno do arquivo "list.jsp", Retorna uma string referente à página que mostrará os dados obtidos.
  }

  public String listar() {  // Cria uma função de retorno público de tipo String com o nome listar, sem parâmetros, que serve para listar todos livros dentro do "/livro".
    return "livro/list.jsp";  //*********Retorna uma string referente à página que redirecionar ao método responsável pela listagem.
  }

  @RequestMapping("/insert")  // Anotação para mapear solicitações da web em métodos em classes de tratamento de solicitações com assinaturas de método flexíveis.

  public String formInsert() {  // Cria uma função de retorno público de tipo String com o nome listar, sem parâmetros, que serve para listar todos livros dentro do "/livro".
    return "insert.jsp";  // Indica o retorno do arquivo "insert.jsp", Retorna uma string referente à página que mostrará os dados obtidos.
  }

  // inserindo os dados via formulário
  @RequestMapping(value = "/insert", method = RequestMethod.POST) // Anotação para mapear solicitações da web em métodos em classes de tratamento de solicitações com assinaturas de método flexíveis, marca como essa função pode ser acessada pela web e seu método.
  public String saveInsert(@RequestParam("titulo") String titulo) { // Cria uma função de retorno público de tipo String com o nome saveInsert, que recebe o título do livro como parâmetro, essa função serve para inserir títulos no repositório.
    Livro livro = new Livro();  // Cria uma instância do objeto chamado livro do tipo Livro.
    livro.setTitulo(titulo);  // Define o título do livro com o parâmetro recebido.
    livrosRepo.save(livro); // Salva o livro no repositório.
    return "redirect:/livro/list";  // Retorna um redirecionamento pra voltar para lista após a inserção.
  }

  // deletando os dados via formulário
  @RequestMapping("/delete/{id}") // Anotação para mapear solicitações da web em métodos em classes de tratamento de solicitações com assinaturas de método flexíveis, marca como essa função pode ser acessada pela web.
  public String formDelete(Model model, @PathVariable int id) { // Cria uma função de retorno público de tipo String com o nome formDelete, que recebe o id do livro como parâmetro, essa função serve para confirmar se é possível remover títulos do repositório.
    Optional<Livro> livro = livrosRepo.findById(id);  // Busca o livro pelo id e marca campo como opcional pra caso o id não seja encontrado.
    if (!livro.isPresent()) // Define se o livro não for presente, o usuário será redirecionado de volta pra página que está.
      return "redirect:/livro/list"; // Retorna um redirecionamento para voltar pra lista após a exclusão.
    model.addAttribute("livro", livro.get()); // Adiciona o atributo livro ao model e preenche com o livro obtido.

    return "/livro/delete.jsp"; //Redireciona para a página de exclusão.

  }

  @RequestMapping(value = "/delete", method = RequestMethod.POST) // Anotação para mapear solicitações da web em métodos em classes de tratamento de solicitações com assinaturas de método flexíveis, marca como essa função pode ser acessada pela web e seu método.
  public String confirmDelete(@RequestParam("id") int id) { // Cria uma função de retorno público de tipo String com o nome confirmDelete, que recebe o id do livro como parâmetro, essa função serve para remover títulos do repositório.
    livrosRepo.deleteById(id);  // Executa a função de remover o livro pelo id do repositório de livros.
    return "redirect:/livro/list";  // Retorna um redirecionamento para voltar para a lista de livros.

  }

  // atualizando os dados via formulário
  @RequestMapping("/update/{id}") // Anotação para mapear solicitações da web em métodos em classes de tratamento de solicitações com assinaturas de método flexíveis, marca como essa função pode ser acessada pela web.
  public String formUpdate(Model model, @PathVariable int id) { // Cria uma função de retorno público de tipo String com o nome formUpdate, que recebe o id do livro e o modelo como parâmetro, essa função serve para confirmar se é possível atualizar títulos do repositório.
    Optional<Livro> livro = livrosRepo.findById(id);  // Busca o livro pelo id e marca campo como opcional pra caso o id não seja encontrado.
    if (!livro.isPresent()) // Define se o livro não for presente, o usuário será redirecionado de volta pra página que está.
      return "redirect:/livro/list";  // Retorna um redirecionamento para voltar pra lista após a atualização.
    model.addAttribute("livro", livro.get()); // Adiciona o atributo livro ao model e preenche com o livro obtido.
    // return "redirect:/livro/update.jsp";
    return "/livro/update.jsp"; // Redireciona para a página de atualização.
  }

  @RequestMapping(value = "/update", method = RequestMethod.POST) // Anotação para mapear solicitações da web em métodos em classes de tratamento de solicitações com assinaturas de método flexíveis, marca como essa função pode ser acessada pela web e seu método.
  public String saveUpdate(@RequestParam("titulo") String titulo, @RequestParam("id") int id) { // Cria uma função de retorno público de tipo String com o nome confirmDelete, que recebe o id do livro como parâmetro, essa função serve para atualizar títulos do repositório.
    Optional<Livro> livro = livrosRepo.findById(id);  // Busca o livro pelo id e marca campo como opcional pra caso o id não seja encontrado.
    if (!livro.isPresent()) // Define se o livro não for presente, o usuário será redirecionado de volta pra página que está.
      return "redirect:/livro/list";  // Retorna um redirecionamento para voltar pra lista após a atualização.
    livro.get().setTitulo(titulo);  // Obtém o livro e atualiza seu título.
    livrosRepo.save(livro.get()); // Salva o livro no repositório.

    return "redirect:/livro/list";  // Redireciona o usuário de volta pra lista de livros.

  }
}
