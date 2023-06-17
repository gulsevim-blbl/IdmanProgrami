
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("Idman Programina Hosgeldiniz");
        
        String idmanlar = "Gecerli Hareketler...\n" 
                            +"Burpee\n"
                            +"Pushup(Sinav)\n"
                            +"Situp(Mekik)\n"
                            +"Squats";
        System.out.println(idmanlar);
        
        System.out.println("Bir Idman Olusturun....");
        
        System.out.println("Burpee Sayisi:");
        int burpee = scanner.nextInt();
         System.out.println("situp Sayisi:");
        int situp = scanner.nextInt();
         System.out.println("pushup Sayisi:");
        int pushup = scanner.nextInt();
         System.out.println("squat Sayisi:");
        int squat = scanner.nextInt();
        
        scanner.nextLine();
        
        
        idman Idman = new idman(burpee, pushup, situp, squat);
        
        System.out.println("Idmaniniz Basliyor...");
        
        while (Idman.idmanBittiMi() == false) {  
            
            System.out.println("Hareket Turu(Burpee,squat,pushup,situp):");
            
            String tur = scanner.nextLine();
            System.out.println("Bu Hareketten Kac Tane Yapacaksiniz? :");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            Idman.hareketYap(tur,sayi);
            
        }
        
        System.out.println("Idmaninizi Basarili Ile Bitirdiniz. ");
    }
    
}
