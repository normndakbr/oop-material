// Percobaan 14
package shirtTwo14;

public class ShirtTwo {
    public int ShirtID = 0;
    public String description = "-description required-";
    public char colorCode = 'U';
    public double price = 0.0;
    public int quantityInStock = 0;

    public void setShirtInfo(int ID, String desc, double cost) {
        ShirtID = ID;
        description = desc;
        price = cost;
    }

    public void setShirtInfo(int ID, String desc, double cost, char color) {
        ShirtID = ID;
        description = desc;
        price = cost;
        colorCode = color;
    }

    public void setShirtInfo(int ID, String desc, double cost, char color, int quantity) {
        ShirtID = ID;
        description = desc;
        price = cost;
        colorCode = color;
        quantityInStock = quantity;
    }

    public void display() {
        System.out.println("Item ID : " + ShirtID);
        System.out.println("Item description : " + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Item price : " + price);
        System.out.println("Quantity in stock : " + quantityInStock);
    }
}
