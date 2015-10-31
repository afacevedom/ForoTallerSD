<html>
   <head>
   </head>
   <body>
        <ul>
	<% forum.each { fm ->
           print "<li>"+fm.name + "  " + fm.category+"</li>"
        }
        %>
        </ul>
   </body>
</html>
