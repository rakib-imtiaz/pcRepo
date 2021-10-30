<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

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
  margin: 16px 0 0 30px;
  width: 50%;
}

table {
  width:100%;
}
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
  text-align: left;
}
#t01 tr:nth-child(even) {
  background-color: #eee;
}
#t01 tr:nth-child(odd) {
 background-color: #fff;
}
</style>
</head>
<body>
<div class="topnav" id="myTopnav">
  <a href="dashboard.php" >Home</a>
  <a href="orderview.php">Order</a>
  <a href="employeedisplay.php">Employee</a>
  <a href="feedback.php" class="active" style="background-color: red;">Feedback</a>
  <a href="logout.php">logout</a>
  <a href="javascript:void(0);" class="icon" onclick="myFunction()">
    <i class="fa fa-bars"></i>
  </a>
</div>

<table>
    <tr>
        <th colspan="5" style="text-align: center;"><b>Customer Feedback</b> </th>
    </tr>
  <tr>
  <th style="text-align: center;">Id</th>
        <th style="text-align: center;">Name</th>
        <th style="text-align: center;">Email </th>
        <th style="text-align: center;">Phone</th>
        <th style="text-align: center;">Subject</th>
  </tr>
  <?php

$connection = mysqli_connect("localhost","root","");

$db = mysqli_select_db($connection,'pizza');
error_reporting(0);

 $sql = "select * from feedback ";

 $query = mysqli_query($connection,$sql);

 while($res = mysqli_fetch_array($query)){
 ?>
 <tr class="text-center">
 <td style="text-align:center"> <?php echo $res['id'];  ?> </td>
 <td style="text-align:center"> <?php echo $res['name'];  ?> </td>
 <td style="text-align:center"> <?php echo $res['username'];  ?> </td>
 <td style="text-align:center"> <?php echo $res['phone'];  ?> </td>
 <td style="text-align:center"> <?php echo $res['subject'];  ?> </td>

 <?php 
 }
  ?>
</table>














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
