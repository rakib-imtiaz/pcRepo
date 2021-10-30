<?php

$connection = mysqli_connect("localhost","root","");

$db = mysqli_select_db($connection,'pizza');


$id = $_GET['id'];

$q = " DELETE FROM `employee` WHERE id = $id ";

$query = mysqli_query($connection, $q);

header('location:employeedisplay.php');

?>