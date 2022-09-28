// Percobaan 9
package privateShirt9;

public class PrivateShirt2 {
    private int idbBaju = 0;
    private String keterangan = "- Keterangan Diperlukan-";

    private char kodeWarna = 'U';
    private double harga = 0.0;
    private int jmlStok = 0;

    public char getKodeWarna() {
        return kodeWarna;
    }

    public void setKodeWarna(char kode) {
        switch (kode) {
            case 'R':
            case 'G':
            case 'B':
                kodeWarna = kode;
                break;
            default:
                System.out.println("Kode warna salah, gunakan R, G, atau B");
        }
    }
}
