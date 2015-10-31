<html>
   <head>
   </head>
   <body>
        <ul>
	<% post.each { ps ->
           print "<li>"+ps.topic + "  " + ps.dateCreated+" "+ps.lastUpdate+"</li>"
        }
        %>
        </ul>
   </body>
</html>
