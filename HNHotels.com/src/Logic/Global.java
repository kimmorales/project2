package Logic;

import java.util.ArrayList;

/**
 *
 * @author Kimberly
 */
public class Global {
    public static Global instance;
    private ArrayList<Hotel> hotelsList;
    private ArrayList<User> usersList;
    private ArrayList<Service> servicesList;
    private ArrayList<Category> categoryList;
    private ArrayList<Reserve> cancelReservationsList;
    private ArrayList<Reserve> completeReservationList;
    private int userCount;

    public Global() {
    }

    public static Global getInstance() {
        if(instance == null){
            instance = new Global();
            instance.hotelsList = new ArrayList();
            instance.usersList = new ArrayList();
            instance.servicesList = new ArrayList();
            instance.categoryList = new ArrayList();
            instance.cancelReservationsList = new ArrayList();
            instance.completeReservationList = new ArrayList();
            instance.userCount = 0;
        }
        return instance;
    }

    public ArrayList<Hotel> getHotelsList() {
        return hotelsList;
    }

    public void setHotelsList(ArrayList<Hotel> hotelsList) {
        instance.hotelsList = hotelsList;
    }

    public ArrayList<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(ArrayList<User> usersList) {
        instance.usersList = usersList;
    }

    public ArrayList<Service> getServicesList() {
        return servicesList;
    }

    public void setServicesList(ArrayList<Service> servicesList) {
        instance.servicesList = servicesList;
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        instance.userCount= userCount;
    }
    
    public void addNewUser(User user){
        instance.usersList.add(user);
    }

    public ArrayList<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(ArrayList<Category> categoryList) {
        instance.categoryList = categoryList;
    }
    public void addHotel(Hotel hotel){
        instance.hotelsList.add(hotel);
    }

    public ArrayList<Reserve> getCancelReservationsList() {
        return cancelReservationsList;
    }

    public void setCancelReservationsList(ArrayList<Reserve> cancelReservationsList) {
        instance.cancelReservationsList = cancelReservationsList;
    }

    public ArrayList<Reserve> getCompleteReservationList() {
        return completeReservationList;
    }

    public void setCompleteReservationList(ArrayList<Reserve> completeReservationList) {
        instance.completeReservationList = completeReservationList;
    }
    
    public void addCancelReserves(Reserve reserve){
        instance.cancelReservationsList.add(reserve);
    }
    public void addReservesComplete(Reserve reserve){
        instance.completeReservationList.add(reserve);
    }
    
}
