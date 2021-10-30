<?php

require_once("connect.php");
if(isset($_REQUEST["editButton"])){
 
     
//$studentid=$_REQUEST["studentid"];
$fname=$_REQUEST["fname"];
$lname=$_REQUEST["lname"];
$Dob=$_REQUEST["Dob"];
$email=$_REQUEST["email"];
$pwd=$_REQUEST["pwd"];
$mobilenumber=$_REQUEST["mobilenumber"];
$gender=$_REQUEST["gender"];
$addr=$_REQUEST["addr"];
$registration=$_REQUEST["registration"];
 
$editngID= $_REQUEST["editngID"];
    
 $upquery ="UPDATE studentinfo SET studentid='$studentid',fname='$fname',lname='$lname',Dob='$Dob',email='$email',pwd='$pwd',mobilenumber='$mobilenumber',gender='$gender',addr='$addr',registration='$registration' WHERE id=$editngID" ;
 
 
 $runquery= mysqli_query($connect,$upquery);
 
 if($runquery==true)
 {
  header("location: edit.php?edited");
  
 }
 
}

?>