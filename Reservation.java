package java4.haftaodevler;

import java.util.Date;

public class Reservation {
    private static int reservationCounter = 0;
    private int reservationNumber;
    private Date reservationDate;
    private Flight flight;
    private Customer customer;

    public Reservation(Customer customer, Flight flight) {
        this.reservationNumber = ++reservationCounter;
        this.reservationDate = new Date();
        this.flight = flight;
        this.customer = customer;
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
