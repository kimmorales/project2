package Logic;

/**
 *
 * @author Kimberly
 */
public class Room {
    private int ID;
    private String description;

    public Room(int ID, String description) {
        this.ID = ID;
        this.description = description;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
   
    
    
            
}
