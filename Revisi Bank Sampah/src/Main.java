public class Main {
    public static void main(String[] args) {
        int menu=0,i=0,j,cari;
        sampah[] data=new sampah[1024];
        data[i]=new sampah();
        data[i].setId();
        while(menu!=6){
            System.out.println("menu...\\n1.input\\t\\t2.view\\n3.search\\t4.update\\n5.delete\\t6.exit\\n : ");
            menu= Jenissampah.in.nextInt();
            if(menu==1) {
                i++;
                data[i] = new sampah();
                data[i].setId(data[i - 1].getId());
                data[i].setData();
            }else if(menu==2){
                if(i<1)
                    System.out.println("Data Kosong");
                else{
                    j=0;
                    while(j<i){
                        System.out.println("   "+j+"   ");
                        data[j].tampil();
                    }
                }
            }else if(menu==3 || menu==4 || menu==5){
                System.out.println("Masukkan id sampah : ");
                cari= sampah.in.nextInt();
                j=1;
                while(j<=1){
                    if(data[j].getId()==cari)
                        break;
                    j++;
                }
                if (j<=i){
                    if(menu==3)
                        data[j].tampil();
                    else if(menu==4){
                        data[j].tampil();
                        data[j].setData();
                    }
                    else{
                        while(j<i){
                            data[j]=data[j+1];
                            j++;
                        }
                        i--;
                        System.out.println("Berhasil dihapus");
                    }
                }
                else
                    System.out.println("Data tidak ditemukan");
            }else if(menu==6)
                System.out.println("Keluar");
            else
                System.out.println("Menu salah");
        }
    }
}