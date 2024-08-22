import java.util.Scanner;

public class barang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan harga awal barang yang sudah kamu beli: ");
        double hargaAwal = input.nextDouble();

        
        System.out.print("Masukkan persentase diskon yang kamu dapat (dalam %): ");
        double mendapatDiskon = input.nextDouble();

        
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = input.nextInt();

        
        double diskon = hargaAwal * (mendapatDiskon / 100);

        
        double totalHarga = (hargaAwal - diskon) * jumlahBarang;

       
        System.out.println("Total harga setelah diskon: " + totalHarga);

        input.close();
    }
}