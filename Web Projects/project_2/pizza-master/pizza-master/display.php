<?php
session_start();
?>
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
  <a href="dashboard.php" >Home</a>
  <a href="order.php">Order</a>
  <a href="display.php" class="active" style="background-color: red;">History</a>
  <a href="feedback.php">FeedBack</a>
  <a href="logout.php">Logout</a>
  <a href="javascript:void(0);" class="icon" onclick="myFunction()">
    <i class="fa fa-bars"></i>
  </a>
</div>

<div class="container">

<table style="width:100%">
<tr>
  <th colspan="13" style="text-align: center;">Order History</th>
</tr>
  <tr>
    <th>Order Id</th>
    <th>Name</th> 
    <th>Email</th>
    <th>Phone</th>
    <th>Address</th>
    <th>Order 1</th>
    <th>Quantity</th>
    <th>Extra</th>
    <th>Order 2</th>
    <th>Quantity</th>
    <th>Extra</th>
    <th>Total</th>
    <th>Status</th>
  </tr>
  <?php

$connection = mysqli_connect("localhost","root","");

$db = mysqli_select_db($connection,'pizza');
error_reporting(0);

$res = mysqli_query($connection,"select * from orderp where username='$_SESSION[username]'");
while($result = mysqli_fetch_array($res)){
  echo"
  <tr>
  <td style='text-align:center'>" .$result['id']. "</td>
  <td style='text-align:center'>" .$result['name']. "</td>
  <td style='text-align:center'>" .$result['username']. "</td>
  <td style='text-align:center'>" .$result['phone']. "</td>
  <td style='text-align:center'>" .$result['address']. "</td>
  <td style='text-align:center'>" .$result['o1']. "</td>
  <td style='text-align:center'>" .$result['q1']. "</td>
  <td style='text-align:center'>" .$result['e1']. "</td>
  <td style='text-align:center'>" .$result['o2']. "</td>
  <td style='text-align:center'>" .$result['q2']. "</td>
  <td style='text-align:center'>" .$result['e2']. "</td>
  <td style='text-align:center'>" .$result['total']. "</td>
  <td style='text-align:center;color:red'>" .$result['status']. "</td>
 </tr>
      ";
 }
     ?>
  
</table>
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
