package co4_scenario;

class LateCheckInException extends Exception {
    public LateCheckInException(String message) {
        super(message);
    }
}

public class FlightCheckIn {
    static void checkIn(int minutesBeforeDeparture) throws LateCheckInException {
        if (minutesBeforeDeparture < 30) {
            throw new LateCheckInException("Check-in failed: Less than 30 minutes before departure!");
        } else {
            System.out.println("Check-in successful. Have a safe flight!");
        }
    }

    public static void main(String[] args) {
        try {
            checkIn(20); // Late
        } catch (LateCheckInException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkIn(45); // Successful
        } catch (LateCheckInException e) {
            System.out.println(e.getMessage());
        }
    }
}
