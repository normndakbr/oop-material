// Percobaan 11

package constructorShirtTest1112;

public class ConstructorShirt2 {
    private int idBaju = 0;
    private String keterangan = "-Keterangan Diperlukan-";
    private char kodewarna = 'U';
    private double harga = 0.0;
    private int jmlStok = 0;

    public ConstructorShirt2() {
        kodewarna = 'R';
    }

    public ConstructorShirt2(char kodeAwal) {
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

    public ConstructorShirt2(char kodeAwal, int jmlAwal) {
        switch (kodeAwal) {
            case 'R':
            case 'G':
            case 'B':
                kodewarna = kodeAwal;
                break;
            default:
                System.err.println("kodewarna salah, gunakan R, G, atau B");
        }

        if (jmlAwal > 0 && jmlAwal < 2000) {
            jmlStok = jmlAwal;
        } else {
            System.out.println("Jumlah salah, harus diantara 0 - 2000");
        }
    }

    public char getKodeWarna() {
        return kodewarna;
    }

    public int getJmlStok() {
        return jmlStok;
    }
}
