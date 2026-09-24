<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <style>
        /* Modern Reset and Centering */
        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        body {
            background: linear-gradient(135deg, #7af2cd, #4aae9b);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        /* Login Card Container */
        .login-container {
            background-color: #ffffff;
            padding: 2.5rem;
            border-radius: 12px;
            box-shadow: 0 8px 24px rgba(0, 0, 0, 0.15);
            width: 100%;
            max-width: 400px;
        }

        .login-container h2 {
            margin-bottom: 1.5rem;
            color: #333333;
            text-align: center;
            font-size: 1.8rem;
        }

        /* Error Message Styling */
        .error-message {
            background-color: #ffe6e6;
            color: #d93025;
            padding: 0.75rem;
            border-radius: 6px;
            border: 1px solid #fcc;
            margin-bottom: 1.25rem;
            font-size: 0.9rem;
            text-align: center;
        }

        /* Form Layout */
        .input-group {
            margin-bottom: 1.25rem;
            display: flex;
            flex-direction: column;
        }

        .input-group label {
            margin-bottom: 0.5rem;
            color: #666666;
            font-size: 0.9rem;
            font-weight: 600;
        }

        /* Input Fields */
        .input-group input {
            padding: 0.75rem;
            border: 1px solid #cccccc;
            border-radius: 6px;
            font-size: 1rem;
            transition: border-color 0.3s, box-shadow 0.3s;
            outline: none;
        }

        .input-group input:focus {
            border-color: #4aae9b;
            box-shadow: 0 0 0 3px rgba(74, 174, 155, 0.2);
        }

        /* Submit Button */
        .submit-btn {
            width: 100%;
            padding: 0.75rem;
            background-color: #4aae9b;
            color: white;
            border: none;
            border-radius: 6px;
            font-size: 1rem;
            font-weight: bold;
            cursor: pointer;
            transition: background-color 0.3s, transform 0.1s;
            margin-top: 0.5rem;
        }

        .submit-btn:hover {
            background-color: #388576;
        }

        .submit-btn:active {
            transform: scale(0.98);
        }
    </style>
</head>
<body>

<div class="login-container">
    <h2>Welcome Back</h2>

    <%
        String msg = (String) request.getAttribute("message");
        if(msg != null) {
    %>
    <div class="error-message"><%= msg %></div>
    <%
        }
    %>

    <form action="./check" method="post">
        <div class="input-group">
            <label for="username">Username</label>
            <input type="text" id="username" name="username" placeholder="Enter your username" required>
        </div>

        <div class="input-group">
            <label for="password">Password</label>
            <input type="password" id="password" name="password" placeholder="Enter your password" required>
        </div>

        <button type="submit" class="submit-btn">Login</button>
    </form>
</div>

</body>
</html>
