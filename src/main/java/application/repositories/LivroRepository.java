package application.repositories;   // Pacote "application.repositories" e indica em qual pacote este "repositories" estará localizado.
import org.springframework.data.repository.CrudRepository;  // Importa o repositório CrudRepository da org.springframework.data.repository.

import application.models.Livro;    // Importa o modelo Livro da application.
public interface LivroRepository extends CrudRepository<Livro, Integer> {   // Cria uma interface de armazenamento com a extensão do repositório CRUD.
    
}
