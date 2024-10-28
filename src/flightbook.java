import java.time.*;
import java.time.temporal.ChronoUnit;

public class flightbook {
    public static void main(String[] args) {
        LocalDate bookingDate = LocalDate.now();
        LocalDate flightDate = LocalDate.of(2024, 12, 15);
        long daysUntilFlight = ChronoUnit.DAYS.between(bookingDate, flightDate); // Calculate days between booking and flight
        System.out.println(bookingDate);
        System.out.println(flightDate);
        System.out.println("Days until the Flight: " + daysUntilFlight);
        System.out.println();

        LocalTime departureTime= LocalTime.of(14, 30);
        LocalTime arrivalTime = departureTime.plusHours(5).plusMinutes(45);
        Duration flightDuration = Duration.between(departureTime, arrivalTime);
        System.out.println("Arriving at: " + arrivalTime);
        System.out.println("Flight Lasted: " + flightDuration);

        LocalDateTime departureDateTime = LocalDateTime.of(flightDate, departureTime);
        LocalDateTime arrivalDateTime = departureDateTime.plus(flightDuration);
        System.out.println("Departure at: " + departureDateTime);
        System.out.println("Flight lasted: " + flightDuration );



    }
}