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

.container::after {
  content: "";
  clear: both;
  display: table;
}

.container img {
  float: left;
  margin-right: 20px;
  border-radius: 0%;
}

.container span {
  font-size: 20px;
  margin-right: 15px;
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
  <a href="dashboard.php" class="active" style="background-color: red;">Home</a>
  <a href="order.php">Order</a>
  <a href="display.php">History</a>
  <a href="feedback.php">FeedBack</a>
  <a href="logout.php">Logout</a>
  <a href="javascript:void(0);" class="icon" onclick="myFunction()">
    <i class="fa fa-bars"></i>
  </a>
</div>


<div class="container">
  <img src="p1.jpg" alt="Avatar" style="width:10%">
  <p><span>Pizza Mania</span> Size In Medium<h4>350</h4></p>
</div>
<div class="container">
  <img src="p3.jpg" alt="Avatar" style="width:10%">
  <p><span>Chicken Cheesy</span> Size In Medium<h4>500</h4></p>
</div>
<div class="container">
  <img src="p1.jpg" alt="Avatar" style="width:10%">
  <p><span>Pizza BBQ</span> Size In Medium<h4>600</h4></p>
</div>
<div class="container">
  <img src="p3.jpg" alt="Avatar" style="width:10%">
  <p><span>Pizza Veg</span> Size In Medium<h4>300</h4></p>
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
