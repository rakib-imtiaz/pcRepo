<?php
$connection = mysqli_connect("localhost","root","");
$db = mysqli_select_db($connection,'pizza');
error_reporting(0);
$id = $_GET['id'];
$status = $_GET['status'];
?>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
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
  <a href="dashboard.php" class="active" style="background-color: red;">Home</a>
  <a href="orderviewemp.php">Order</a>
  <a href="logout.php">logout</a>
  <a href="javascript:void(0);" class="icon" onclick="myFunction()">
    <i class="fa fa-bars"></i>
  </a>
</div>
<div class="container">
  <form method="GET">
<p>      
    <label class="w3-text-red"><b>Order Id</b></label>
    <input class="w3-input w3-border w3-sand" value="<?php echo "$id" ?>" name="id" readonly></p>
<div class="form-group row">

<div class="col-xs-5">
  <label class="input-group-text">Go For Action</label>
<select class="form-control"  name="status">
  <option><?php echo "$status" ?></option>
  <option value="On The Way">On The Way</option>
  <option value="Delivered">Delivered</option>
  <option value="Deliverey Failed">Deliverey Failed</option>
</select><br>
<button type='submit' class='btn btn-success' name="done">Action</button>
  </div>
</div>
  </form>
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
if(isset($_GET['done'])){
    $id = $_GET['id'];
    $status = $_GET['status'];
    
       $q = "update orderp set id='$id', status='$status' where id=$id";
       $query = mysqli_query($connection,$q);
       if($query)
 {
     echo '<script> alert(" Order Update")</script>';
 }
 else
 {
    echo '<script> alert("Order Not Update")</script>';
}
    }
      
   
?>