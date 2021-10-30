<?php

require_once("connect.php");


$getid = $_REQUEST["studentid"];

$dltquery ="DELETE FROM studentinfo WHERE studentid=$getid";

$runDlquery=mysqli_query($connect,$dltquery);

if($runDlquery==true)
{
    
    header("location: edit.php?deleted");
    
}







?>