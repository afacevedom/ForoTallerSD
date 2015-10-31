
<html>
   <head>
   </head>
   <body>
        <ul>
	<% user.each { usr ->
           print "<li>"+usr.name + "  " + usr.lastname+" "+usr.age+" "+usr.username+"</li>"
        }
        %>
        </ul>
   </body>
</html>
