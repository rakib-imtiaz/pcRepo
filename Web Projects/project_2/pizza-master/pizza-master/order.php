<?php
session_start();
error_reporting(0);
if(!isset($_SESSION['username']))
{
	header('location:dashboard.php');
}
?>
<?php
$connection = mysqli_connect("localhost","root","");
$db = mysqli_select_db($connection,'pizza');
if(isset($_SESSION['username'])){
  $username =$_SESSION['username'];
  $query = "SELECT * FROM user WHERE username = '{$username}'";
  $select_user_profile_query = mysqli_query($connection,$query);

  while($row = mysqli_fetch_array($select_user_profile_query)){
    $id = $row['id'];
    $name = $row['name'];
    $user = $row['username'];
    $phone = $row['phone'];
    $address = $row['address'];

  }
  
}
?>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
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
  width: 60%;
  margin-left: 20%;
}


</style>
</head>
<body>

<div class="topnav" id="myTopnav">
  <a href="dashboard.php">Home</a>
  <a href="order.php" style="background-color: red;" class="active">Order</a>
  <a href="display.php">History</a>
  <a href="feedback.php">FeedBack</a>
  <a href="logout.php">Logout</a>
  <a href="javascript:void(0);" class="icon" onclick="myFunction()">
    <i class="fa fa-bars"></i>
  </a>
</div>



<div class="container">
<form class="w3-container" action="" method="POST">
    <p>      
    <label class="w3-text-red"><b>Name</b></label>
    <input class="w3-input w3-border w3-sand" value="<?php echo "$name" ?>" name="name"></p>
    <p>      
    <label class="w3-text-red"><b>Email</b></label>
    <input class="w3-input w3-border w3-sand" value="<?php echo "$username" ?>" name="username"></p>
    <p>      
    <label class="w3-text-red"><b>Phone</b></label>
    <input class="w3-input w3-border w3-sand" value="<?php echo "$phone" ?>" name="phone"></p>
    <p>      
    <label class="w3-text-red"><b>Address</b></label>
    <input class="w3-input w3-border w3-sand" value="<?php echo "$address" ?>" name="address"></p>

    <p>   
    <div class="form-group row">
  <div class="col-xs-4">
  <label class="input-group-text">Order 1</label>
<select class="form-control"  name="o1" >
  <option >--</option>
  <option value="Pizza Mania">Pizza BBQ</option>
</select>
  </div>
  <div class="col-xs-2">
    <label for="ex3">Quantity</label>
    <input class="form-control" onchange="calculateAmount1(this.value)"  name="q1">
  </div>
  <div class="col-xs-2">
    <label for="ex3">Total</label>
    <input class="form-control" name="tot_amount1" id="tot_amount1" type="text" readonly >
  </div>
  <div class="col-xs-3">
  <label class="input-group-text">Extra</label>
<select class="form-control" name="e1" >
  <option >--</option>
  <option value="Cheese">Extra Cheese</option>
  <option value="souse">Extra Souse</option>
</select>
  </div>
</div>
</p>


<p>   
    <div class="form-group row">
  <div class="col-xs-4">
  <label class="input-group-text">Order 2</label>

<select class="form-control"   name="o2">
  <option >--</option>
  <option value="Chicken cheesy">Chicken cheesy</option>
</select>
  </div>
  <div class="col-xs-2">
    <label for="ex3">Quantity</label>
    <input class="form-control" onchange="calculateAmount2(this.value)" name="q2" >
  </div>
  <div class="col-xs-2">
    <label for="ex3">Total</label>
    <input class="form-control" name="tot_amount2" id="tot_amount2" type="text" readonly >
  </div>
  <div class="col-xs-3">
  <label class="input-group-text">Extra</label>
<select class="form-control"  name="e2">
  <option >--</option>
  <option value="Cheese">Extra Cheese</option>
  <option value="souse">Extra Souse</option>
</select>
  </div>
</div>
</p>
<button  class="btn btn-success" name="Sumbit" id="calculate"> <a href="#" style="text-decoration: none;color:white">Count Total</a></button><br>
<div class="form-group row">
<div class="col-xs-3">
    <label for="ex3">Grand Total</label>
    <input class="form-control" name="total" id="answer" type="text" readonly>
  </div>
</div>




    <p>
    <button class="w3-btn w3-red" name="done">Go For Order</button></p>
  </form>
</div>







<script>
            function calculateAmount1(val) {
                var tot_price1 = val * 600;
                var divobj = document.getElementById('tot_amount1');
                divobj.value = tot_price1;
            }
        </script>
<script>
            function calculateAmount2(val) {
                var tot_price2 = val * 500;
                var divobj = document.getElementById('tot_amount2');
                divobj.value = tot_price2;
            }
        </script>



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


<script>
      $(document).ready(function(){
      $("#calculate").click(function () {
      var tot_amount1= $("#tot_amount1").val();
      var tot_amount2 = $("#tot_amount2").val();
      var answer = parseInt(tot_amount1) + parseInt(tot_amount2);
      alert(answer);
      $("#answer").val(answer);
    });
  });
  </script>

</body>
</html>
<?php

$connection = mysqli_connect("localhost","root","");

$db = mysqli_select_db($connection,'pizza');
if(isset($_POST['done'])){
    $name = $_POST['name'];
    $username = $_POST['username'];
    $phone = $_POST['phone'];
    $address = $_POST['address'];
      $o1 = $_POST['o1'];
      $q1 = $_POST['q1'];
      $tot_amount1 = $_POST['tot_amount1'];
      $e1 = $_POST['e1'];
      $o2 = $_POST['o2'];
      $q2 = $_POST['q2'];
      $tot_amount2 = $_POST['tot_amount2'];
      $e2 = $_POST['e2'];
      $total = $_POST['total'];
      $status = $_POST['pending'];

$q="INSERT INTO `orderp`(`name`,`username` , `phone` , `address` ,`o1`,`q1`,`tot_amount1`,`e1`,`o2`,`q2`,`tot_amount2`,`e2`,`total`,`status`) VALUES ('$name','$username' ,'$phone','$address','$o1','$q1','$tot_amount1','$e1','$o2','$q2','$tot_amount2','$e2','$total','Pending')";

 $query = mysqli_query($connection,$q);

 if($query)
 {
     echo '<script> alert("Your order is placed")</script>';
 }
 else
 {
    echo '<script> alert("Your order are not placed")</script>';
}
}
?>