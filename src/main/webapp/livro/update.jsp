<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <!-- Indica características e define o arquivo como um jsp do java e a codificação da página -->

    <!DOCTYPE html> <!-- Define o tipo do documento -->
    <html>  <!-- Define o escopo de leitura do html -->

    <head>  <!-- Define o escopo da "cabeça" do site -->
        <meta charset="utf-8" />    <!-- Define a codificação como utf-8 -->
        <title>Editar Livro</title> <!-- Define o título da página -->
         <!-- Define o estilo de css de bootstrap -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head> <!-- Fecha a tag head -->

    <body>  <!-- Define o corpo do site -->
        <h1>Editar Livro</h1>   <!-- Exibe um título h1 -->
        <hr>    <!-- Mostra uma linha horizontal no documento -->
        <form action="/livro/update" method="post"> <!-- Define o formulário de exclusão -->
            <input type="hidden" name="id" value="${livro.id}" />
            <label for="titulo">Título</label>  <!-- Define um rótulo para o input -->

            <input type="text" name="titulo" value="${livro.titulo}" />  <!-- Fornece um campo para entrada de dados, no caso o nome de um livro que deseja inserir -->
            <a href="/livro/list" class="btn btn-warning">Voltar</a>
            <input type="submit" value="Salvar" class="btn btn-success" />
        </form>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
            integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
            crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
            integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
            crossorigin="anonymous"></script>

    </body>

    </html>