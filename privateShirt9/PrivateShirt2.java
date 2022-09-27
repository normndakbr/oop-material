// Percobaan 9
package privateShirt9;

public class PrivateShirt2 {
    private int idbBaju = 0; // ID default untuk baju
    private String keterangan = "- Keterangan Diperlukan-"; // default
    // kode warna R=Merah,G=Hijau,B=Biru,U=Tidak Ditentukan
    private char kodeWarna = 'U';
    private double harga = 0.0; // Harga default untuk semua barang
    private int jmlStok = 0; // Default untuk jumlah barang

    // method accessor/getter
    public char getKodeWarna() {
        return kodeWarna;

    }

    // method mutator/setter
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
    // Method get dan set untuk idBaju,keterangan
    // harga,dan jmlStock akan mengikuti
    // akhir kelas
}
