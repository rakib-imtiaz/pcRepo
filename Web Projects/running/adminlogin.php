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
   <div class="row">
      <div class="top_logo col-lg-9">
         <h1>
            <span style="color:#f06d6d;">O</span>P<span style="color: #8383df">I</span><span style="color:rgb(149, 219, 128);">M</span>S
         </h1>
         <p>Online Personal Identity Management System</p>
      </div>
      <div navbar col-lg-3 justify-content-around>
         <ul class="nav nav-pills nav-fill  justify-content-around mt-4">
            <li class="nav-item">
               <a class="nav-link " href="homepage.php">Home</a>
            </li>


            
            <li class="nav-item">
               <a class="nav-link" href="#">Contact Us</a>
            </li>
         </ul>
      </div>
   </div>
   <div class="signin">
      <form action="login_core.php">
         <h2>Log In</h2>
         <h6>(As Admin)</h6>
         <input type="text" name="username" placeholder="Username" />
         
         <input type="password" name="pwd" placeholder="Password" minlength="6" required />
         <br /><br />
         
         <div id="container">
          
           
            <input type="submit" value="Log In"/>
            <br/>
            
            <?php
            
            if(isset($_REQUEST["wrong_info"]))
            {
                 echo '<b style="color:red">User name or password is inncorrect</b>';
            }
          
            
            ?>
            <br> 
            <a href="reset.html">Reset password</a>
            <a href="reset.html">Forgot password</a> <br /><br />
         </div>
   

        
     
        <a class="link" href="index.php"><input type="button" value="Go back"> </a> <br />
      </form>
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