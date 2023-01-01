import java.util.Scanner;

public class sampah extends Jenissampah{
    Scanner input = new Scanner(System.in);
    int idSampah,harga,jumlah,total;
    String nama;
    @Override
    public void setData(){

        System.out.println("Nama Jenis Sampah : ");
        nama = input.nextLine();
        System.out.println("Harga Sampah /kg : ");
        this.harga=in.nextInt();
        System.out.println("Jumlah Sampah /kg : ");
        this.jumlah=in.nextInt();
        this.total=this.harga*this.jumlah;
    }
    @Override
    public void tampil(){
        System.out.println("Id Samapah : "+this.idSampah);
        System.out.println("Nama Jenis Sampah : "+this.nama);
        System.out.println("Harga Sampah /kg  : "+this.harga);
        System.out.println("Jumlah Sampah /kg : "+this.jumlah);
        System.out.println("Total             : "+this.total);
    }
    @Override
    public int getId(){
        return this.idSampah;
    }
    @Override
    public void setId(){
        this.idSampah=983829;
    }
    @Override
    public void setId(int id){
        this.idSampah=id+1;
    }
}
