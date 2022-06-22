package Entity;

public class KamarEntity {
    private String nama_kamar, ukuran, ket_kamar;
    private int id, status;
    
    public KamarEntity(){};
    
    public KamarEntity(int id, String nama_kamar, String ukuran, String ket_kamar, int satus){
        this.nama_kamar = nama_kamar;
        this.ukuran = ukuran;
        this.ket_kamar = ket_kamar;
    }

    public String getNama_kamar() {
        return nama_kamar;
    }

    public void setNama_kamar(String nama_kamar) {
        this.nama_kamar = nama_kamar;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getKet_kamar() {
        return ket_kamar;
    }

    public void setKet_kamar(String ket_kamar) {
        this.ket_kamar = ket_kamar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
