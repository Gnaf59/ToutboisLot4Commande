<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="utf-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="author" content="">
    
    <title>Toutbois</title>
    
    <!-- Bootstrap Core CSS -->
    <link href="${pageContext.request.contextPath}/CSS/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/CSS/toutbois.css" rel="stylesheet">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]--> 
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-sm-12 col-lg-12 col-md-12">
            <img src="${pageContext.request.contextPath}/img/logo/logo-02.png" class="img-responsive img-responsive-margin" alt="Logo ToutBois">
        </div>
    </div>        
    <div class="row">
        <div class="col-xs-12 col-sm-8 col-sm-push-2 col-md-4 col-md-push-4 col-lg-4 col-lg-push-4">
            <form class="form-signin" method="post" action="Identification">
                <input type="text" id="inputEmail" class="form-control" name="login" placeholder="Login" required autofocus>
                <input type="password" id="inputPassword" name="motDePasse" class="form-control" placeholder="Mot de passe" required>
                <hr>
                <button class="btn btn-lg btn-success btn-block" type="submit">Connection</button>
                <hr>
            </form>
        </div>        
    </div> 
</div>
        <footer>
<div class="container">
        <div class="row">
            <address class="col-sm-3 col-lg-3 col-md-3">
               <p>20 Rue du Luxembourg<br>
                59100 Roubaix<br>
                France</p> 
            </address>
    
            <div class="col-sm-6 col-lg-6 col-md-6">
                <p class="paraCentre">Contact information</p>
                    <ul class="list-inline center-block text-center">
                                        <li><a href="https://www.instagram.com/_deschampsmatthieu_/"><span class="fa fa-instagram fa-3x"></span></a></li>
                                        <li><a href="http://deschampsmatthieu.tumblr.com/"><span class="fa fa-tumblr-square fa-3x"></span></a></li>
                                        <li><a href="https://plus.google.com/u/2/104855726051683727224"><span class="fa fa-google-plus-square fa-3x"></span></a></li>
                                        <li><a href="https://github.com/MatthieuDeschamps"><span class="fa fa-github-square fa-3x"></span></a></li>
                    </ul>
            </div>
            <div class="col-sm-3 col-lg-3 col-md-3">
                <h4 class="h4footer"> Réalisation du site</h4>
                <p class="paraRight">&copy; 2016-2017 SSII MGc production</p>
            </div>
        </div>
    </div>
</footer>
 <script src="${pageContext.request.contextPath}/jquery-3.1.1.js"></script>
 <script src="${pageContext.request.contextPath}/CSS/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>   
</body>
</html>

