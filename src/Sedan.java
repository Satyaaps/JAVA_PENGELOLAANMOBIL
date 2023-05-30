import java.util.Calendar;

class Sedan extends Mobil {
    protected int kapasitasMesin;

    public Sedan(String merk, int tahunProduksi, String warna, int kapasitasMesin) {
        super(merk, tahunProduksi, warna);
        this.kapasitasMesin = kapasitasMesin;
    }

    public double hitungNilaiJual() {
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
        int umur = tahunSekarang - tahunProduksi;
        double nilaiJual = 500000 - (umur * 750) - (kapasitasMesin * 200);
        return nilaiJual;
    }

    public void informasiSedan() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Warna: " + warna);
        System.out.println("Nilai Jual: " + hitungNilaiJual());
        System.out.println("Kapasitas Mesin: " + kapasitasMesin);
    }
}
