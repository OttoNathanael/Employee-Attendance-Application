package TugasBesar;

public class Pegawai {
    public String NIP;
    public String Nama;
    public String Alamat;
    public String Jabatan;
    public String Hp;

    public Pegawai(String NIP, String nama, String alamat, String jabatan, String hp) {
        this.NIP = NIP;
        this.Nama = nama;
        this.Alamat = alamat;
        this.Jabatan = jabatan;
        this.Hp = hp;
    }

    public Pegawai(String nip, String nama) {
        this.NIP = nip;
        this.Nama = nama;
    }

    public Pegawai(String nip, String nama, String jabatan) {
        this.NIP = nip;
        this.Nama = nama;
        this.Jabatan = jabatan;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        this.Alamat = alamat;
    }

    public String getJabatan() {
        return Jabatan;
    }

    public void setJabatan(String jabatan) {
        this.Jabatan = jabatan;
    }

    public String getHp() {
        return Hp;
    }

    public void setHp(String hp) {
        this.Hp = hp;
    }
}
