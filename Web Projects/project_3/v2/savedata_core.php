<?php
require_once("connect.php");


if(isset($_REQUEST["studentid"])&& 
   isset($_REQUEST["fname"])&&
   isset($_REQUEST["lname"])&&
   isset($_REQUEST["Dob"])&&
   isset($_REQUEST["email"])&&
   isset($_REQUEST["pwd"])&&
   isset($_REQUEST["mobilenumber"])&&
   isset($_REQUEST["gender"])&&
   isset($_REQUEST["addr"])&&
   isset($_REQUEST["registration"])
  )
    
{ 
   
   
$studentid=$_REQUEST["studentid"];
$fname=$_REQUEST["fname"];
$lname=$_REQUEST["lname"];
$Dob=$_REQUEST["Dob"];
$email=$_REQUEST["email"];
$pwd=$_REQUEST["pwd"];
$mobilenumber=$_REQUEST["mobilenumber"];
$gender=$_REQUEST["gender"];
$addr=$_REQUEST["addr"];
$registration=$_REQUEST["registration"];
   
$avatar_name= $_FILES["avatar"]["name"];
$avatar_tmpName= $_FILES["avatar"] ["tmp_name"];
$location = "avatar/";
   
move_uploaded_file($avatar_tmpName,$location."$avatar_name");
   
   
   
    
 $insertquery ="INSERT INTO studentinfo(studentid,fname,lname,Dob,email,pwd,mobilenumber,gender,addr,registration,avatar) VALUES ('$studentid','$fname','$lname','$Dob','$email','$pwd','$mobilenumber','$gender','$addr','$registration','$avatar_name')" ;
    
 
 $runquery=mysqli_query($connect,$insertquery);
   if($runquery==true)
   {
      
      header("location: registrationform.php?action=true");
      
   }
   else{
            header("location: registrationform.php?action=false");

   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
    }


?>