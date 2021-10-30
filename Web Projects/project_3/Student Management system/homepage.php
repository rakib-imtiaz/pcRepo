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
    <link rel="stylesheet" href="css/home.css" />
    <link
      href="https://fonts.googleapis.com/css?family=Courgette|Fjalla+One&display=swap"
      rel="stylesheet"
    />

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
    <div class="container">
      <div class="header row pb-2 mb-6 fixed-top">
          
        <div class="main_logo col-lg-9">
          <h1 class="ml-3">
            <span style="color:#f06d6d;">O</span>P<span style="color: #8383df"
              >I</span
            ><span style="color:rgb(149, 219, 128);">M</span>S
          </h1>
          <p>Online Personal Identity Management System</p>
        </div>
        <div navbar col-lg-3 justify-content-around>
          <ul class="nav nav-pills nav-fill  justify-content-around mt-4">
            <li class="nav-item">
              <a class="nav-link active" href="#">Home</a>
            </li>
           
            <li class="nav-item">
              <a class="nav-link" href="index.php">Log In</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Contact Us</a>
            </li>
          </ul>
        </div>
      </div>
      </div>
      <div class="cover_photo mb-6 pb-6">
        
        <img src="img/background.jpg" alt="" />
     
      </div>
      <div class="about_us row">
        <div class="container">
    
          <p class="col-lg-12">
              Online Personal Identity Management System (OPIMS) used to store personal information like passwords, documents, photos. Only authorized or registered users can login into the system and they can store the data and files.
            Modules of proposed system  
 
              Different modules are used in this system:  i. Admin  ii. User  iii. Authentication  iv.  Registration  v. Communication  
               
              Admin: Admin is the owner of this system; he is the person to approve the user request.  
              After verifying the users registration data admit’ can accept/reject the request of users. He can authenticate users to give functionality such as add/delete/insert for maintenance purpose.  Adding new module is one of the work areas of admin.  
               
              User: User has to register first after admin acceptance only he can eligible to login into the 
              system. To user facilities of this system he has to provide login name name and password (like Gmail or Yahoo). In this site he can store his/her file or important document. He can add favorites and he can store passwords of different sides  
 
              Authentication: The process of identifying an individual usually based on a 
              username and password. In security systems, authentication is distinct from authorization, which the process giving individuals access to system object based on their identity. Authentication merely ensures that the individuals is who he/she claims to be, but says nothing about the access right of the individual.  
               
              Registration: The system has a process of registration. Every user need to submit 
              their complete details including user name and password in the form of registration. Whenever a user registration completed, then only a user can get login into the system by using his user id and password.  
                </p>
          </div>
      </div>
    </div>

    <script src="js/vendor/modernizr-3.7.1.min.js"></script>
    <script
      src="https://code.jquery.com/jquery-3.3.1.min.js"
      integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
      crossorigin="anonymous"
    ></script>
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
    <script
      src="https://www.google-analytics.com/analytics.js"
      async
      defer
    ></script>
  </body>
</html>
