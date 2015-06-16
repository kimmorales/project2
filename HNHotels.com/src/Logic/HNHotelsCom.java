package Logic;
import Interface.LoginWindow;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
/**
 *
 * @author Kimberly
 */
public class HNHotelsCom {
    private static final Global global = Global.getInstance();
    
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
    
    public static Room searchRoom(Hotel hotel,KindOfRoom kindRoom,int id){
        for(Room temporalRoom : kindRoom.getRoomsList()){
           if(temporalRoom.getID()==id){
               return temporalRoom;
           }
        }
        return null;
        
    }
    
    public static Price searchPrice(Season season ,String code){
        for(Price temporalPrice : season.getSeasonPriceList()){
            if(temporalPrice.getPriceCode().equals(code))
                return temporalPrice;
        }
        return null;
    }
    public static Season searchSeason(Hotel hotel, String code){
        for(Season temporalSeason : hotel.getSeasons()){
            if(temporalSeason.getCode().equals(code))
                return temporalSeason;
        }
        return null;
    }
   
    
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
        global.addHotel(hotel4);
        global.addHotel(hotel3);
        global.addHotel(hotel2);
        global.addHotel(hotel1);
        
        UserFactory factory = new UserFactory();
        User User1 = factory.addNewUser("1234","Kimberly", "Morales","Female","kim123", "kim123", 0, 12345, "CR","colon");
        User User2 = factory.addNewUser("12321","Vale","Morales","Female","valem", "123",1,123,"CR","dollar");
        global.getUsersList().add(User2);
        global.getUsersList().add(User1);
        Price price1 = new Price("12ab", 200, "$");
        Price price2 = new Price("123qwerty",100,"colon");
        KindOfRoom kindRoom1 = new KindOfRoom(1,"doble", 2, 3,true, true, true,false);
        KindOfRoom kindRoom2 = new KindOfRoom(3,"suit",4, 2,false, true, true,false);
        Room room1 = new Room(1234, "double");
        Room room2 = new Room(14, "single");
        Room room3 = new Room(234,"suit");
        hotel1.addKindRoom(kindRoom1);
        hotel1.addKindRoom(kindRoom2);
        hotel2.addKindRoom(kindRoom2);
        hotel2.addKindRoom(kindRoom1);
        kindRoom1.addRoom(room1);
        kindRoom1.addRoom(room2);
        kindRoom2.addRoom(room3);
        Season summer = new Season("123a","summer",createDate(2, 7),createDate(5, 9));
        Season winter = new Season("qw12","winter",createDate(3,9),createDate(3,1));
        hotel1.addSeason(summer);
        hotel1.addSeason(winter);
        hotel2.addSeason(summer);
        summer.addRoomSeason(kindRoom2);
        summer.addRoomSeason(kindRoom1);
        winter.addRoomSeason(kindRoom1);
        Register register1 = new Register("Kimberly",2, 0);
        Register register2 = new Register("Yanle", 2, 4);
        register1.AddRoom(room1);
        register2.AddRoom(room3);
        Reserve reserve1 = new Reserve("12qw334", createDate(2, 2),createDate(4,2),1, true);
        Reserve reserve2 = new Reserve("asd12", createDate(2, 5),createDate(4, 5),2, true);
        reserve1.addRegister(register1);
        reserve2.addRegister(register2);
        hotel1.addReservation(reserve2);
        hotel1.addReservation(reserve1);
        hotel3.addSeason(summer);
        
        summer.addPrice(price2);
        summer.addPrice(price1);
        global.addReservesComplete(reserve1);
        global.addReservesComplete(reserve2);
        Customer customer = (Customer)User2;
        customer.addNewReserve(reserve1);
        customer.addNewReserve(reserve2);
       
    } 
    public static GregorianCalendar createDate(int day, int month){
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.set(Calendar.DAY_OF_MONTH,day);
        calendario.set(Calendar.MONTH,month);
        return calendario;
        
        
    }
    
    public static String generateIDReserve(Customer customer){
        Random random = new Random();
        String ID = "#";
        String options = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        for(int i = 0;i < 10;i++){
            ID += options.charAt((int)(random.nextDouble() * (options.length()) + 0));
        }
        for(Reserve temporalReserve : customer.getReserveList()){
            if(temporalReserve.getCode().equals(ID)){
                return generateIDReserve(customer);
            }
        }
        return ID;
    }
    
    

}
