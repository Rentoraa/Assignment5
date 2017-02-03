package assignment5;

public class SoupInBox extends Soup
{
    private int height;
    private int width;
    private int depth;
    
    public SoupInBox(String id, double someUnitPrice, int someHeight, int someWidth, int someDepth) {
        super(id, someUnitPrice);
        height = someHeight;
        width = someWidth;
        depth = someDepth;
    }
    
    public void computeTotalPrice() {
        int volume = height * width * depth;
        totalPrice = volume * unitPrice;
    }
    
    public String toString() {
        String info = "\nThe Soup in a Box Container\n" +
                      "The Height:\t\t" + height + "\n" +
                      "The Width:\t\t" + width + "\n" +
                      "The Depth:\t\t" + depth + "\n" +
                      "The SoupId:\t\t" + soupId + "\n" + 
                      "The Volume:\t\t" + volume + "\n" +
                      "The Unit Price:\t\t" + unitPrice + "\n" + 
                      "The Total Price:\t" + totalPrice + "\n\n";
        return info;
    }
}