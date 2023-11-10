package org.example;

public class House3Rooms2BathroomsBarbecue implements HouseBuilder {
    House house = new House();

    public House3Rooms2BathroomsBarbecue(){
        house = new House(3,2,true);
    }

    @Override
    public void buildRooms() {
        System.out.println("Room one: 2,5 x 1,9\nRoom two: 2,0 x 1,7\nRoom three: 2,5 x 2,0");
    }

    @Override
    public void buildBathrooms() {
        System.out.println("Bathroom one: 2,3 x 1,25\nBathroom two: 2,0 x 1,3");
    }

    @Override
    public void buildBarbecueGrill() {
        System.out.println("With barbecue grill");
    }

    public House getHouse(){
        return house;
    }
}
