<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <!-- Indica características e define o arquivo como um jsp do java e a codificação da página -->
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    <!-- importando bibliotecas para o documento jsp e as atribuindo o prefixo de c -->
        <!DOCTYPE html> <!-- Define o tipo do documento -->
        <html>  <!-- Define o escopo de leitura do html -->

        <head>  <!-- Define o escopo da "cabeça" do site -->
            <meta charset="utf-8" />    <!-- Define a codificação como utf-8 -->

            <title>Livros</title>   <!-- Define o título da página -->
            <!-- Define o estilo de css de bootstrap -->
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
                integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
                crossorigin="anonymous">
        </head> <!-- fecha a tag head -->

        <body>  <!-- Define o corpo do site -->
            <main class="container">    <!-- Inicia a tag main (conteúdo principal do documento) -->
                <h1>livros</h1> <!-- Exibe um título h1 -->
                <a href="/livro/insert" class="btn btn-primary">Novo livro</a>  <!-- Estabelece uma âncora estilizada com bootstrap -->
                <table> <!-- Inicia uma tabela -->
                    <tr>    <!-- Anuncia o ínicio de uma linha da tabela -->
                        <th>ID</th> <!-- define o cabeçalho "ID" para a tabela -->
                        <th>Título</th> <!-- define o cabeçalho "Título" para a tabela -->
                    </tr>   <!-- Finaliza a linha da tabela -->
                    <!-- tag responsável por listar todos os livros presentes na base de dados e aplicar a todos eles as pŕoximas tags (uma espécie de loop) -->
                    <c:forEach var="l" items="${livros}">
                        <tr>    <!-- Anuncia o ínicio de uma linha da tabela -->
                            <td>${l.id}</td>    <!-- Define uma célula da tabela com o id do livro -->
                            <td>${l.titulo}</td>    <!-- Define uma célula da tabela com o titulo do livro -->
                            <!-- <td> = Define uma célula da tabela -->
                            <td><a href="/livro/update/${l.id}" class="btn btn-primary">Atualizar livro</a></td>    <!-- Exibe uma âncora estilizada com bootstrap para atualizar o livro -->
                            <!-- </td> = Finaliza uma célula da tabela -->
                            <!-- <td> = Define uma célula da tabela -->
                            <td><a href="/livro/delete/${l.id}" class="btn btn-danger">Deletar livro</a></td>   <!-- exibe uma âncora estilizada com bootstrap para excluir o livro -->
                            <!-- </td> = Finaliza uma célula da tabela -->
                        </tr>   <!-- Finaliza a linha da tabela -->

                    </c:forEach>     <!-- Finaliza a tag c:forEach (a espécie de loop) -->
                </table>    <!-- Finaliza uma tabela -->

                <h1>Lista de livros!!! Ricardo</h1> <!-- Exibe um título h1 -->
            </main> <!-- fecha a tag main -->
            <!-- Importação dos scripts do bootstrap -->
            <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
                integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
                crossorigin="anonymous"></script>   <!-- Declara o separate -->
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
                integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
                crossorigin="anonymous"></script>   <!-- Declara o separate -->
        </body> <!-- fecha a tag body -->

        </html> <!-- fecha a tag html -->   