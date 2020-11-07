package biaya_emas_kawin;

import java.util.Locale;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class PBO10K10119909Latihan49 {

    public static void main(String[] args) {
        double berat, harga, totalBayar;
        EmasKawin hendi = new EmasKawin(15.7,570000);

        berat = hendi.getBerat();
        harga = hendi.getHargaPerGram();
        totalBayar = hendi.totalPembayaran(berat,harga);
        System.out.printf("Berat Emas yang dibeli : %.1f gram%n", berat);
        System.out.printf(Locale.ITALY,"Harga Emas per gram : Rp. %,.0f%n", harga);
        System.out.printf(Locale.ITALY,"Harga yang harus dibayarkan adalah : Rp. %,.0f%n",totalBayar);
    }
}
