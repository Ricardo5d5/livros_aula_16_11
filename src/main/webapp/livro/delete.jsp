<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <!-- Indica características e define o arquivo como um jsp do java e a codificação da página -->

    <!DOCTYPE html> <!-- Define o tipo do documento -->
    <html>  <!-- Define o escopo de leitura do html -->

    <head>  <!-- Define o escopo da "cabeça" do site -->
        <meta charset="utf-8" />    <!-- Define a codificação como utf-8 -->
        <title>Deletar um Livro</title>  <!-- Define o título da página -->
        <!-- Define o estilo de css de bootstrap -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    </head> <!-- Fecha a tag head -->

    <body>  <!-- Define o corpo do site -->
        <main class="container">    <!-- Inicia a tag main (conteúdo principal do documento) -->
            <h1>Deletar um livro</h1>   <!-- Exibe um título h1 -->
            <hr>    <!-- Mostra uma linha horizontal no documento -->
            <p>tem certeza que deseja deletar o livro<em>"${livro.titulo}"</em>?</p>    <!-- Exibe um parágrafo com o nome do livro questionando a exclusão -->
            <form action="/livro/delete" method="post"> <!-- Define o formulário de exclusão -->
                <input type="hidden" name="id" value="${livro.id}" />   <!-- Cria um campo de texto oculto que automaticamente recebe o valor do id do livro -->


                <a href="/livro/list" class="btn btn-warning">Voltar</a>    <!-- Estabelece uma âncora estilizada com bootstrap -->
                <!--a href="/livro/list" class="btn btn-info">Voltar</a>
                <input type="submit" value="Deletar" class="btn btn-warning" /-->
                <input type="submit" value="Deletar" class="btn btn-danger" />   <!-- Define um valor fixo para a entrada de dados (excluir) -->
            </form> <!-- Fecha a tag form -->

        </main> <!-- Fecha a tag main -->
        <!-- Importação dos scripts do bootstrap -->
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
            integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
            crossorigin="anonymous"></script>    <!-- Declara o separate -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
            integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
            crossorigin="anonymous"></script>    <!-- Declara o separate -->

    </body> <!-- Fecha a tag body -->

    </html> <!-- Fecha a tag html -->