package java4.haftaodevler;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        AirlineReservationSystem airlineReservationSystem = new AirlineReservationSystem();
        Customer c1 = new Customer("Alican", "Güzel", "05326354896", "alican@gmail.com");
        Customer c2 = new Customer("Kerem", "Karadeniz", "2568963", "kerem@gmail.com");
        Flight f1 = new Flight(1, "A", "B", new Date(), 1);
        airlineReservationSystem.addCustomer(c1);
        airlineReservationSystem.addCustomer(c2);
        airlineReservationSystem.addFlight(f1);

        airlineReservationSystem.makeReservation(c1, f1);
        airlineReservationSystem.makeReservation(c2, f1);
        airlineReservationSystem.displayReservations();
        airlineReservationSystem.displayCustomers();
    }
}
