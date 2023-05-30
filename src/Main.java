import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan informasi Sedan:");
        System.out.print("Merk: ");
        String merkSedan = scanner.nextLine();
        System.out.print("Tahun Produksi: ");
        int tahunProduksiSedan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan new line
        System.out.print("Warna: ");
        String warnaSedan = scanner.nextLine();
        System.out.print("Kapasitas Mesin: ");
        int kapasitasMesinSedan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan new line

        Sedan sedan = new Sedan(merkSedan, tahunProduksiSedan, warnaSedan, kapasitasMesinSedan);

        System.out.println("\nMasukkan informasi SUV:");
        System.out.print("Merk: ");
        String merkSUV = scanner.nextLine();
        System.out.print("Tahun Produksi: ");
        int tahunProduksiSUV = scanner.nextInt();
        scanner.nextLine(); // Membersihkan new line
        System.out.print("Warna: ");
        String warnaSUV = scanner.nextLine();
        System.out.print("Kapasitas Penumpang: ");
        int kapasitasPenumpangSUV = scanner.nextInt();
        scanner.nextLine(); // Membersihkan new line

        SUV suv = new SUV(merkSUV, tahunProduksiSUV, warnaSUV, kapasitasPenumpangSUV);

        System.out.println("\nMasukkan informasi Trailer:");
        System.out.print("Merk: ");
        String merkTrailer = scanner.nextLine();
        System.out.print("Tahun Produksi: ");
        int tahunProduksiTrailer = scanner.nextInt();
        scanner.nextLine(); // Membersihkan new line
        System.out.print("Tonase: ");
        int tonaseTrailer = scanner.nextInt();
        scanner.nextLine(); // Membersihkan new line
        System.out.print("Panjang Trailer: ");
        int panjangTrailer = scanner.nextInt();
        scanner.nextLine(); // Membersihkan new line

        Trailer trailer = new Trailer(merkTrailer, tahunProduksiTrailer, tonaseTrailer, panjangTrailer);

        scanner.close();

        System.out.println("\nNilai Jual Sedan: " + sedan.hitungNilaiJual());
        sedan.informasiSedan();

        System.out.println("\nNilai Jual SUV: " + suv.hitungNilaiJual());
        suv.informasiSUV();

        System.out.println("\nNilai Jual Trailer: " + trailer.hitungNilaiJual());
        trailer.informasiTrailer();

        Bengkel.cekKondisiKendaraan(trailer);
    }
}
