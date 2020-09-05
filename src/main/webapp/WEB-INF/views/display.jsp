<%@ page import="java.util.ArrayList"%>
<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta charset="UTF-8">
<title>Spring MVC</title>
<%@ page isELIgnored="false"%>
</head>
<body>
	<h2>Displaying Events!</h2>

	
	<table width="100%" align="center">
		<tr>
			<th>Event Name</th>
			<th>Event Type</th>
			<th>City</th>
			<th>Price</th>
			<th>Tickets</th>
		</tr>
		<c:forEach var="listValue" items="${list}" varStatus="vs">
			<tr>
				<td align="center">${listValue.eventName}</td>
				<td align="center">${listValue.eveType}</td>
				<td align="center">${listValue.city}</td>
				<td align="center">${listValue.price}</td>
				<td align="center">${listValue.tickets_avail }
			</tr>
		</c:forEach>
	</table>
<input type="button"  onclick="location.href='/eventHandl/add'" value="Add More Events" >


</body>
</html>
