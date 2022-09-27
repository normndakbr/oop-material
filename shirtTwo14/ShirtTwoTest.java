// Percobaan 14
package shirtTwo14;

public class ShirtTwoTest {
    public static void main(String[] args) {
        ShirtTwo shirt = new ShirtTwo();
        shirt.setShirtInfo(01, "A Cheap Shirt", 25.000);

        ShirtTwo shirt2 = new ShirtTwo();
        shirt2.setShirtInfo(02, "A Best Shirt", 40.000, 'G', 40);

        shirt.display();
        shirt2.display();
    }
}
