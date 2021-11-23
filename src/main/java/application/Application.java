package application;    // Define o pacote da aplicação como "application".

import org.springframework.boot.SpringApplication;  // Importa o utilitário SpringApplication do springframework.
import org.springframework.boot.autoconfigure.SpringBootApplication;    // Importa SpringBootApplication o utilitário do springframework.

@SpringBootApplication  // Indica uma classe de configuração que declara um ou mais métodos @Bean e também dispara a configuração automática e a varredura de componente.
public class Application {  // Cria uma classe pública nomeada Application (Aplicação prinipal).
    public static void main(String[] args) {    // Cria um método estático sem retorno que define a inicialização da aplicação.
        SpringApplication.run(Application.class, args); //SpringApplication.run() para se inicializar uma aplicação com o Spring Boot.
    }   //Fecha o método main.
}   //Fecha a classe Application.