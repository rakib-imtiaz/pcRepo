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
    <div class="top_logo">
      <h1>
        <span style="color:#f06d6d;">O</span>P<span style="color: #8383df"
          >I</span
        ><span style="color:rgb(149, 219, 128);">M</span>S
      </h1>
      <p>Online Personal Identity Management System</p>
    </div>
    <div class="reset">
     
        <p>Congratulations. You changed password successfully. Go back to Home page and Log In again.</p>

        <br /><br /><br /><br /><br />
        <a class="bo_back" href="index.html">Go Back</a>
        
        <script>
          function myFunction() {
              var x = document.getElementById("msg");
              x.className = "show";
              setTimeout(function(){
                  x.className = x.className.replace("show",""); }; 3000);
          }
        </script>
      </form>
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
