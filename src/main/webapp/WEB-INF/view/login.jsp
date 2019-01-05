<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Log in with your account</title>

    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    <link href="/css/common.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<div>
<div class="row">
  <div class="column bgimg" style="background-color:greenyellow;">
    
  </div>
  <div class="column">
  <div class="form-heading message"><marquee>Yummy order awaits you . hurry up !!!</marquee></div>
   <div class="login well">
    <form method="POST" action="${contextPath}/login" class="form-signin">
       
        <h2 class="form-heading">Log in</h2>

        <div class="form-group ${error != null ? 'has-error' : ''}">
            <span>${message}</span><br/>
            <input name="username" type="text" class="form-control" placeholder="Username"
                   autofocus="true"/><br/>
            <input name="password" type="password" class="form-control" placeholder="Password"/>
            <span>${error}</span><br>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

            <button class="btn btn-lg btn-success btn-block" type="submit">Log In</button><br/>
            <h4 class="text-center "><a class="form-heading" href="${contextPath}/registration">Sign Up</a></h4>
        </div>
	
    </form>
    </div>
  </div>
</div>
</div>
<!-- /container -->
 <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
 <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
