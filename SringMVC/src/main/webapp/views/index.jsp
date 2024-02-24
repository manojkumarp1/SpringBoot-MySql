<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simple Form</title>
</head>
<body>

    <h1>Simple Form</h1>

    <form action="addAlien" method="post">
        
        <label for="input1">Enter your Id:</label>
        <input type="text" id="input1" name="id" required>
        <br>

        
        <label for="input2">Enter your name:</label>
        <input type="text" id="input2" name="aname" required>
        <br>
       
        <input type="submit" value="Submit">
    </form>


    <form action="getName" method="post">
        
        

        
        <label for="input2">Enter your name:</label>
        <input type="text" id="input2" name="aname" required>
        <br>
       
        <input type="submit" value="Submit">
    </form>



</body>
</html>
