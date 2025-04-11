<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Train Ticket Booking</title>

    <!-- Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

   
    <div class="jumbotron jumbotron-fluid text-white text-center" style="background: linear-gradient(to right, #5d6d7e, #34495e);">
        <div class="container">
            <h1 class="display-4 font-weight-bold"> Train Ticket Booking</h1>
            <p class="lead">Book, view, check availability, or cancel tickets with ease!</p>
        </div>
    </div>

  
    <div class="container">
        <div class="row text-center mt-4">
            <div class="col-md-3">
                <div class="card shadow-sm border-0 bg-light">
                    <div class="card-body">
                        <h5 class="card-title">Book a Ticket</h5>
                        <p class="card-text">Reserve your seat now!</p>
                        <a href="./bookTicketForm" class="btn btn-primary btn-sm">Book Now</a>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="card shadow-sm border-0 bg-light">
                    <div class="card-body">
                        <h5 class="card-title">View Tickets</h5>
                        <p class="card-text">Check your booked tickets.</p>
                        <a href="./viewTicket" class="btn btn-primary btn-sm">View Now</a>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="card shadow-sm border-0 bg-light">
                    <div class="card-body">
                        <h5 class="card-title">Check Availability</h5>
                        <p class="card-text">See seat availability.</p>
                        <a href="./checkAvailability" class="btn btn-primary btn-sm">Check Now</a>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="card shadow-sm border-0 bg-light">
                    <div class="card-body">
                        <h5 class="card-title">Cancel Tickets</h5>
                        <p class="card-text">Cancel your bookings easily.</p>
                        <a href="./cancelTickets" class="btn btn-primary btn-sm">Cancel Now</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
