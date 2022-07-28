import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double para,kdv,kdvTutari,kdvliPara;
        boolean kdvOranı;

        System.out.print("KDV'sini Hesaplamak İstediginiz Tutarı Giriniz: ");
        para = scan.nextInt();

        kdvOranı = (0 < para) && (1000 > para);
        kdv = kdvOranı ? 0.18 : 0.8;

        kdvTutari = kdv * para;
        kdvliPara = kdvTutari + para;

        System.out.println("KDV'siz Fiyat = " + para);
        System.out.println("KDV Oranı = " + kdv);
        System.out.println("KDV Tutarı = " + kdvTutari);
        System.out.println("KDV'li Fiyat = " + kdvliPara);

    }
}