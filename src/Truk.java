import java.util.Calendar;

class Truk extends Kendaraan implements Maintenance {
    protected int tonase;

    public Truk(String merk, int tahunProduksi, int tonase) {
        super(merk, tahunProduksi);
        this.tonase = tonase;
    }

    public double hitungNilaiJual() {
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
        int umur = tahunSekarang - tahunProduksi;
        double nilaiJual = 300000 - (umur * 2500);
        return nilaiJual;
    }  

    public void informasiTruk() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Tonase: " + tonase);
        System.out.println("Nilai Jual: " + hitungNilaiJual());
    }

    public void lakukanMaintenance() {
        System.out.println("Maintenance truk telah dilakukan");
    }
}
