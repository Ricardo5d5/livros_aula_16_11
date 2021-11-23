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
    private String titulo;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    
}
