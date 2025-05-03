<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Assignment operator</title>
</head>
<body>
    <?php
      $a = 42;
      $b = 20;
      $c = $a + $b; /*Assignment operator*/
      echo "Addition operation Result: $c <br/>";

      $c += $a; /* c value was 42 + 20= 62*/
      echo "Add and Assignment operation result: $c <br/>";
      
      $c -= $a; /* c value was 42+20+42=104*/
      echo "Subtract and Assignment operation result: $c <br/>";
       
      $c *= $a; /* c value was 104-42=62*/
      echo "Multiply and Assignment Operation result: $c <br/>";

      $c /= $a; /*c value was 62 * 42 */
      echo "Division and Assignment Operation result:  $c <br/>";

      $c %= $a; /* c value was 2604/42 */
      echo "Modulus and Assignment Operation result: $c <br/>";

      ?>
      
</body>
</html>