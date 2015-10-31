<html>
   <head>
   </head>
   <body>
        <ul>
	<% file.each { fl ->
           print "<li>"+fl.filetype + "  " + fl.size+"</li>"
        }
        %>
        </ul>
   </body>
</html>
