<html>
	<body bgcolor="pink">
		<form action="./addFlight" method="post">
			Enter Flight ID : <input type="text" name="flightID"/><br/>
			Enter Flight Name : <input type="text" name="flightName"/><br/>
			Enter Seating Capacity : <input type="text" name="seatingCapacity"/><br/>
			Enter Reservation Capacity : <input type="text" name="reservationCapacity"/><br/>
			<button type ="submit">Add Flight</button>
		</form>
		<div>
			<p>${message}</p>
		</div>
	</body>
</html>