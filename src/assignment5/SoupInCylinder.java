package assignment5;

public class SoupInCylinder extends Soup
{
    private int radius;
    private int height;
    
    public SoupInCylinder(String id, double someUnitPrice, int someRadius, int someHeight) {
        super(id, someUnitPrice);
        radius = someRadius;
        height = someHeight;
    }
    
    public void computeTotalPrice() {
        int volume = (int)(Math.PI*(radius*radius*height));
        totalPrice = volume * unitPrice;
    }
    
    public String toString() {
        String info = "\nThe Soup in a Cylinder Container\n" +
                      "The Radius:\t\t" + radius + "\n" + 
                      "The Height:\t\t" + height + "\n" +
                      "The SoupId:\t\t" + soupId + "\n" +
                      "The Volume:\t\t" + volume + "\n" +
                      "The Unit Price:\t\t" + unitPrice + "\n" +
                      "The Total Price:\t" + totalPrice + "\n";
        return info;
    }
}