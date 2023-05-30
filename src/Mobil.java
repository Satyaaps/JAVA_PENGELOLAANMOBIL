import java.util.Calendar;

class Mobil extends Kendaraan {
    protected String warna;

    public Mobil(String merk, int tahunProduksi, String warna) {
        super(merk, tahunProduksi);
        this.warna = warna;
    }

    public double hitungNilaiJual() {
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
        int umur = tahunSekarang - tahunProduksi;
        double nilaiJual = 800000 - (umur * 5000);
        return nilaiJual;
    }

    // ...
}