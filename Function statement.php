<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Function statements</title>
</head>
<body>
    <?php
       function swap(&$x , &$y)
       {
            $t = $x;
            $x = $y;
            $y = $t;
       }
       $a = 10; $b = 20;
       echo "before swap a=$a, b=$b<br>";
       swap($a,$b);
       echo "after swap a=$a, b=$b<br>";
       ?>
</body>
</html>