<!--THIS is the editing page,when admin click the edit button , this page will open and admin can edit datas on that form page-->


<html>

<head>
 <title>Student Registration Form</title>
 <link rel="stylesheet" href="css/registrationform.css">

</head>

<body>

 <?php
 
 require_once("connect.php");
 
if(isset($_REQUEST["edit_id"]))
 
 {
  $editID=$_REQUEST["edit_id"];
   
 $selectinfo = "SELECT * FROM studentinfo WHERE id=$editID";
 $runinfo = mysqli_query($connect,$selectinfo);
 
 while($getdata = mysqli_fetch_array($runinfo)){
  ?>

 <h3>STUDENT REGISTRATION FORM</h3>
 <form action="editdata_core.php" method="post">
  <table align="center" cellpadding="10">

   <!-----student Id---------------------------------------------------------->
   <tr>
    <td>student ID</td>
    <td><input type="text" name="studentid" value="<?php echo $getdata["studentid"];?>" />
    </td>
   </tr>
   <!----- First Name ---------------------------------------------------------->
   <tr>
    <td>First Name</td>
    <td><input type="text" name="fname" value="<?php echo $getdata["fname"];?>" />
     (max 30 characters a-z and A-Z)
    </td>
   </tr>


   <!----- Last Name ---------------------------------------------------------->
   <tr>
    <td>Last Name</td>
    <td><input type="text" name="lname" value="<?php echo $getdata["lname"];?>" />
     (max 30 characters a-z and A-Z)
    </td>
   </tr>
   <!-----Date Of Birth ---------------------------------------------------------->
   <tr>
    <td>Date of Birth</td>
    <td><input type="text" name="Dob" value="<?php echo $getdata["Dob"];?>" />
    </td>
   </tr>

   <!----- Email Id ---------------------------------------------------------->
   <tr>
    <td>EMAIL ID</td>
    <td><input type="text" name="email" value="<?php echo $getdata["email"];?>" maxlength="100" /></td>
   </tr>
   <!----- password ---------------------------------------------------------->
   <tr>
    <td>password</td>
    <td><input type="password" name="pwd" value="<?php echo $getdata["pwd"];?>" maxlength="20" /></td>
   </tr>

   <!----- Mobile Number ---------------------------------------------------------->
   <tr>
    <td>MOBILE NUMBER</td>
    <td>
     <input type="text" name="mobilenumber" value="<?php echo $getdata["mobilenumber"];?>" maxlength="10" />
     (20 digit number)
    </td>
   </tr>

   <!----- Gender ----------------------------------------------------------->
   <tr>
    <td>Gender</td>
    <td><input type="text" name="gender" value="<?php echo $getdata["gender"];?>" />
    </td>
   </tr>


   <!----- Address ---------------------------------------------------------->
   <tr>
    <td>Address</td>
    <td><input type="text" name="addr" value="<?php echo $getdata["addr"];?>" />
    </td>
   </tr>

   <!-----Date Of registration ---------------------------------------------------------->
   <tr>
    <td>Date of registration</td>
    <td><input type="text" name="registration" value="<?php echo $getdata["registration"];?>" />
    </td>
    
    <input type="hidden" name="editingID" value="<?php echo $editID;?>" />
   
   </tr>




   <!----- Submit and Reset ------------------------------------------------->
   <tr>
    <td colspan="2" align="center">
     <input type="submit" name="editButton" value="UPDATE DATA ">
    </td>
   </tr>
  </table>

 </form>






 <?php 
 }
}
 ?>










</body>

</html>