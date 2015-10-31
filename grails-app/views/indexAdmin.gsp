
<html>
   <head>
   </head>
   <body>
        <ul>
	<% admin.each { adm ->
           print "<li>"+adm.name + "  " + adm.lastname+" "+adm.level+" "+adm.rating+"</li>"
        }
        %>
        </ul>
   </body>
</html>
