package org.example;

public class Soru5 {
    // ilk metinle ikinci metin arasındaki aynı kelimeleri ilk metinden çıkartarak ikinci metni yazan metof
    public static String squeeze(String ilkYazı,String ikinciYazı){
        // eğer metin boş veya null ise ilk metni döndürür
        if(ilkYazı == null || ikinciYazı == null || ilkYazı.isEmpty() || ikinciYazı.isEmpty()){
            return ilkYazı;
        }
        StringBuilder result = new StringBuilder(); // yeni sonucun yazılacağı string oluşturulur
        for(int i=0; i<ilkYazı.length(); i++) {
            char yakalachar = ilkYazı.charAt(i); //ilk yazıdaki mevcut karakterleri al
            //eğer ikinci metinde bu karakter yoksa bunu yazdır
            if(ikinciYazı.indexOf(yakalachar)== -1){
                result.append(yakalachar);
            }
        }
        return result.toString(); // oluşan sonucu sting e çevir ve döndür
        }
        public static void main(String[] args){
        String yazı1 = "Merhabalar ben gökay ";
        String yazı2 = "Akdeniz Üniversitesinde okuyorum";
        String squeezedText = squeeze(yazı1,yazı2);
        // sonuçları ekrana yazdırma
            System.out.println("ilkYazı" +yazı1);
            System.out.println("ikinciyazı"+ yazı2);
            System.out.println("Squeezed Text "+squeezedText);
        }
}
