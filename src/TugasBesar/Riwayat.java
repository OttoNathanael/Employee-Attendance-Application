package TugasBesar;

public class Riwayat extends Pegawai {
    public String tanggal;
    public String jamMasuk;
    public String minKeluar;
    public String jamKeluar;

    public Riwayat(String tanggal, String NIP, String nama, String JamMasuk, String minKeluar, String JamKeluar) {
        super(NIP, nama);
        this.tanggal = tanggal;
        this.jamMasuk = JamMasuk;
        this.minKeluar = minKeluar;
        this.jamKeluar = JamKeluar;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJamMasuk() {
        return jamMasuk;
    }

    public void setJamMasuk(String jamMasuk) {
        this.jamMasuk = jamMasuk;
    }

    public String getMinKeluar() {
        return minKeluar;
    }

    public void setMinKeluar(String minKeluar) {
        this.minKeluar = minKeluar;
    }

    public String getJamKeluar() {
        return jamKeluar;
    }

    public void setJamKeluar(String jamKeluar) {
        this.jamKeluar = jamKeluar;
    }
}
