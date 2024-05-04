import java.util.Scanner;

public class perbandingan {
    public static void main(String[] args) {
        int angka;

        System.out.println("nilai rata - rata algoritma dan pemrograman yakni 70");
        System.out.print("masukkan nilai : ");
        Scanner input = new Scanner(System.in);
        angka = input.nextInt();

        if (angka > 70 ){
            System.out.println("Selamat Kamu LULUS");
        } else {System.out.println("Maaf Kamu TIDAK LULUS");}
    }
    
}