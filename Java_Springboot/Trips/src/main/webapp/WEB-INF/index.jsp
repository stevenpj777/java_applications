<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    


<!DOCTYPE html>
<meta name="viewport" content="initial-scale=1">
<html>
  <head>
    <link rel="stylesheet" href="./resources/css/reset.css">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="./resources/css/style.css">
    <link rel="icon" href="./resources/images/favicon.ico" type="image/x-icon">
    <link href="https://fonts.googleapis.com/css?family=Roboto:400,500,700" rel="stylesheet">
    
    <title>Triply Vacations</title>
  </head>
  <body>


<!-- HEADER SECTION-->

<header>
    <nav class="header flex-container">
      <div class="header-logo flex-container">
          <img src="./resources/images/ic-logo.svg" alt="Colmar logo">
          <span><strong>Triply</strong> VACATIONS</span>
      </div>
      <ul class="full-nav" role="presentation">
          <li>Destinations</li>
          <li>Company</li>
          <li>Safaris</li>
           <a href="/login"><li>Sign up</li></a>

      </ul>
      <ul class="mobile-nav" role="presentation">
          <img src="/images/ic-on-campus.svg" alt=" link to on Campus">
          <img src="/images/ic-online.svg" alt="link to online">
          <img src="/images/ic-login.svg" alt="Login">
      </ul>
    </nav>
</header>

<!-- MAIN BANNER SECTION-->

    <section id="main" class="flex-container">
      <div class="img_container" role="presentation">
          <img src="/images/giraffe_safari.jpg" alt="banner image people reading">
      </div>
      <div class="column-2 flex-container" role="presentation">
          <h1>Explore the World!</h1>
          <p>Learn something new every day on another continent!</p>
          <a href="#" class="button">Start Here</a>
      </div>
    </section>


<!-- ORIENTATION SECTION-->

<section id="orientation" class="flex-container">
  <div class="img_container">
      <img src="/images/elephant_safari.jpg" alt="man reading book">
      <h1>It doesn't hurt to keep exploring</h1>
      <p class="quote" role="note">"Curabitur vitae in ipsum portitor consequat. Aliquam et commodo lectus,
      nec consequat neque. Sed non accumsan urna. Phasellus sed consequat ex. Etiam
      eget magna laoreet, efficitur dolor consequat, tristique ligula."</p>
      <h5>Emanuel, Sr Stategist at Hiring.com</h5>
  </div>

  <div class="column-2 flex-container">
    <div class="info-box flex-container">
      <div class="info-image">
          <img class="full-img" src="/images/tiger.jpeg" alt="people with shadows">
          <img class="mobile-img" src="/images/information-orientation-mobile.jpg" alt="people with shadows">
      </div>
      <div class="info-text flex-container">
          <h3>Kenya Safari</h3>
          <p>March 18 - March 29</p>
          <a href="#" class="button">Read more</a>
      </div>
    </div>
    <div class="info-box flex-container">
      <div class="info-image">
          <img class="full-img" src="/images/information-campus.jpg" alt="people in study hall">
          <img class="mobile-img" src="/images/information-campus-mobile.jpg" alt="people in study hall">
      </div>
      <div class="info-text flex-container">
          <h3>Tanzania Safari</h3>
          <p>April 18 - April 30</p>
          <a href="#" class="button">Read more</a>
      </div>
    </div>
    <div class="info-box flex-container">
      <div class="info-image">
          <img class="full-img" src="/images/zebra.jpeg" alt="image of lecturer">
          <img class="mobile-img" src="/images/information-guest-lecture-mobile.jpg" alt="image of lecturer">
          <!-- <img src="/images/information-guest-lecture.jpg" alt="orientation image"> -->
      </div>
      <div class="info-text flex-container">
          <h3>Bhotswana Safari</h3>
          <p>November 9 - November 30</p>
          <a href="#" class="button">Read more</a>
      </div>
    </div>
  </div>
</section>


<!-- COURSES SECTION-->

  <section id="courses">
    <div class="title">
          <h2>Learn before you Go!</h2>
    </div>

    <!--Top set of courses-->
    <div class="top-box-set flex-container">
      <div class="box">
          <img src="/images/course-software.jpg" alt="desk with two monitors">
            <div class="box-text">
                <h3>Study Abroad Programs</h3>
                <h4>Overview</h3>
                <p>Discover opportunities to live and study abroad! </p>
            </div>
      </div>
      <div class="box">
          <img src="/images/course-computer-art.jpg" alt="cellular phone">
            <div class="box-text">
                <h3>Travel Software</h3>
                <h4>Overview</h3>
                <p>Disover and learn new software tools and websites to plan your adventures!</p>
            </div>
      </div>
      <div class="box">
          <img src="/images/course-design.jpg" alt="camera">
            <div class="box-text">
                <h3>Photogrpahy Courses</h3>
                <h4>Overview</h3>
                <p>Learn how to photograh your safari like a pro!</p>
            </div>
      </div>
    </div>

    <!--Bottom set of courses-->
    <div class="bottom-box-set flex-container">
      <div class="box">
          <img src="/images/course-data.jpg" alt="laptop on desk">
            <div class="box-text">
                <h3>Lectures</h3>
                <h4>Overview</h3>
                <p>Learn fascinating facts about your dream destination!</p>
            </div>
      </div>
      <div class="box">
          <img src="/images/course-business.jpg" alt="chessboard">
            <div class="box-text">
                <h3>Business Development</h3>
                <h4>Overview</h3>
                <p>Product Development, Business Development, Startup </p>
            </div>
      </div>
      <div class="box">
          <img src="/images/course-marketing.jpg" alt="iwatch photo">
            <div class="box-text">
                <h3>Fun placeholder</h3>
                <h4>Overview</h3>
                <p>E pluribus unum</p>
            </div>
      </div>
    </div>
  </section>


  <!-- THESIS SECTION-->

  <!-- <section id="thesis">
    <div class="title">
        <h2>Thesis Exhibit</h2>
    </div>
    <div class="thesis-container flex-container">
        <div class="img_container">
            <video width="100%"  autoplay loop alt="movie clip of building">
            <source src="./resources/videos/thesis.mp4">
              Your browser does not support this video
            </video>
            <h3>Reimagine urban</h3>
            <p class="quote">"Curabitur vitae in ipsum portitor consequat. Aliquam et commodo lectus,
            nec consequat neque. Sed non accumsan urna. Phasellus sed consequat ex. Etiam
            eget magna laoreet, efficitur dolor consequat, tristique ligula."</p>
        </div>
        <div class="column-2 flex-container">
          <div class="info-box flex-container">
            <div class="info-image">
                <img src="./resources/images/thesis-fisma.jpg" alt="man drawing">
            </div>
            <div class="info-text flex-container">
                <h3>Fisma: Design and Protoype</h3>
                <p>Designer showcase of new prototype product</p>
            </div>
          </div>
          <div class="info-box flex-container">
            <div class="info-image">
                <img src="./resources/images/thesis-now-and-then.jpg" alt="NYC skyline">
            </div>
            <div class="info-text flex-container">
                <h3>Now and then</h3>
                <p>Research study about New York</p>
            </div>
          </div>
        </div>
      </div>
  </section> -->


  <!-- FOOTER SECTION-->

  <footer>
    <div class="container flex-container">
        <h5>&#64 2016 Colmar Academy. All rights reserved</h5>
    <ul role="presentation">
        <li>Terms</li>
        <li>Privacy</li>
    </ul>
    </div>
  </footer>

  </body>
</html>
