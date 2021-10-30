<?php

$dbuser="noman123";
$dbpwd="1234567";


$userinputname=$_REQUEST["username"];
 $userinputpwd=$_REQUEST["pwd"];

if($dbuser===$userinputname && $dbpwd===$userinputpwd)
{
    setcookie("currentuser","$userinputname",time()+(86400*7));
    header("location: adminprofilepage.php"); 
}

else
{
    
 header("location: adminlogin.php?wrong_info"); 
}


?>