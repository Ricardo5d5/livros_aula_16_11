package application.models; // Pacote "application.models" e indica em qual pacote este "models" estará localizado.

// Diversos imports do Java X
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Especifica que a classe é uma entidade. Esta anotação é aplicada à classe de entidade.
@Table(name="livros")   // Especifica a tabela primária para a entidade anotada.
public class Livro {    // Cria uma classe pública chamada de "Livro".

    @Id // Especifica a chave primária de uma entidade.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Fornece a especificação de estratégias de geração de valores de chaves primárias.
    private int id; // Cria uma variável private do tipo int (integer) chamada de "id".
    private String titulo;   // Cria uma variável private do tipo String chamada de "titulo".
    // As linhas seguintes representam a formatação GETTER e SETTER que resumidamente serve como intermédio entre o valor e interações externas.
    public int getId() {    // Este é o GET de id, obtém o id.
        return id;  //Indica o retorno como "id".
    }
    public void setId(int id) { // Este é o set de id, define o id.
        this.id = id;    // Define o id local como o valor obtido por setId.
    }
    public String getTitulo() {  // Este é o GET de titulo, obtém o titulo.
        return titulo;  //Indica o retorno como "titulo".
    }
    public void setTitulo(String titulo) {  // Este é o set de titulo, define o titulo
        this.titulo = titulo;   // Define o titulo local como o valor obtido por setTitulo.
    }


    
}
