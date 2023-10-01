<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <title>Quest</title>
</head>
<body style="background-image:url('background.jpeg')">
<h1 class="text-center"><%= "Привет, дорогой друг! Сегодня у нас с тобой будет викторина на футбольную тематику." %>
</h1>
<br/>
<h3 class="text-center"><%= "Ты готов начать игру?" %>
</h3>
<br/>

<video class="position-absolute top-50 start-50 translate-middle-x" width="700" height="800" controls="controls">
    <source src="video.mp4" type="audio/mp4">
</video>


<div class="d-grid gap-2 col-4 mx-auto">
    <button class="btn btn-outline-success" onclick="location.href='/quest.jsp'">Да</button>
    <button class="btn btn-outline-danger" onclick="location.href='/exit.jsp'">Нет</button>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>