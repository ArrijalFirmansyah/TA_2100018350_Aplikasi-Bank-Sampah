public class Laporan {

    public void laporan(JenisSampah jenisSampah){
        int x=jenisSampah.getJmlJenisSampah();

        System.out.println("\n============TABEL JENIS SAMPAH============");
        System.out.println("Nama Jenis Sampah \tHarga/kg");
        for (int i = 0; i < x; i++) {
            System.out.println(jenisSampah.getNamaJenisSampah(i)+"\t"+ jenisSampah.getHarga(i) + "/kg");
        }
    }
    public void laporan(Client client){
        int x=client.getJmlClient();

        System.out.println("\n============TABEL CLIENT============");
        System.out.println("Nama \tAlamat \t\tTelepon \tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println(client.getNama(i)+"\t"+
                    client.getAlamat(i)+"\t"+client.getTelepon(i)+"\t"+ "Rp." +
                    client.getSaldo(i));
        }
    }
    public void laporan(Transaksi transaksi, JenisSampah jenisSampah){
        int x=transaksi.getJmlTransaksi();

        System.out.println("\n============HISTORI BANK SAMPAH============");
        System.out.println("Nama Jenis Sampah\tJumlah(kg) \tHarga/kg \t\tJumlah");

        int total=0;
        for (int i = 0; i < x; i++) {
            int
                    jumlah=transaksi.getBanyaknya(i)*jenisSampah.getHarga(transaksi.getIdJenisSampah(i));
            total+=jumlah;

            System.out.println(jenisSampah.getNamaJenisSampah(transaksi.getIdJenisSampah(i))+"\t"+

                    transaksi.getBanyaknya(i)+ "kg"+ "\t" +"\t"+ "Rp." + jenisSampah.getHarga(transaksi.getIdJenisSampah(i))+ "/kg" + "\t" + "\t"
                    + "Rp."+ jumlah);
        }
        System.out.println("Total Omset       : Rp."+ total);
    }
}
