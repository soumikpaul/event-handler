<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta charset="UTF-8">
<title>Spring MVC</title>
<%@ page isELIgnored="false" %>
</head>
<body>
	<h2>Hello World!</h2>
	<form action="display">
		<label>Event title</label> <input type="text" name="t1"> <br>
		<label>Price</label> <input type="text" name="t2"> <br> <label>Ticket
			Available</label> <input type="text" name="t3"> <br> <label>City</label>
		<input type="text" name="t4"> <br>

			<select name="t5">
				<c:forEach var="listValue" items="${lists}">
				<option value=${listValue}>${listValue}</option>
				</c:forEach>
			</select>

<input type="submit">
	</form>
</body>
</html>
