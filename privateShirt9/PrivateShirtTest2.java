// Percobaan 9
package privateShirt9;

public class PrivateShirtTest2 {
    public static void main(String[] args) {
        PrivateShirt2 privShirt = new PrivateShirt2();
        char kodeWarna;

        privShirt.setKodeWarna('R');
        kodeWarna = privShirt.getKodeWarna();

        System.out.println("Kode Warna : " + kodeWarna);

        privShirt.setKodeWarna('Z');
        kodeWarna = privShirt.getKodeWarna();

        System.out.println("Kode Warna : " + kodeWarna);
    }
}
