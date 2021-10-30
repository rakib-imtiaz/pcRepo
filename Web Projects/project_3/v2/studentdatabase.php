<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Document</title>
    
    <style> body {background-image:url(
    img/background.jpg); opacity:.9; background-repeat:no-repeat;background-size: cover} </style>

</head>
<body>
   
 
    <table border="2px" style="background:pink; width:1000px; height:350px; margin-top:150px; margin-left:150px;">
        <tr align="center">

            <td>Student ID</td>
            <td>First Name</td>
            <td>Last Name</td>
            <td>Date of Birth</td>
            <td>Email Id</td>
            <td>Password</td>
            <td>Mobile Number</td>
            <td>Gender</td>
            <td>Address</td>
            <td>Date of Registration</td>
            <td>Profile picture</td>
        </tr>
        <?php
         require_once("connect.php");
         
         $showDataQuery="SELECT * FROM studentinfo";
         $rundataquery=mysqli_query ($connect,$showDataQuery);
         if($rundataquery==true)
         { 
             
             
             while($mydata=mysqli_fetch_array($rundataquery))
             { ?>
        <tr>
            <td> <?php echo $mydata["studentid"];?></td>
            <td> <?php echo $mydata["fname"];?></td>
            <td> <?php echo $mydata["lname"];?></td>
            <td> <?php echo $mydata["Dob"];?></td>
            <td> <?php echo $mydata["email"];?></td>
            <td> <?php echo $mydata["pwd"];?></td>
            <td> <?php echo $mydata["mobilenumber"];?></td>
            <td> <?php echo $mydata["gender"];?></td>
            <td> <?php echo $mydata["addr"];?></td>
            <td> <?php echo $mydata["registration"];?></td>
    <td>
<center><img width="60px" src="avatar/<?php echo $mydata["avatar"];?>" alt="" /></center>
            </td>


            <?php
             }}?>

    </table>








</body>

</html>