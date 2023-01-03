public class AplikasiSampah {
    public static void main(String[] args) {
        // TODO code application logic here
        JenisSampah jenisSampah1 = new JenisSampah();
        Client client1 = new Client();
        Petugas petugas1 = new Petugas();
        Transaksi transaksi1 = new Transaksi();
        Laporan laporan1 = new Laporan();

        //Menampilkan jenis sampah dan client
        laporan1.laporan(jenisSampah1);
        laporan1.laporan(client1);

        //Proses sampah
        transaksi1.prosesTransaksi(client1, transaksi1, jenisSampah1);

        //Menampilkan tabel client dan histori
        laporan1.laporan(transaksi1, jenisSampah1);


    }
}
