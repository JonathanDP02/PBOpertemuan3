import java.util.Scanner;

public class TestKoperasi {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Membuat objek anggota
        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        int pilihan;
        do {
            System.out.println("\n=== Menu Koperasi ===");
            System.out.println("1. Pinjam Uang");
            System.out.println("2. Bayar Angsuran");
            System.out.println("3. Lihat Jumlah Pinjaman");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah pinjaman: ");
                    int pinjam = input.nextInt();
                    donny.pinjam(pinjam);
                    System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());
                    break;

                case 2:
                    System.out.print("Masukkan jumlah angsuran: ");
                    int angsur = input.nextInt();
                    donny.angsur(angsur);
                    System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());
                    break;

                case 3:
                    System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());
                    break;

                case 0:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        input.close();
    }
}
