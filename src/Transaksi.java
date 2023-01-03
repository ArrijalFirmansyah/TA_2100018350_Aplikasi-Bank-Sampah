
import java.util.ArrayList;
import java.util.Scanner;
public class Transaksi {

    private ArrayList<Integer> idJenisSampah = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idClient = new ArrayList<Integer>();

    public Transaksi() {
        this.idClient.add(0);
        this.idJenisSampah.add(0);
        this.banyak.add(2);
        this.idClient.add(0);
        this.idJenisSampah.add(1);
        this.banyak.add(3);
        this.idClient.add(1);
        this.idJenisSampah.add(0);
        this.banyak.add(1);
        this.idClient.add(1);
        this.idJenisSampah.add(2);
        this.banyak.add(2);
    }

    public void prosesTransaksi(Client client, Transaksi transaksi, JenisSampah jenisSampah) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\n======SILAHKAN !======");
        System.out.print("Masukkan Id Client              : ");
        int idClient = myObj.nextInt();
        System.out.println("Selamat datang " + client.getNama(idClient));
        ArrayList<Integer> idJenisSampah = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i = 0;
        int temp = 0;
        do {
            System.out.print("Masukkan kode jenis sampah    : ");
            temp = myObj.nextInt();
            if (temp != 99) {
                idJenisSampah.add(temp);
                System.out.print(jenisSampah.getNamaJenisSampah(idJenisSampah.get(i)) + " sebanyak(kg)  : ");
                banyak.add(myObj.nextInt());
                i++;
            }
        } while (temp != 99);

        System.out.println("\nTransaksi belanja " + client.getNama(idClient) + " sebagai berikut");
        System.out.println("Nama Barang \t\tBanyak(kg) \tHarga \t\tJumlah");

        int total = 0;
        int x = idJenisSampah.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * jenisSampah.getHarga(idJenisSampah.get(j));
            total += jumlah;
            System.out.println(jenisSampah.getNamaJenisSampah(idJenisSampah.get(j)) + "\t"
                    + banyak.get(j) + "\t" + "\t"
                    + "Rp."+ jenisSampah.getHarga(idJenisSampah.get(j)) + "/kg" + "\t"
                    + "Rp" + jumlah);
            transaksi.setTransaksi(jenisSampah, idClient, idJenisSampah.get(j),
                    banyak.get(j));
        }

        System.out.println("\n===========LAPORAN TRANSAKSI & SALDO===========");
        System.out.println("Total Sampah      : Rp." + total);
    }



    public void setTransaksi(JenisSampah jenisSampah, int idClient, int idJenisSampah, int banyaknya) {
        this.idClient.add(idClient);
        this.idJenisSampah.add(idJenisSampah);
        this.banyak.add(banyaknya);
    }

    public int getIdJenisSampah(int id) {
        return this.idJenisSampah.get(id);
    }

    public int getBanyaknya(int id) {
        return this.banyak.get(id);
    }

    public int getIdClient(int id) {
        return this.idClient.get(id);
    }

    public int getJmlTransaksi() {
        return this.idClient.size();
    }
}

