
<html>
   <head>
   </head>
   <body>
        <ul>
	<% admin.each { adm ->
           print "<li>"+adm.firstname + "  " + adm.lastname+" "+adm.level+" "+adm.rating+"</li>"
        }
        %>
        </ul>
   </body>
</html>
