<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <title>Exit</title>
</head>
<body style="background-image:url('background.jpeg')">
<audio class="position-absolute bottom-0 start-0" src="champions.mp3" controls="true"></audio>

<h3 class="text-center"><%= "В этой викторине ты был лучшим, можешь послушать гимн Лиги Чемпионов и насладиться собой!" %>

<form action="restart" method="get">
  <div class="d-grid gap-2 col-6 mx-auto">
    <input class="btn btn-outline-primary" type="submit" value="Начать новую игру">
  </div>
</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
