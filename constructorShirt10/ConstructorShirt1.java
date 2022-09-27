// Percobaan 10
package constructorShirt10;

public class ConstructorShirt1 {
    private int idBaju = 0;
    private String keterangan = "-Keterangan Diperlukan-";
    private char kodewarna = 'U';
    private double harga = 0.0;
    private int jmlStok = 0;

    public ConstructorShirt1(char kodeAwal) {
        switch (kodeAwal) {
            case 'R':
            case 'G':
            case 'B':
                kodewarna = kodeAwal;
                break;
            default:
                System.err.println("kodewarna salah, gunakan R, G, atau B");
        }
    }

    public char getKodeWarna() {
        return kodewarna;
    }
}
