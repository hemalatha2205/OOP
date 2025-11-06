package abstractclasses;

abstract class TransportBooking {
    abstract double calculateFare(double distance);
    void bookTicket() {
        System.out.println("Ticket booked successfully!");
    }
}

class BusBooking extends TransportBooking {
    double calculateFare(double distance) {
        return distance * 5;
    }
}

class TrainBooking extends TransportBooking {
    double calculateFare(double distance) {
        return distance * 3;
    }
}

class FlightBooking extends TransportBooking {
    double calculateFare(double distance) {
        return distance * 10 + 500;
    }
}

public class TransportSystem {
    public static void main(String[] args) {
        BusBooking bus = new BusBooking();
        double busFare = bus.calculateFare(50);
        bus.bookTicket();
        System.out.println("Bus Fare: ₹" + busFare);

        TrainBooking train = new TrainBooking();
        double trainFare = train.calculateFare(100);
        train.bookTicket();
        System.out.println("Train Fare: ₹" + trainFare);

        FlightBooking flight = new FlightBooking();
        double flightFare = flight.calculateFare(300);
        flight.bookTicket();
        System.out.println("Flight Fare: ₹" + flightFare);
    }
}

