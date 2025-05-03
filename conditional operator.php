<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Conditional operator</title>
</head>
<body>
    <?php
        $a = 10;
        $b = 20;

        $result = ($a > $b) ? $a :$b;

        echo "Test1 : Value of result is $result<br/>";

        $result = ($a < $b) ? $a : $b;

        echo "Test2 : Value of result is $result<br/>"

        ?>
</body>
</html>