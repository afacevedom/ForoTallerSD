<html>
   <head>
   </head>
   <body>
        <ul>
	<% regular.each { reg ->
           print "<li>"+reg.name + "  " + reg.lastname+" "+reg.age+"</li>"
        }
        %>
        </ul>
   </body>
</html>
