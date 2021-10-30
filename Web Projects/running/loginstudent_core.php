<?php
require_once("connect.php");

$userinputname=$_REQUEST["username"];
$userinputpwd=$_REQUEST["pwd"];
$userview=$_REQUEST["fname"];

$matchquery="SELECT * FROM studentinfo WHERE email='$userinputname' AND pwd='$userinputpwd' AND fname='$userview'";

$runmatchquery=mysqli_query($connect,$matchquery);
$checkcount=mysqli_num_rows($runmatchquery);

if($runmatchquery==true)
{
   if($checkcount===1)
{
     setcookie("currentuser","$userinputname",time()+(86400*7));
    header("location: studentprofile.php"); 
} 
    
    
}

    

else
{
    
 header("location:studentlogin.php?wrong_info"); 
}


?>