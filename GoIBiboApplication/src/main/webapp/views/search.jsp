<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>GoIbibo.com</title>
</head>
<body>
	<h2>Enter Ticket Id </h2>
	<form action="searchTicket">
		TicketId : <input type="text" name="ticketId"/>
		<input type="submit" value="search"/>
	</form>
	<h2>Booked Ticket Information!</h2>
		<table>
			<tr>
				<td>Passenger Name:</td>
				<td>${ticket.passangerName}</td>
			</tr>
			<tr>
				<td>TicketCost:</td>
				<td>${ticket.ticketCost}</td>
			</tr>
			<tr>
				<td>TicketId:</td>
				<td>${ticket.ticketId}</td>
			</tr>
			<tr>
				<td>TicketStatus:</td>
				<td>${ticket.ticketStatus}</td>
			</tr>
			<tr>
				<td>TrainNmber:</td>
				<td>${ticket.trainNmber}</td>
			</tr>
			<tr>
				<td>Source:</td>
				<td>${ticket.source}</td>
			</tr>
			<tr>
				<td>Destination:</td>
				<td>${ticket.destination}</td>
			</tr>		
		</table>
		<a href="/">home</a>
		<a href="search">Search Ticket</a>
	
</body>
</html>