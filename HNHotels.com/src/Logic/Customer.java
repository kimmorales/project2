package Logic;

import java.util.ArrayList;

/**
 *
 * @author Kimberly
 */
public class Customer extends User{
    private String country;
    private String currency;
    private ArrayList<Card> customerCards; 
    private int membershipNumber;
    private ArrayList<Reserve> reserveList;

    public Customer(int membershipNumber, String country, String currency, 
   String ID, String name, String lastName, String genre, String email, String password, int phoneNumber, int type) {
        super(ID, name, lastName, genre, email, password, phoneNumber, type);
        this.membershipNumber = membershipNumber;
        this.country = country;
        this.currency = currency;
        this.customerCards = new ArrayList();
        this.reserveList = new ArrayList();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ArrayList<Card> getCustomerCards() {
        return customerCards;
    }

    public void setCustomerCards(ArrayList<Card> customerCards) {
        this.customerCards = customerCards;
    }

    public int getMembershipNumber() {
        return membershipNumber;
    }

    public void setMembershipNumber(int membershipNumber) {
        this.membershipNumber = membershipNumber;
    }

    public ArrayList<Reserve> getReserveList() {
        return reserveList;
    }

    public void setReserveList(ArrayList<Reserve> reserveList) {
        this.reserveList = reserveList;
    }
    
    public void deleteReserve(int i){
                this.reserveList.remove(i);
    }
    
    public Reserve searchReserve(String code){
        for(Reserve temporalReserve : this.reserveList){
            if(temporalReserve.getCode().equals(code));
            return temporalReserve;
        }
        return null;
    }
    
    public void addNewReserve(Reserve reserve){
        this.reserveList.add(reserve);
    }
    
    public void editProfile(String country, int phoneNumber, String currency){
        this.country = country;
        this.currency=currency;
        super.setPhoneNumber(phoneNumber);
    }
    
    
}
