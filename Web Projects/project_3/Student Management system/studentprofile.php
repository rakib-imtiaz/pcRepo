<?php require_once("connect.php")?>
<!DOCTYPE html>
<html class="no-js" lang="">

<head>
  <meta charset="utf-8" />
  <title></title>
  <meta name="description" content="" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />

  <link rel="manifest" href="site.webmanifest" />
  <link rel="apple-touch-icon" href="icon.png" />
  <!-- Place favicon.ico in the root directory -->

  <link rel="stylesheet" href="css/normalize.css" />
  <link rel="stylesheet" href="css/bootstrap.min.css" />
  <link rel="stylesheet" href="css/main.css" />
  <link href="https://fonts.googleapis.com/css?family=Courgette|Fjalla+One&display=swap" rel="stylesheet" />
  <meta name="theme-color" content="#fafafa" />
</head>

<body>
  <!--[if IE]>
      <p class="browserupgrade">
        You are using an <strong>outdated</strong> browser. Please
        <a href="https://browsehappy.com/">upgrade your browser</a> to improve
        your experience and security.
      </p>
    <![endif]-->

  <!-- Add your site or application content here -->

  <div class="row header">
    <div class="top_logo col-lg-9">
      <h1>
        <span style="color:#f06d6d;">O</span>P<span style="color: #8383df">I</span><span style="color:rgb(149, 219, 128);">M</span>S
      </h1>
      <p>Online Personal Identity Management System</p>
    </div>

    <div navbar col-lg-3 justify-content-around>
      <ul class="nav nav-pills nav-fill  justify-content-around mt-4">
        <li class="nav-item">
          <a class="nav-link " href="home.html">Home</a>
        </li>

        <li class="nav-item">
          <a class="nav-link active" href="homepage.php">Log out</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Contact Us</a>
        </li>
      </ul>
    </div>
  </div>
  <div class="row">
    <div class="container">
      <div class="profile_photo col card">
        <h2 class="">Momtahinah Jahan Shammi</h2>
           <?php
          if(isset($_COOKIE["currentuser"]))
          {
              $target=$_COOKIE["currentuser"];
            $namequery="SELECT *FROM studentinfo WHERE email='$target'";
            $runnamequery=mysqli_query($connect,$namequery);
            if($runnamequery==true){
              while($getrow=mysqli_fetch_array($runnamequery))
              {
                $avatarimg= $getrow["avatar"];
                echo "<img src='avatar/$avatarimg' width=500px; height=400>";
                
               
                
         }
              
              
              
            }
    
          }
          ?>



        <p class="card-footer">
          Age: 25 Years <br />
          Phone No: 01624015575
        </p>
      </div>
      <div class="profile_details col">
        <table class="table table-dark table-hover table-bordered">
          <thead>
            <tr>
              <span class="table_head">
                <h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Welcome

                  <?php
          if(isset($_COOKIE["currentuser"]))
          {
              $target=$_COOKIE["currentuser"];
            $namequery="SELECT *FROM studentinfo WHERE email='$target'";
            $runnamequery=mysqli_query($connect,$namequery);
            if($runnamequery==true){
              while($getrow=mysqli_fetch_array($runnamequery)){
                echo $getrow['fname'],' '.$getrow['lname'];
                
                
         }
              
              
              
            }
    
          }
          ?>
                </h2>




              </span>
            </tr>
          </thead>
          <tbody>
            <tr>
              <th scope="row">Student ID</th>
              <td></td>
            </tr>
            <tr>
              <th scope="row">First name</th>
              <td></td>
            </tr>
            <tr>
              <th scope="row">Last Name</th>
              <td></td>
            </tr>
            <tr>
              <th scope="row">Birthdate</th>
              <td></td>
            </tr>
            <tr>
              <th scope="row">Email ID</th>
              <td></td>
            </tr>
            <tr>
              <th scope="row">Mobile Number</th>
              <td></td>
            </tr>
            <tr>
              <th scope="row">Gender</th>
              <td></td>
            </tr>
            <tr>
              <th scope="row">Address</th>
              <td></td>
            </tr>
            <tr>
              <th scope="row">Date of Registration</th>
              <td></td>
            </tr>
            <tr>
              <th scope="row"> <a href="">Students directory</a></th>
              <td> <a href="studentdirectory.php"></a><input type="file"></td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  </div>

  <script src="js/vendor/modernizr-3.7.1.min.js"></script>
  <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
  <script>
    window.jQuery ||
      document.write(
        '<script src="js/vendor/jquery-3.3.1.min.js"><\/script>'
      );
  </script>
  <script src="js/plugins.js"></script>
  <script src="js/main.js"></script>
  <script src="js/bootstrap.min.js"></script>

  <!-- Google Analytics: change UA-XXXXX-Y to be your site's ID. -->
  <script>
    window.ga = function() {
      ga.q.push(arguments);
    };
    ga.q = [];
    ga.l = +new Date();
    ga("create", "UA-XXXXX-Y", "auto");
    ga("set", "transport", "beacon");
    ga("send", "pageview");
  </script>
  <script src="https://www.google-analytics.com/analytics.js" async defer></script>
</body>

</html>