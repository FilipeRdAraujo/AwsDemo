<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://kit.fontawesome.com/6697f5eca6.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="./assets/css/style.css">
    <title>Home</title>
</head>

<body>
    <header id="header" class="container-fluid text-light">
        <section class="row">
            <div class="col-md p-4 text-center d-grid">
                <div class="user-profile"></div>
                <h1>Nome</h1>
            </div>
        </section>
    </header>
    <div class="wave-column"></div>
    <div class="container-fluid text-light">
        <section class="row">
            <div class="col-md p-2 text-center">
                <h2>Envie a capa de um filme</h2>
                <input class="input-group" type="file">
                <button class="btn btn-primary">ENVIAR</button>
            </div>
        </section>
    </div>
    <div class="container-fluid text-light">
        <section class="row">
            <div class="col-md text-center p-4">
                <h2>Lista de filmes</h2>
            </div>
        </section>
        <section class="row mb-4">
            <ul class="card-group d-flex">
                <c:forEach items="${images}" var="item">
                    <li class="card">
                        <img class="card-img" src="https://dr4-s3-bucket-f.s3-sa-east-1.amazonaws.com/${item.getKey().toString()}" alt="capa do filme">
                        <div>
                            <a style="width: 100%;" class="btn btn-secondary" href="/deleteFile?url=${item.getKey().toString()}" type="button"><i class="fas fa-trash"></i></a>
                        </div>
                    </li>
                </c:forEach>
            </ul>
        </section>

        <footer id="footer" class="row">
            <div class="col-md p-4 text-light">
                <h2>Footer aqui.</h2>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Provident nemo reiciendis odio error aliquid
                    incidunt iusto asperiores, velit rerum temporibus voluptatum tempore iure, cupiditate eius beatae
                    assumenda. Aut, consequuntur cumque!</p>
            </div>
        </footer>
    </div>
</body>

</html>