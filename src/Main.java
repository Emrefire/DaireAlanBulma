import javax.swing.*;
class Main {
    public static void main(String[] args) {
         String s1 =JOptionPane.showInputDialog("Yaricap giriniz: ");
         String s2 =JOptionPane.showInputDialog("Yay Uzunluğunu giriniz: ");
         Alan ds = new Alan();
         ds.r = Double.parseDouble(s1);
         ds.yay = Double.parseDouble(s2);
         double sonuc1 = ds.alanHesapla();
         double sonuc2 = ds.cevreHesapla();
         double sonuc3 = ds.daireDilimAlanHesapla();
         System.out.println("Dairenin Alanı= " + sonuc1);
         System.out.println("Dairenin Çevresi= " + sonuc2);
         System.out.println("Dairenin dilim Alanı= " + sonuc3);
    }
}