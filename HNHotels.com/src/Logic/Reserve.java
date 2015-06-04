package Logic;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Kimberly
 */
public class Reserve {
    private GregorianCalendar entryDate;
    private GregorianCalendar departureDate;
    private int numbersNights;
    private ArrayList<Register> registerList;
    private boolean state;

    public Reserve(GregorianCalendar entryDate, GregorianCalendar departureDate, int numbersNights,boolean state) {
        this.entryDate = entryDate;
        this.departureDate = departureDate;
        this.numbersNights = numbersNights;
        this.registerList = new ArrayList();
        this.state = state;
    }

    public GregorianCalendar getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(GregorianCalendar entryDate) {
        this.entryDate = entryDate;
    }

    public GregorianCalendar getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(GregorianCalendar departureDate) {
        this.departureDate = departureDate;
    }

    public int getNumbersNights() {
        return numbersNights;
    }

    public void setNumbersNights(int numbersNights) {
        this.numbersNights = numbersNights;
    }

    public ArrayList<Register> getRegisterList() {
        return registerList;
    }

    public void setRegisterList(ArrayList<Register> registerList) {
        this.registerList = registerList;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
    
    
}
