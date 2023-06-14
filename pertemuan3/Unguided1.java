package pertemuan3;

import java.util.Scanner;
public class Unguided1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String pilihan, paket = "";
        int totalBiaya = 0;

        System.out.println("Selamat datang di Flo Beauty Clinic !!! ");
        System.out.println("Pilihlah paket treatment yang diinginkan : ");
        System.out.println("1. Paket Gold");
        System.out.println("2. Paket Platinum");
        System.out.println("3. Paket Silver");
        System.out.println("Pilih (1/2/3): ");
        pilihan = input.nextLine();

        switch (pilihan) {
            case "1":
                paket = "Paket Gold";
                totalBiaya += 550000;
                System.out.println("Anda memilih Paket Gold");
                System.out.println("Benefit yang Anda dapatkan:");
                System.out.println("- Korean Facial");
                System.out.println("- Detox + IPL + Laser Glowing");
                System.out.println("- Free Member Diskon 15% untuk layanan berikutnya");
                break;
            case "2":
                paket = "Paket Platinum";
                totalBiaya += 450000;
                System.out.println("Anda memilih Paket Platinum");
                System.out.println("Benefit yang Anda dapatkan:");
                System.out.println("- Acne Facial");
                System.out.println("- Detox + Laser Acne ");
                System.out.println("- Free Member Diskon 15% untuk layanan berikutnya");
                break;
            case "3":
                paket = "Paket Silver";
                totalBiaya += 150000;
                System.out.println("Anda memilih Paket Silver");
                System.out.println("Benefit yang Anda dapatkan:");
                System.out.println("- Natural Facial");
                System.out.println("- Free Member Diskon 15% untuk layanan berikutnya");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                System.exit(0);
        }

        System.out.println("Total biaya untuk " + paket + " adalah Rp " + totalBiaya);

        System.out.println("Apakah Anda ingin memilih treatment lain ? (y/n)");
        String jawaban = input.nextLine();

        while (jawaban.equalsIgnoreCase("y")) {
            System.out.println("Pilihlah paket treatment yang diinginkan :");
            System.out.println("1. Paket Gold");
            System.out.println("2. Paket Platinum");
            System.out.println("3. Paket Silver");
            System.out.println("Pilih (1/2/3): ");
            pilihan = input.nextLine();

            switch (pilihan) {
                case "1":
                    paket += ", Paket A";
                    totalBiaya += 550000;
                    System.out.println("Anda memilih Paket Gold");
                    break;
                case "2":
                    paket += ", Paket B";
                    totalBiaya += 450000;
                    System.out.println("Anda memilih Paket Platinum");
                    break;
                case "3":
                    paket += ", Paket Silver";
                    totalBiaya += 150000;
                    System.out.println("Anda memilih Paket Silver");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
            System.out.println("Total biaya untuk " + paket + " adalah Rp " + totalBiaya);
            System.out.println("Apakah Anda ingin memilih treatment lain ? (y/n)");
            jawaban = input.nextLine();
        }
    }
}
