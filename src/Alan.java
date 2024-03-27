public class Alan {
    double r;
    double yay;
    double alanHesapla(){
        return 3.14*r*r;
    }
    double cevreHesapla(){
        return 2*3.14*r;
    }
    double daireDilimAlanHesapla(){
        double merkez= 180*(yay/r)/3.14;
        return (3.14*(r*r)*merkez / 360);
    }
}
