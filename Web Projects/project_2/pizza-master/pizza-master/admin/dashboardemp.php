<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

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
  width:80%;
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
  <a href="dashboardemp.php" class="active" style="background-color: red;">Home</a>
  <a href="orderviewemp.php">Order</a>
  <a href="logout.php">logout</a>
  <a href="javascript:void(0);" class="icon" onclick="myFunction()">
    <i class="fa fa-bars"></i>
  </a>
</div>

<center>
<table>
  <tr>
    <th colspan="14" style="text-align: center;">Order Information</th>
  </tr>
  <tr>
  <th style="text-align: center;">Id</th>
        <th style="text-align: center;">Name</th>
        <th style="text-align: center;">Email </th>
        <th style="text-align: center;">Phone</th>
        <th style="text-align: center;">Address</th>
        <th style="text-align: center;">Order 1</th>
        <th style="text-align: center;">Quantity</th>
        <th style="text-align: center;">Extra</th>
        <th style="text-align: center;">Order 2</th>
        <th style="text-align: center;">Quantity</th>
        <th style="text-align: center;">Extra</th>
        <th style="text-align: center;">Total</th>
        <th style="text-align: center;">Status</th>
        <th style="text-align: center;">Action</th>
  </tr>
  <?php

$connection = mysqli_connect("localhost","root","");
$db = mysqli_select_db($connection,'pizza');
error_reporting(0);
 $q = "select * from orderp  ";
 error_reporting(0);
 $query = mysqli_query($connection,$q);
 $total = mysqli_num_rows($query );
 if($total!=0)
 {
  while($result = mysqli_fetch_assoc($query))
  {
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
      <td style='text-align:center'>" .$result['status']. "</td>
      <td style='text-align:center'><a href='update1.php?id=$result[id]&status=$result[status]'><button type='button' class='btn btn-info'>Action</button> </a> </td>
     
     
     </tr>
      ";
  }
 }
else
{
  echo " No records Found";
}
?>


</table>
</center>













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
