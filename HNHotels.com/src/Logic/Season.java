package Logic;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Kimberly
 */
public class Season {
    private String code;
    private String name;
    private int stays;
    private GregorianCalendar startDate;
    private GregorianCalendar endDate;
    private ArrayList<KindOfRoom> seasonRoomList;
    private ArrayList<Price> seasonPriceList;
    private ArrayList<Reserve> reservationList;

    public Season(String code, String name, GregorianCalendar startDate, GregorianCalendar endDate) {
        this.code = code;
        this.name = name;
        this.stays = 0;
        this.startDate = startDate;
        this.endDate = endDate;
        this.seasonRoomList= new ArrayList();
        this.seasonPriceList = new ArrayList();
        this.reservationList = new ArrayList();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStays() {
        return stays;
    }

    public void updateStays() {
        this.stays +=1;
    }

    public GregorianCalendar getStartDate() {
        return startDate;
    }

    public void setStartDate(GregorianCalendar startDate) {
        this.startDate = startDate;
    }

    public GregorianCalendar getEndDate() {
        return endDate;
    }

    public void setEndDate(GregorianCalendar endDate) {
        this.endDate = endDate;
    }

    public ArrayList<KindOfRoom> getSeasonRoomList() {
        return seasonRoomList;
    }

    public void setSeasonRoomList(ArrayList<KindOfRoom> seasonRoomList) {
        this.seasonRoomList = seasonRoomList;
    }

    public ArrayList<Price> getSeasonPriceList() {
        return seasonPriceList;
    }

    public void setSeasonPriceList(ArrayList<Price> seasonPriceList) {
        this.seasonPriceList = seasonPriceList;
    }
    
    public void addRoomSeason(KindOfRoom room){
        this.seasonRoomList.add(room);
    }
    public void addPrice(Price price){
        this.seasonPriceList.add(price);
    }
    
    public void plusStaysForReserve(){
        this.stays+=1;
    }

    public ArrayList<Reserve> getReservationList() {
        return reservationList;
    }

    public void setReservationList(ArrayList<Reserve> reservationList) {
        this.reservationList = reservationList;
    }
    
    public void addReserve(Reserve reserve){
        this.reservationList.add(reserve);
    }
}
