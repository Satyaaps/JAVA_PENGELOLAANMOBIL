import java.util.Calendar;

class SUV extends Mobil {
    protected int kapasitasPenumpang;

    public SUV(String merk, int tahunProduksi, String warna, int kapasitasPenumpang) {
        super(merk, tahunProduksi, warna);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public double hitungNilaiJual() {
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
        int umur = tahunSekarang - tahunProduksi;
        double nilaiJual = 800000 - (umur * 5000) - (kapasitasPenumpang * 1000);
        return nilaiJual;
    }

    public void informasiSUV() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Warna: " + warna);
        System.out.println("Nilai Jual: " + hitungNilaiJual());
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang);
    }
}
