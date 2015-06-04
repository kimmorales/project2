package Logic;

/**
 *
 * @author Kimberly
 */
public class Admin extends User{

    public Admin(String ID, String name, String lastName, String genre, String email, String password, int phoneNumber, int type) {
        super(ID, name, lastName, genre, email, password, phoneNumber, type);
    }

    public void addNewHotel(Hotel newHotel){
        Global.getInstance().getHotelsList().add(newHotel);
    }
    
    
}
