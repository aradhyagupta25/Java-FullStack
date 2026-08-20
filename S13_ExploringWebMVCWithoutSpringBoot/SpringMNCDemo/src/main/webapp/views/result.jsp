<%@page language="java" %>

<%--<html>--%>
<%--<head>--%>
<%--    <link rel="stylesheet" type="text/css" href="../style.css">--%>
<%--</head>--%>
<%--</body>--%>
<%--&lt;%&ndash; to write a java code in a jsp file, we will use <% %>, JSP way. here we will fetch the attribute to show in the page.&ndash;%&gt;--%>
<%--&lt;%&ndash;<h2>Result is: <%= session.getAttribute("result") %></h2>&ndash;%&gt;--%>

<%--&lt;%&ndash;using the JSTL to show the data in the page&ndash;%&gt;--%>
<%--<h2>Result is: ${result} </h2>--%>

<%--</body>--%>
<%--</html>--%>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
</body>


<h2>Welcome To Gupta's Territory   </h2>
<p> ${alien1} </p>
<p>Welcome to the ${course} World!</p>

</body>
</html>