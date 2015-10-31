<html>
   <head>
   </head>
   <body>
        <ul>
	<% post.each { ps ->
           print "<li>"+ps.topic + "  " + ps.dateCreate+" "+ps.lastUpdate+"</li>"
        }
        %>
        </ul>
   </body>
</html>
