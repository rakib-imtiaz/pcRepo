<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
   
   <table border="1px" height="500px" width="500px">
      <th><h1> welcome admin 
      <?php
          if(isset($_COOKIE["currentuser"]))
          {
              echo $_COOKIE["currentuser"];
          }
          ?>
      
      
      
      
      </h1></th>
       <tr>
           <td><a href="registrationform.php">Student Registration</a></td>
       </tr>
       <tr>
           <td><a href="studentdatabase.php">Student Database</a></td>
       </tr>
       <tr>
           <td><a href="edit.php">Edit Database</a></td>
       </tr>
       <tr>
           <td><a href="">Informations</a></td>
       </tr><tr>
           <td><a href="">Search students</a></td>
       </tr>
       <tr>
           <td><a href="homepage.php">logout</a></td>
       </tr>
   </table>
   
   
    
</body>
</html>