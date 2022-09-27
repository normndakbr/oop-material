// Percobaan 10
package constructorShirt10;

public class ConstructorShirt1Test {
    public static void main(String[] args) {
        ConstructorShirt1 constShirt = new ConstructorShirt1('R');
        char kodewarna;
        kodewarna = constShirt.getKodeWarna();
        System.out.println("Kode warna: " + kodewarna);
    }
}
