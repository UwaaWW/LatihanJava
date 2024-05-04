import java.util.Scanner;

public class luasLingkaran {

    public static void main(String[] args) {
        int  angka;
        double hasil;

        System.out.println(" Program Menghitung Luas Lingkaran ");
        System.out.println("===================================");
        System.out.print("masukkan angka  : ");
        Scanner input = new Scanner(System.in);
        angka = input.nextInt();

        hasil = 3.14 * angka *angka;
        
        System.out.println("Hasilnya adalah "+ hasil);
    }
}