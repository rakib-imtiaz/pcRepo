<!DOCTYPE html>
<html lang="en">
<head>
  <title>Customer SignUp</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Sofia">
  <style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: black;
}

* {
  box-sizing: border-box;
}
.container {
  padding: 16px;
  background-color: white;
  width: 50%;
}
input[type=text], input[type=password],input[type=phone] {
  width: 100%;
  padding: 10px;
  margin: 3px 0 15px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password],input[type=phone]:focus {
  background-color: #ddd;
  outline: none;
}
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}
.registerbtn {
  background-color: red;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 1;
}
a {
  color: dodgerblue;
}
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>
</head>
<body>
<h2 style="font-family: sofia;color:red;text-align:center" >Online Pizza Delivery Managemnet System</h2>
  <form action="" method="POST">
  <center>
  <div class="container">
    <h4 style="color: red;">Sign Up Now</h4>
    <hr>
    <label for="name"><b>Name</b></label>
    <input type="text" placeholder="Enter Name" name="name" id="name" required>
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="username" id="email" required>
    <label for="phone"><b>Phone</b></label>
    <input type="phone" placeholder="Enter Phone " name="phone" id="phone" required>
    <label for="address"><b>Address</b></label>
    <input type="text" placeholder="Enter Address " name="address" id="address" required>
    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter password" name="password" id="password" required>

    <button type="submit" class="registerbtn" name="done">Sign Up</button>
  </div>
  
  <div class="container signin">
    <p>Already have an account? <a href="signin.php">Sign in</a>.</p>
  </div>
  </center>.
</form>
</body>
</html>
<?php

$connection = mysqli_connect("localhost","root","");

$db = mysqli_select_db($connection,'pizza');
error_reporting(0);
if(isset($_POST['done'])){
    $name = $_POST['name'];
    $username = $_POST['username'];
    $phone = $_POST['phone'];
    $address = $_POST['address'];
	  $password = $_POST['password'];

$q="INSERT INTO `user`(`name`,`username` , `phone` , `address` ,`password`  ) VALUES ('$name','$username' ,'$phone','$address','$password')";

 $query = mysqli_query($connection,$q);

 if($query)
 {
     echo '<script> alert("Your are Sign Up Successfully")</script>';
 }
 else
 {
    echo '<script> alert("Your are not Sign Up Successfully")</script>';
}
}
?>