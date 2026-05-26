package com.pluralsight;

public class Reservation {

    private String roomType;       // "king" or "double"
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.weekend = isWeekend;
    }

    public double getPrice() {
        double basePrice;

        if (roomType.equalsIgnoreCase("king")) {
            basePrice = 139.00;
        } else {
            basePrice = 124.00;
        }

        if (weekend) {
            basePrice *= 1.10;
        }

        return Math.round(basePrice * 100.0) / 100.0;
    }

    public double getReservationTotal() {
        return Math.round(getPrice() * numberOfNights * 100.0) / 100.0;
    }
}