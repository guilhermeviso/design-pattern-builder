package org.example;

public class House {
    private int rooms;
    private  int bathrooms;
    private boolean barbecueGrill;

    public House(){}

    public House(int rooms, int bathrooms, boolean barbecueGrill) {
        this.rooms = rooms;
        this.bathrooms = bathrooms;
        this.barbecueGrill = barbecueGrill;
    }

    public int getRooms() {
        return rooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public boolean isBarbecueGrill() {
        return barbecueGrill;
    }
}
