package Logic;

import java.util.ArrayList;
/**
 *
 * @author Kimberly
 */
public class Register {
    private String responsiblePerson;
    private int numberAdult;
    private int numberChildren;
    private ArrayList<Room> roomsSelectedList;

    public Register(String responsiblePerson, int numberAdult, int numberChildren) {
        this.responsiblePerson = responsiblePerson;
        this.numberAdult = numberAdult;
        this.numberChildren = numberChildren;
        this.roomsSelectedList = new ArrayList();
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public int getNumberAdult() {
        return numberAdult;
    }

    public void setNumberAdult(int numberAdult) {
        this.numberAdult = numberAdult;
    }

    public int getNumberChildren() {
        return numberChildren;
    }

    public void setNumberChildren(int numberChildren) {
        this.numberChildren = numberChildren;
    }

    public ArrayList<Room> getRoomsSelectedList() {
        return roomsSelectedList;
    }

    public void setRoomsSelectedList(ArrayList<Room> roomsSelectedList) {
        this.roomsSelectedList = roomsSelectedList;
    }
    public void AddRoom(Room room){
        this.roomsSelectedList.add(room);
    }
    
}
