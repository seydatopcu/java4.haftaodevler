package java4.haftaodevler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirlineReservationSystem {
    private List<Customer> customers = new ArrayList<>();
    private List<Flight> flights = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void makeReservation(Customer customer, Flight flight) {
        Reservation reservation = new Reservation(customer, flight);
        if (flight.getCapacity() > reservations.size()) {
            reservation.setCustomer(customer);
            reservation.setFlight(flight);
            reservation.setReservationDate(new Date());
            this.reservations.add(reservation);
            System.out.println("Reservation made successfully");
            System.out.println("Reservation number: " + (reservation.getReservationNumber() + 1));
        } else {
            System.out.println("Flight is full. Reservation cannot be made.");
        }
    }

    public void displayCustomers() {
        System.out.println("All customers:");
        for (Customer customer : customers) {
            System.out.println(customer.getFirstName() + " " + customer.getLastName());
        }
    }

    public void displayReservations() {
        System.out.println("All reservations:");
        for (Reservation res : reservations) {
            System.out.println("Reservation number: " + res.getReservationNumber() +
                    " Reservation name: " + res.getCustomer().getFirstName() + " " + res.getCustomer().getLastName() +
                    " Reservation Flight: " + res.getFlight().getFlightId());
        }
    }
}
