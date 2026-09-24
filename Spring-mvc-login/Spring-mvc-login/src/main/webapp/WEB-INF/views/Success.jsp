<html>
<head>
    <title > Success Page </title>
    <style>
    body {
    background: linear-gradient(135deg, #7af2cd, #4aae9b);
    /*height: 100vh;*/
    /*display: flex;*/
    /*justify-content: center;*/
    /*align-items: center;*/
    }
    </style>
</head>

<body>
Welcome ${username}, <br>
Your Login time : <%= java.time.LocalDateTime.now() %>

</body>
</html>