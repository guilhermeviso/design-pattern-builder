package org.example;

public class Main {
    public static void main(String[] args) {
        HouseBuilder houseBuilder1 = new House2Rooms();
        houseBuilder1.buildRooms();
        houseBuilder1.buildBathrooms();
        houseBuilder1.buildBarbecueGrill();
        House house1 = houseBuilder1.getHouse();

        System.out.println("\nHouse one:");
        System.out.println(house1.getRooms());
        System.out.println(house1.getBathrooms());
        System.out.println(house1.isBarbecueGrill()+"\n");

        HouseBuilder houseBuilder2 = new House3Rooms2BathroomsBarbecue();
        houseBuilder2.buildRooms();
        houseBuilder2.buildBathrooms();
        houseBuilder2.buildBarbecueGrill();
        House house2 = houseBuilder2.getHouse();

        System.out.println("\nHouse two:");
        System.out.println(house2.getRooms());
        System.out.println(house2.getBathrooms());
        System.out.println(house2.isBarbecueGrill());
    }
}