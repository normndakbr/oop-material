package constructorDefault;

public class DefaultShirt {
    private int idbBaju = 0;
    private String keterangan = "- Keterangan Diperlukan-";
    private char kodeWarna = 'U';
    private double harga = 0.0;
    private int jmlStok = 0;

    public DefaultShirt() {
        kodeWarna = 'R';
    }

    public char getKodeWarna() {
        return kodeWarna;
    }
}
