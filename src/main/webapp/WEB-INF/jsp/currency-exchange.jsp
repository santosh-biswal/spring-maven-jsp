<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/exchange-currency/from/to.htm" method="get">
<table>
	<tr>
		<td>From</td>
		<td>To</td>
	</tr>
	<tr>
		<td><select name="from">
			<option value="USD">USD</option>
			<option value="DLR">DLR</option>
			<option value="PND">PND</option>
			<option value="EUR">EUR</option>
		</select>
		</td>
		<td>
		
		<td><select name="to">
			<option value="INR">INR</option>
		</select>
		</td>
	</tr>
	<tr>
		<td><input type="submit" value="exchange price"></td>
		<td></td>
	</tr>
	
	
	
</table>

</form>
</body>
</html>