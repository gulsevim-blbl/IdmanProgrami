
public class idman {
    private  int burpee_sayisi ;
    private int pushup_sayisi;
    private  int situp_sayisi;
    private  int  squats_sayisi;

    public idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squats_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squats_sayisi = squats_sayisi;
    }

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquats_sayisi() {
        return squats_sayisi;
    }

    public void setSquats_sayisi(int squats_sayisi) {
        this.squats_sayisi = squats_sayisi;
    }
    
    public void hareketYap (String hareketTuru, int sayi){
        
        if (hareketTuru.equals("Burpee")) {
            burpeeYap(sayi);
        }
        else if (hareketTuru.equals("Pushup")) {
            pushupYap(sayi);
        }
        else if (hareketTuru.equals("situp")) {
            situpYap(sayi);
        }
        else if (hareketTuru.equals("Squats")) {
            squatsYap(sayi);
        }
        else{
            System.out.println("Boyle bir hareket mevcut degildir...");
        }
    }
    
    public void squatsYap(int sayi){
        if (squats_sayisi == 0) {
            System.out.println("Yapacak squats kalmadi..");
        }else if (squats_sayisi - sayi < 0) {
            System.out.println("Hedefledigin squats sayisini gectin TEBRİKLER...");
            squats_sayisi = 0;
            System.out.println("Kalan squats:" + squats_sayisi);
            
        }else{
            squats_sayisi -= sayi;
            
            System.out.println("Kalan squats:" + squats_sayisi);
        }
    }
    
    
    
    
    public void situpYap(int sayi){
        if (situp_sayisi == 0) {
            System.out.println("Yapacak situp kalmadi..");
        }else if (situp_sayisi - sayi < 0) {
            System.out.println("Hedefledigin situp sayisini gectin TEBRİKLER...");
            situp_sayisi = 0;
            System.out.println("Kalan situp:" + situp_sayisi);
            
        }else{
            situp_sayisi -= sayi;
            
            System.out.println("Kalan situp:" + situp_sayisi);
        }
    }
    
    
    
    public void pushupYap(int sayi){
        if (pushup_sayisi == 0) {
            System.out.println("Yapacak pushup kalmadi..");
        }else if (pushup_sayisi - sayi < 0) {
            System.out.println("Hedefledigin pushup sayisini gectin TEBRİKLER...");
            burpee_sayisi = 0;
            System.err.println("Kalan pushup:" + pushup_sayisi);
            
        }else{
            pushup_sayisi -= sayi;
            
            System.out.println("Kalan pushup:" + pushup_sayisi);
        }
    }
    
    public void burpeeYap(int sayi){
        if (burpee_sayisi == 0) {
            System.out.println("Yapacak burpee kalmadi..");
        }else if (burpee_sayisi - sayi < 0) {
            System.out.println("Hedefledigin burpee sayisini gectin TEBRİKLER...");
            burpee_sayisi = 0;
            System.out.println("Kalan Burpee:" + burpee_sayisi);
            
        }else{
            burpee_sayisi -= sayi;
            
            System.out.println("Kalan Burpee:" + burpee_sayisi);
        }
    }
    
    public  boolean idmanBittiMi(){
        
        return (burpee_sayisi == 0) && (pushup_sayisi==0) && (situp_sayisi== 0) && (squats_sayisi == 0);
    }
}
