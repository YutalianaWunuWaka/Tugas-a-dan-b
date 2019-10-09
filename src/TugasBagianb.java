
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TugasBagianb {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int diskon;
        int hargatotal = 0;
        String jenis[] = new String[100];
        int harga[] = new int[100];
        String keputusan = "Y";

        System.out.println("===========Daftar Merk Printer=========");
        System.out.println("---------------------------------------");
        System.out.println("1. Printer Canon Pixma iP2770 = Rp 750000 ");
        System.out.println("2. Printer Epson T20          = Rp 660000 ");
        System.out.println("3. Printer Hp Deskjet         = Rp 800000 ");

        while (keputusan.equals("Y") || keputusan.equals("y")) {
            System.out.println("Pilihan Jenis Printer = ");
            int pil = input.nextInt();
            if (pil == 1) {
                jenis[i] = ("Printer Canon Pixma iP2770");
                harga[i] = 750000;
            } else if (pil == 2) {
                jenis[i] = ("Printer Epson T20");
                harga[i] = 660000;
            } else if (pil == 3) {
                jenis[i] = ("Printer Hp Deskjet");
                harga[i] = 800000;
            } else {
                System.out.println("Maaf Pilihan Anda Tidak Tepat");
                jenis[i] = "Tidak Ada";
            }
            System.out.println("Jenis Printer yang Anda Pesan           : " + jenis[i]);
            System.out.println("Harga yang harus dibayar                : " + harga[i]);
            System.out.println("Apakah Anda ingin memesan lagi ? Y/T    : ");
            try {
                keputusan = input2.readLine();
            } catch (IOException e) {
                System.out.println("Gagal Membaca Keywoard");
            }
            i++;
        }
        System.out.println("");
        System.out.println("Printer yang Anda Pesan adalah      : " + i);
        for (int a = 0; a < i; a++) {
            System.out.println(jenis[a] + ". ");
        }
        for (int b = 0; b < i; b++) {
            hargatotal = hargatotal + harga[b];
            System.out.println("Total Seluruh      : Rp" + hargatotal);
        }
        System.out.println("");
        System.out.println("Total Yang Harus Anda Bayar Adalah      : Rp. " + hargatotal);

        System.out.println("");
        if (hargatotal > 1500000) {
            diskon = hargatotal * 15 / 100;
            hargatotal = hargatotal - diskon;
            System.out.println("Diskon=15%\n" + "Rp" + hargatotal);
        } else if (hargatotal < 1500000) {
            diskon = hargatotal * 0 / 100;
            hargatotal = hargatotal - diskon;
            System.out.println("Diskon = Rp" + diskon);
        }

    }
}
