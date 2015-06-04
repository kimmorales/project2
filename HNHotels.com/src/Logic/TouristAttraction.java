package Logic;

/**
 *
 * @author Kimberly
 */
public class TouristAttraction {
    private String ID;
    private String name;

    public TouristAttraction(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
