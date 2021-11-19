<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />

        <title>Novo Livro</title>
      
    </head>
    <body>
        <h1>Novo Livro</h1>
        <hr>
        <form action="insert" method="post">
            <label for="titulo">Título</label>
            <input type="text" name="titulo"/>

            <a href="/livro/list">Voltar</a>
            <input type="submit" value="Salvar"/>
        </form>
        </body>
</html>