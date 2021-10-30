<?php
 $host="localhost";
$dbuser="root";
    $dbpwd="";
$dbname="students_registration_infromtaion";

$connect=mysqli_connect($host,$dbuser,$dbpwd,$dbname);

if($connect== false)
{
    echo" error establishing database connection";
    
}


?>
