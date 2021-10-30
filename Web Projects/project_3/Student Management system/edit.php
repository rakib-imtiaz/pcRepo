<!--This script is for Deleting data which will be included in the admin panel-->


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>

<body>

   <?php
   if(isset($_REQUEST["deleted"])) 
   {
       
       echo "Data hasbeen deleted";
   }
    
    ?>
   
    <table border="2px" >
        <tr>
            <td>student Id</td>
            <td>First Name</td>
            <td>last Name</td>
            <td>Date of Birth</td>
            <td>Email Id</td>
            <td>Password</td>
            <td>Mobile Number</td>
            <td>Gender</td>
            <td>Address</td>
            <td>Date of Registration</td>
            <td>Action</td>
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
            <td><?php echo $mydata["studentid"];?></td>
            <td><?php echo $mydata["fname"];?></td>
            <td><?php echo $mydata["lname"];?></td>
            <td><?php echo $mydata["Dob"];?></td>
            <td><?php echo $mydata["email"];?></td>
            <td><?php echo $mydata["pwd"];?></td>
            <td><?php echo $mydata["mobilenumber"];?></td>
            <td><?php echo $mydata["gender"];?></td>
            <td><?php echo $mydata["addr"];?></td>
            <td><?php echo $mydata["registration"];?></td>
            
            <td> <a href="editdata.php?edit_id=<?php echo $mydata["studentid"];?>">Edit</a> | 
            <a onclick="return confirm('Are you sure you want to delete data?');"href="deletedata_core.php?studentid=<?php echo $mydata["studentid"];?>"> Delete</a></td>

        </tr>
        <?php


        }
        }
 ?>

   
    </table>
    
<a href="adminprofilepage.php"><input type="button" value="go back" >
</a>







</body>

</html>