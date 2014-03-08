<!doctype html public "-//W3C//DTD HTML 4.0
Transitional//EN">
<%@ page import="movie.*" %>	
<%@ page import="java.util.*" %>
<html>
  <head>
    <title>List Movies: The Servlet</title>
  </head>
  <body>
    <h1>Some of My Favorites</h1>
    <h3>
      <%= getMovieList() %>	
    </h3>
  </body>
</html>
<%! 
private String getMovieList()	
{
    String msg = "";
    ArrayList<Movie> movies = MovieIO.getMovies();	
    for (Movie m : movies)		
    {
        msg += m.year + ": ";
        msg += m.title + "<br>";
    }
    return msg;	
}
%>
