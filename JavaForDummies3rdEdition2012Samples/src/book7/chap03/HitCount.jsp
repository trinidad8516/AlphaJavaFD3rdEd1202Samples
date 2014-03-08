<html>
  <%@ page import="java.text.*" %>
  <%@ page import="java.util.*" %>
  
  <head>
    <title>Counter JSP</title>
  </head>
  <body>
    <h1>
      This JSP has been displayed <%= count++ %>
      time.</h1>
  </body>
</html>
<%!
private static int count = 1;
%> 
