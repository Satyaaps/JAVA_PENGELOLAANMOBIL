import java.util.Calendar;

class Trailer extends Truk {
    protected int panjangTrailer;

    public Trailer(String merk, int tahunProduksi, int tonase, int panjangTrailer) {
        super(merk, tahunProduksi, tonase);
        this.panjangTrailer = panjangTrailer;
    }

    public double hitungNilaiJual() {
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
        int umur = tahunSekarang - tahunProduksi;
        double nilaiJual = 650000 - (umur * 2500) - (panjangTrailer * 1000);
        return nilaiJual;
    }

    public void informasiTrailer() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Tonase: " + tonase);
        System.out.println("Panjang Trailer: " + panjangTrailer);
        System.out.println("Nilai Jual: " + hitungNilaiJual());
    }

    public void lakukanMaintenance() {
        System.out.println("Maintenance trailer telah dilakukan");
    }
}
