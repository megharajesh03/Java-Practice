<html>
	<body bgcolor="pink">
		<form action="./updateFlight" method ="post">
			Enter Flight ID to update : <input type="text" name="flightID"/><br/>
			Enter Updated Flight Name : <input type="text" name="flightName"/><br/>
			Enter Updated Seating Capacity : <input type="text" name="seatingCapacity"/><br/>
			Enter Updated Reservation Capacity : <input type="text" name="reservationCapacity"/><br/>
			<button type ="submit">Update Flight</button>
		</form>
		<div>
			<p>${message}</p>
		</div>
	</body>
</html>