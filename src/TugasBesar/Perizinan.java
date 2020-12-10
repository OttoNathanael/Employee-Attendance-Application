package TugasBesar;

public class Perizinan extends Pegawai{
    public String Alasan;
    public String LamaWaktu;
    public String JenisIzin;
    public String Tanggal;
    public String NoSurat;


    public Perizinan(String nip, String nama, String jabatan, String alasan, String lamawaktu, String jenisizin, String tanggal, String nosurat) {
        super(nip, nama, jabatan);
        this.Alasan = alasan;
        this.LamaWaktu = lamawaktu;
        this.JenisIzin = jenisizin;
        this.Tanggal = tanggal;
        this.NoSurat = nosurat;
    }

    public String getAlasan() {
        return Alasan;
    }

    public void setAlasan(String alasan) {
        Alasan = alasan;
    }

    public String getLamaWaktu() {
        return LamaWaktu;
    }

    public void setLamaWaktu(String lamaWaktu) {
        LamaWaktu = lamaWaktu;
    }

    public String getJenisIzin() {
        return JenisIzin;
    }

    public void setJenisIzin(String jenisIzin) {
        JenisIzin = jenisIzin;
    }

    public String getTanggal() {
        return Tanggal;
    }

    public void setTanggal(String tanggal) {
        Tanggal = tanggal;
    }

    public String getNoSurat() {
        return NoSurat;
    }

    public void setNoSurat(String noSurat) {
        NoSurat = noSurat;
    }
}
