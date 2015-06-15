package Logic;

import java.util.ArrayList;
import java.util.logging.Logger;
import javafx.scene.input.TouchPoint;
import javax.swing.ImageIcon;

/**
 *
 * @author Kimberly
 */
public class Hotel {
    private String name;
    private String address;
    private String country;
    private int phoneNumber;
    private int yearBuilt;
    private String typeOfLodging;
    private int hotelSize;
    private int checkInHour;
    private int checkOutHour;
    private String requirements;
    private int starsNumber;   
    private ArrayList<TouristAttraction> touristAtractions;
    private ArrayList<Room> roomList;
    private ArrayList<Service> services;
    private ArrayList<ImageIcon> images;
    private ArrayList<Reserve> reserveList;
    private ArrayList<Season> seasons;
    private ArrayList<KindOfRoom> kindOfRoomList;
    private Category hotelCategory;

    public Hotel(String name, String adress, String country, int phoneNumber, int yearBuilt,
    String typeOfLodging, int hotelSize, int checkInHour, int checkOutHour, String requirements,
    int starsNumber,Category category) {
        this.name = name;
        this.address = adress;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.yearBuilt = yearBuilt;
        this.typeOfLodging = typeOfLodging;
        this.hotelSize = hotelSize;
        this.checkInHour = checkInHour;
        this.checkOutHour = checkOutHour;
        this.requirements = requirements;
        this.starsNumber = starsNumber;
        this.hotelCategory = category;
        this.images = new ArrayList();
        this.kindOfRoomList = new ArrayList();
        this.reserveList = new ArrayList();
        this.touristAtractions = new ArrayList();
        this.reserveList = new ArrayList();
        this.seasons = new ArrayList();
        this.roomList = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getTypeOfLodging() {
        return typeOfLodging;
    }

    public void setTypeOfLodging(String typeOfLodging) {
        this.typeOfLodging = typeOfLodging;
    }

    public int getHotelSize() {
        return hotelSize;
    }

    public void setHotelSize(int hotelSize) {
        this.hotelSize = hotelSize;
    }

    public int getCheckInHour() {
        return checkInHour;
    }

    public void setCheckInHour(int checkInHour) {
        this.checkInHour = checkInHour;
    }

    public int getCheckOutHour() {
        return checkOutHour;
    }

    public void setCheckOutHour(int checkOutHour) {
        this.checkOutHour = checkOutHour;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public int getStarsNumber() {
        return starsNumber;
    }

    public void setStarsNumber(int starsNumber) {
        this.starsNumber = starsNumber;
    }

    public ArrayList<TouristAttraction> getTouristAtractions() {
        return touristAtractions;
    }

    public void setTouristAtractions(ArrayList<TouristAttraction> touristAtractions) {
        this.touristAtractions = touristAtractions;
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }

    public ArrayList<ImageIcon> getImages() {
        return images;
    }
    
    public void setImages(ArrayList<ImageIcon> images) {
        this.images = images;
    }

    public ArrayList<Reserve> getReserveList() {
        return reserveList;
    }

    public void setReserveList(ArrayList<Reserve> reserveList) {
        this.reserveList = reserveList;
    }

    public int getNumberOfReservations(){
        return(this.reserveList.size());
    }
    public ArrayList<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(ArrayList<Season> seasons) {
        this.seasons = seasons;
    }

    public Category getHotelCategory() {
        return hotelCategory;
    }

    public void setHotelCategory(Category hotelCategory) {
        this.hotelCategory = hotelCategory;
    }

    public ArrayList<KindOfRoom> getKindOfRoomList() {
        return kindOfRoomList;
    }

    public void setKindOfRoomList(ArrayList<KindOfRoom> kindOfRoomList) {
        this.kindOfRoomList = kindOfRoomList;
    }
    public void addKindRoom(KindOfRoom newRoom){
      if(this.kindOfRoomList.size() > 0){
            //It is first.
            if(kindOfRoomList.get(0).getFloor() >= newRoom.getFloor())
                this.kindOfRoomList.add(0, newRoom);
            //It is the last.
            else if(this.kindOfRoomList.get(this.kindOfRoomList.size()-1).getFloor()<=newRoom.getFloor())
                this.kindOfRoomList.add(newRoom);
            else{
                for(int i = 1;i<this.kindOfRoomList.size();i++){
                    if(this.kindOfRoomList.get(i).getFloor()> newRoom.getFloor()){
                        this.kindOfRoomList.add(i,newRoom);
                        break;
                    }
                }
            }
        }
        
        else
            this.kindOfRoomList.add(newRoom);
    }
    public void addNewRoom(Room room){
        this.roomList.add(room);
    }
    
    public void addAtraction(TouristAttraction atraction){
        this.touristAtractions.add(atraction);
    }
    public void addHotelServive(Service service){
        this.services.add(service);
    }
    
    public void registerSeason(Season season){
        this.seasons.add(season);
    }
    
    public int getReserveCount(){
        return this.reserveList.size();
    }
    
    public void addSeason(Season season){
        this.seasons.add(season);
    }
    
}
