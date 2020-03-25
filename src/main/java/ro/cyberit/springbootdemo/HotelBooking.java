package ro.cyberit.springbootdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HotelBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String hotelName;
    private double pricePerNight;
    private int nrOfNights;

    public HotelBooking(){}

    public HotelBooking(String hotelName, double pricePerNight, int nrOfNights) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.nrOfNights = nrOfNights;
    }

    public String getHotelName() {
        return hotelName;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public int getNrOfNights() {
        return nrOfNights;
    }

    public double getTotalPrice(){
        return pricePerNight * nrOfNights;
    }

    public long getId() {
        return id;
    }
}
