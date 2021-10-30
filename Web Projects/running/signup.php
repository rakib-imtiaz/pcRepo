<?php

require_once('connection.php'); 


if(isset($_POST['submit']))


{
    if (empty($_POST['Firstname']) || empty($_POST['Lastname']) || empty($_POST['Username']) || empty($_POST['email']) || empty($_POST['studentid']) || empty($_POST['Gender'])|| empty($_POST['password']))
    
    {
        header("location:../signup.php?empty");
        exit();
    }
    else
    {
     $Firstname=mysql_real_escape_string($con,$_POST['Firstname']);
     $Lastname=mysql_real_escape_string($con,$_POST['Lastname']);
     $Username=mysql_real_escape_string($con,$_POST['Username']);
     $email=mysql_real_escape_string($con,$_POST['email']);
     $studentid=mysql_real_escape_string($con,$_POST['studentid']);
     $Gender=mysql_real_escape_string($con,$_POST['Gender']);
     $password=mysql_real_escape_string($con,$_POST['password']);
        if(preg_match("/^[a-zA-Z]*$/",$Firstname) || preg_match("/^[a-zA-Z]*$/",$Lastname) )
        {
           header("location:../studentsreg.php?Invalid") ;
            exit();

        }
        else
        {
            if(!filter_var($email,FILTER_VALIDATE_EMAIL))
            {
                header("location:../studentsreg.php?email") ;
                exit();


                
            }
             else
             {
                 
                 $query="Select *from studentinfo where UserName='".$Username."'";
                 $result=mysqli_query($con,$query);
                 
                 if(mysqli_fetch_assoc($result))
                 {
                     header("location:../studentsreg.php?Username") ;
                     exit();
                     
                 }
                 
                 else
                 {
                     $Hash = password_hash($password,PASSWORD_DEFAULT);
                     $query="insert into studentinfo(Firstname,Lastname,Username,email,studentid,Gender,password) values ('$Firstname','$Lastname','$Username','$email','$studentid','$Gender','$password')";
                     $result= mysqli_query($con,$query);
                     header("location:../studentsreg.php?sucess") ;
                     exit();

                     
                     
                 }
                 
             }
            
        }
        
        
        
    }
    
    
}



?>