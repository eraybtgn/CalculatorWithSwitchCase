import java.util.Scanner;

public class Calcu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hesap makinesinde işlem yapmak istediğniz rakamları giriniz.");
        int i1 = scan.nextInt(); // Kullanıcıdan sayılar alındı
        int i2 = scan.nextInt();
        System.out.println("Şimdi yapmak istediğiniz işlemi seçiniz.");
        System.out.println("1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4- Bölme ");
        int option = scan.nextInt(); // Yapılacak işlem seçildi
        switch (option){
            case 1:
                System.out.println(i1+i2);
                break;
            case 2:
                System.out.println(i1-i2);
                break;
            case 3:
                System.out.println(i1*i2);
                break;
            case 4:
                System.out.println(i1/i2);
                break;
        }
    }
}
