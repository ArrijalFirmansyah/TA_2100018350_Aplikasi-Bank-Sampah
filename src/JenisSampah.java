import java.util.ArrayList;
public class JenisSampah {

    private ArrayList<String> namaJenisSampah = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();


    public JenisSampah() {
        this.namaJenisSampah.add("Jenis Sampah Origanik");
        this.harga.add(6000);
        this.namaJenisSampah.add("Jenis sampah Anorganik ");
        this.harga.add(7500);
        this.namaJenisSampah.add("Jenis sampah Daur Ulang");
        this.harga.add(9000);
    }
    public int getJmlJenisSampah(){
        return this.namaJenisSampah.size();
    }
    public void setNamaJenisSampah(String namaJenisSampah ){
        this.namaJenisSampah.add(namaJenisSampah);
    }
    public String getNamaJenisSampah(int idJenisSampah){
        return this.namaJenisSampah.get(idJenisSampah);
    }
    public void setHarga(int harga ){
        this.harga.add(harga);
    }
    public int getHarga(int idJenisSampah){
        return this.harga.get(idJenisSampah);
    }
}

