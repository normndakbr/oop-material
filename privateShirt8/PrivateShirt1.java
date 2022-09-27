// Percobaan 8
package privateShirt8;

public class PrivateShirt1 {
    private int idbBaju = 0;
    private String keterangan = "- Keterangan Diperlukan-";
    private char kodeWarna = 'U';
    private double harga = 0.0;
    private int jmlStok = 0;

    public char getKodeWarna() {
        return kodeWarna;
    }

    public void setKodeWarna(char kode) {
        kodeWarna = kode;
    }
}
