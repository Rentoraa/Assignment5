package assignment5;

public abstract class Soup
{
    protected int volume = 0;
    protected double unitPrice;
    protected double totalPrice = 0.0;
    protected String soupId;
    
    public Soup(String id, double someUnitPrice) {
        soupId = id;
        unitPrice = someUnitPrice;
    }
    
    public String getSoupId() { //returns the soup ID
        return soupId;
    }
    
    public abstract void computeTotalPrice();
    
    public String toString() {
        String info = "\nThe SoupId:\t\t" + soupId + "\n" +
                      "The Volume:\t\t" + volume + "\n" +
                      "The Unit Price:\t\t" + unitPrice + "\n" +
                      "The Total Price\t" + totalPrice + "\n\n";
        return info;
    }
}