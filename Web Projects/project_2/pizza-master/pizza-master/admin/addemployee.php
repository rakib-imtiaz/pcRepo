
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: #333;
}
.topnav a {
  float: left;
  display: block;
  color: red;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #4CAF50;
  color: white;
}

.topnav .icon {
  display: none;
}

@media screen and (max-width: 600px) {
  .topnav a:not(:first-child) {display: none;}
  .topnav a.icon {
    float: right;
    display: block;
  }
}

@media screen and (max-width: 600px) {
  .topnav.responsive {position: relative;}
  .topnav.responsive .icon {
    position: absolute;
    right: 0;
    top: 0;
  }
  .topnav.responsive a {
    float: none;
    display: block;
    text-align: left;
  }
}


.container {
  border: 2px solid #ccc;
  background-color: #eee;
  border-radius: 5px;
  padding: 16px;
  width: 50%;
  margin-left: 25%;

 
}
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
}

@media (max-width: 500px) {
  .container {
      text-align: center;
  }
  .container img {
      margin: auto;
      float: none;
      display: block;
  }
}
</style>
</head>
<body>

<div class="topnav" id="myTopnav">
  <a href="dashboard.php">Home</a>
  <a href="orderview.php">Order</a>
  <a href="employeedisplay.php" class="active" style="background-color: red;">Employee</a>
  <a href="feedback.php">Feedback</a>
  <a href="logout.php">logout</a>
  <a href="javascript:void(0);" class="icon" onclick="myFunction()">
    <i class="fa fa-bars"></i>
  </a>
</div>
<div class="container">
<div class="w3-card-4">
  <div class="w3-container w3-red">
    <h2>Insert Employee</h2>
  </div>
  <form class="w3-container" action="" method="POST">
    <p>      
    <label class="w3-text-red"><b>Name</b></label>
    <input class="w3-input w3-border w3-sand" name="name" type="text" ></p>
    <p>      
    <label class="w3-text-red"><b>Email</b></label>
    <input class="w3-input w3-border w3-sand" name="username" type="email" ></p>
    <p>      
    <label class="w3-text-red"><b>Phone</b></label>
    <input class="w3-input w3-border w3-sand" name="phone" type="text" ></p>
    <p>      
    <label class="w3-text-red"><b>Passowrd</b></label>
    <input class="w3-input w3-border w3-sand" name="password" type="text"></p>
    <p>
    <button class="w3-btn w3-red" name="done">Submit</button></p>
  </form>
</div>


</div>











<script>
function myFunction() {
  var x = document.getElementById("myTopnav");
  if (x.className === "topnav") {
    x.className += " responsive";
  } else {
    x.className = "topnav";
  }
}
</script>

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
    $password = $_POST['password'];
$q="INSERT INTO `employee`(`name`,`username` , `phone` , `password`) VALUES ('$name','$username' ,'$phone','$password')";

 $query = mysqli_query($connection,$q);

 if($query)
 {
     echo '<script> alert(" Successful")</script>';
 }
 else
 {
    echo '<script> alert(" Failed")</script>';
}
}
?>