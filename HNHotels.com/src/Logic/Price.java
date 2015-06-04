
package Logic;

/**
 *
 * @author Kimberly
 */
public class Price {
    String priceCode;
    int amount;
    String currency;

    public Price(String priceCode, int amount, String currency) {
        this.priceCode = priceCode;
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(String priceCode) {
        this.priceCode = priceCode;
    }
    
    
}
