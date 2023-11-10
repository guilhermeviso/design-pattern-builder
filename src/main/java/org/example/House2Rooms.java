package org.example;

public class House2Rooms implements HouseBuilder{

    House house = new House();
    public House2Rooms(){
        house = new House(2,1,false);
    }

    @Override
    public void buildRooms() {
        System.out.println("Room one: 2,5 x 1,90 \nRoom two: 2,3 x 1,80");
    }

    @Override
    public void buildBathrooms() {
        System.out.println("Bathroom: 2,3 x 1,25");
    }

    @Override
    public void buildBarbecueGrill() {
        System.out.println("No barbecue grill");
    }

    public House getHouse(){
        return house;
    }
}
