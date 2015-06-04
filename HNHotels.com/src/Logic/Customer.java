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

    public Customer(int membershipNumber, String country, String currency, 
   String ID, String name, String lastName, String genre, String email, String password, int phoneNumber, int type) {
        super(ID, name, lastName, genre, email, password, phoneNumber, type);
        this.membershipNumber = membershipNumber;
        this.country = country;
        this.currency = currency;
        this.customerCards = new ArrayList();
        
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
    
    
   
    
}
