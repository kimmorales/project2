package Logic;

import java.util.GregorianCalendar;

/**
 *
 * @author Kimberly
 */
public class Card {
    private String owner;
    private String cardType;
    private int cardNumber;
    private String securityCode;
    private GregorianCalendar expirationDate;

    public Card(String owner, String cardType, int cardNumber, String securityCode, GregorianCalendar expirationDate) {
        this.owner = owner;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
        this.expirationDate = expirationDate;
    }
    
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public GregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(GregorianCalendar expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    
}
