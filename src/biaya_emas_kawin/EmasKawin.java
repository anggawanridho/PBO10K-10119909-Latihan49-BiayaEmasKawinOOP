package biaya_emas_kawin;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

class EmasKawin {
    private double berat, hargaPerGram;

    public EmasKawin(double berat, int hargaPerGram) {
        this.berat = berat;
        this.hargaPerGram = hargaPerGram;
    }

    public EmasKawin(double berat) {
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    public double getHargaPerGram() {
        return hargaPerGram;
    }

    public double totalPembayaran(double berat,double hargaPerGram){
        return berat * hargaPerGram;
    }
}
