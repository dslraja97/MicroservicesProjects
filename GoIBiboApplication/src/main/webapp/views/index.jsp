<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>GoIbibo.com</title>
</head>
<body>
    <h2>Passenger Form</h2>
	<form action="bookTicket" method="post">
		<table>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="fName"/></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lName"/></td>
			</tr>
			<tr>
				<td>Source:</td>
				<td><input type="text" name="source"/></td>
			</tr>
			<tr>
				<td>Destination:</td>
				<td><input type="text" name="destination"/></td>
			</tr>
			<tr>
				<td>Date Of Joruney:</td>
				<td><input type="text" name="doj"/></td>
			</tr>
			<tr>
				<td>Train Nmber:</td>
				<td><input type="text" name="trainNumber"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Book Ticket"/></td>
			</tr>
		</table>
	</form>
	<a href="search">Search Ticket</a>
</body>
</html>
