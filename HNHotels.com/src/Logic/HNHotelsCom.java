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
    private static final Global global = Global.getInstance();
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
    public static KindOfRoom searchKindOfRoom(Hotel hotel,String id){
        for(KindOfRoom temporalKind : hotel.getKindOfRoomList()){
            if(temporalKind.getBedType().equals(id)){
                return temporalKind;
            }
        }
        return null;
    }
    /*
    public static kindOfRoom(Hotel hotel,KindOfRoom kindRoom){
        for(Room temporalRoom : kindRoom.getRoomsList()){
           
        }
    }
    */
    public static void main(String[] args) {
        new LoginWindow().setVisible(true);
        Category category1 = new Category(123,345,"firstCategory");
        Category category2 = new Category(345,68789,"secondCategory");
        Category category3 = new Category(6587,36767,"thirdCategory");
        global.getCategoryList().add(category1);
        global.getCategoryList().add(category2);
        global.getCategoryList().add(category3);
        Hotel hotel1 = new Hotel("HotelFlorencia","florencia","CR",23456, 23546,
        "hotel", 1000, 3, 6, "nothing", 4, category1);
        Hotel hotel2 = new Hotel("HotelPatito","santaclara","CR",23456,1947,"hostel",
        345677,7, 7,"nothing",3,category1);
        Hotel hotel3 = new Hotel("HotelF","fortuna","CR",456,2012,"cabina",
        3445,9,8,"nothing",3,category2);
        Hotel hotel4 = new Hotel("HotelJavilos","javillos","CR",26,2015,"hotel",
        3456,10, 10,"nothing",1,category3);
        global.getHotelsList().add(hotel4);
        global.getHotelsList().add(hotel3);
        global.getHotelsList().add(hotel2);
        global.getHotelsList().add(hotel1);
        
        UserFactory factory = new UserFactory();
        User User1 = factory.addNewUser("1234","Kimberly", "Morales","Female","kim123", "kim123", 0, 12345, "CR","colon");
        User User2 = factory.addNewUser("12321","Vale","Morales","Female","valem", "123",1,123,"CR","dollar");
        global.getUsersList().add(User2);
        global.getUsersList().add(User1);
        
        KindOfRoom kindRoom1 = new KindOfRoom(1,"doble", 2, 3,true, true, true,false);
        KindOfRoom kindRoom2 = new KindOfRoom(3,"suit",4, 2,false, true, true,false);
        Room room1 = new Room(1234, "double");
        hotel1.addKindRoom(kindRoom1);
        hotel2.addKindRoom(kindRoom2);
        hotel2.addKindRoom(kindRoom1);
        kindRoom1.addRoom(room1);
        
    } 
    public static GregorianCalendar createDate(int day, int month){
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.set(Calendar.DAY_OF_MONTH,day);
        calendario.set(Calendar.MONTH,month);
        return calendario;
    }
    
    
    
}
