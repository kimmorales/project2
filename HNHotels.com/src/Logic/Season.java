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
    private ArrayList<Room> seasonRoomList;
    private ArrayList<Price> seasonPriceList;

    public Season(String code, String name, GregorianCalendar startDate, GregorianCalendar endDate) {
        this.code = code;
        this.name = name;
        this.stays = 0;
        this.startDate = startDate;
        this.endDate = endDate;
        this.seasonRoomList= new ArrayList();
        this.seasonPriceList = new ArrayList();
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

    public ArrayList<Room> getSeasonRoomList() {
        return seasonRoomList;
    }

    public void setSeasonRoomList(ArrayList<Room> seasonRoomList) {
        this.seasonRoomList = seasonRoomList;
    }

    public ArrayList<Price> getSeasonPriceList() {
        return seasonPriceList;
    }

    public void setSeasonPriceList(ArrayList<Price> seasonPriceList) {
        this.seasonPriceList = seasonPriceList;
    }
    
    
}
