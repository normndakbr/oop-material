// Percobaan 8
package privateShirt8;

public class PrivateShirtTest1 {
    public static void main(String[] args) {
        PrivateShirt1 privShirt = new PrivateShirt1();
        char kodeWarna;

        privShirt.setKodeWarna('R');
        kodeWarna = privShirt.getKodeWarna();

        System.out.println("Kode Warna : " + kodeWarna);

        privShirt.setKodeWarna('Z');
        kodeWarna = privShirt.getKodeWarna();

        System.out.println("Kode Warna : " + kodeWarna);

    }
}
