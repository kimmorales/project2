package Logic;
import Interface.LoginWindow;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 *
 * @author Kimberly
 */
public class HNHotelsCom {
    private static Global global = Global.getInstance();
    /**
     * @param args the command line arguments
     */
    
    public static User searchUser(String ID){
        for(User temporalUser : global.getInstance().getUsersList()){
            if(temporalUser.getID().toLowerCase().equals(ID)){
                return temporalUser;
            }
        }
        return null;
    }
    public static Category searchCategory(int category){
        for(Category categoryToSearch: global.getCategoryList()){
            if(categoryToSearch.getCode() == category){
                return categoryToSearch;
            }
        }
        return null;
    }
    public static Hotel searchHotel(String name){
        for(Hotel temporalHotel : global.getHotelsList()){
            if(temporalHotel.getName().equals(name))
                return temporalHotel;
        }
        return null;
    }
    
    public static void main(String[] args) {
         new LoginWindow().setVisible(true);
         Category category = new Category(123,345,"firstCategory");
         Hotel newHotel = new Hotel("HotelFlorencia","florencia","CR",23456, 23546,
         "hotel", 1000, 3, 6, "nothing", 4, category);
         global.getHotelsList().add(newHotel);
         UserFactory factory = new UserFactory();
         User User1 = factory.addNewUser("1234","Kimberly", "Morales","Female","kim123", "kim123", 0, 12345, "CR","colon");
         User User2 = factory.addNewUser("12321","Vale","Morales","Female","valem", "123",1,123,"CR","dollar");
         global.getUsersList().add(User2);
         global.getUsersList().add(User1);
        
    } 
    public static GregorianCalendar createDate(int day, int month){
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.set(Calendar.DAY_OF_MONTH,day);
        calendario.set(Calendar.MONTH,month);
        return calendario;
    }
        
    
    
}
