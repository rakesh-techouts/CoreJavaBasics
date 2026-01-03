package javabasics.assignment1;

import java.util.ArrayList;

class House{
    String name;
    ArrayList<Room> rooms;
    House(String name) {
        this.name= name;
        this.rooms=new ArrayList<>();
    }
    void createRoom(String name){
        Room r= new Room(name);
        rooms.add(r);
    }
    ArrayList<Room> getRooms(){
        return rooms;
    }
}
class Room{
    String name;
    Room(String name) {
        this.name=name;
    }
    String printDetails(){
        return "Room Name: "+name;
    }
}
public class Composition {
    public static void main(String[] args) {
        House h = new House("Rakesh");
        h.createRoom("Bed Room");
        h.createRoom("Living room");
        h.createRoom("bathroom");
        for(Room room:h.getRooms()){
            System.out.println(room.printDetails());
        }
    }
}
/*
In composition the Classes are with part-of relationship
soo that completely a class is depends on other class
if one class is destroy then other also destroy here if we destroy house then rooms are destroy
and no chance to destroy thr rooms form main methods
 */