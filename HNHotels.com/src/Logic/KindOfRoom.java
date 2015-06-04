package Logic;

import java.util.ArrayList;

/**
 *
 * @author Kimberly
 */
public class KindOfRoom {
    private int floor;
    private String bedType;
    private int maximumNumberGuests;
    private int roomSize;
    private boolean hasLoungeOrTerrace;
    private boolean hasSeaview;
    private boolean allIncluded;
    private boolean smokedPermission;
    private ArrayList<Room> roomsList;

    public KindOfRoom(int floor, String bedType, int maximumNumberGuests, int roomSize,
    boolean hasLoungeOrTerrace, boolean hasSeaview, boolean allIncluded, boolean smokedPermission){
        this.floor = floor;
        this.bedType = bedType;
        this.maximumNumberGuests = maximumNumberGuests;
        this.roomSize = roomSize;
        this.hasLoungeOrTerrace = hasLoungeOrTerrace;
        this.hasSeaview = hasSeaview;
        this.allIncluded = allIncluded;
        this.smokedPermission = smokedPermission;
        this.roomsList = new ArrayList();
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public int getMaximumNumberGuests() {
        return maximumNumberGuests;
    }

    public void setMaximumNumberGuests(int maximumNumberGuests) {
        this.maximumNumberGuests = maximumNumberGuests;
    }

    public int getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(int roomSize) {
        this.roomSize = roomSize;
    }

    public boolean isHasLoungeOrTerrace() {
        return hasLoungeOrTerrace;
    }

    public void setHasLoungeOrTerrace(boolean hasLoungeOrTerrace) {
        this.hasLoungeOrTerrace = hasLoungeOrTerrace;
    }

    public boolean isHasSeaview() {
        return hasSeaview;
    }

    public void setHasSeaview(boolean hasSeaview) {
        this.hasSeaview = hasSeaview;
    }

    public boolean isAllIncluded() {
        return allIncluded;
    }

    public void setAllIncluded(boolean allIncluded) {
        this.allIncluded = allIncluded;
    }

    public boolean isSmokedPermission() {
        return smokedPermission;
    }

    public void setSmokedPermission(boolean smokedPermission) {
        this.smokedPermission = smokedPermission;
    }

    public ArrayList<Room> getRoomsList() {
        return roomsList;
    }

    public void setRoomsList(ArrayList<Room> roomsList) {
        this.roomsList = roomsList;
    }
    
    
    
    
}
