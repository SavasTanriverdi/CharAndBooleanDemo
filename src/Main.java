public class Main {
    public static void main(String[] args) {

        // char veri tipi (tek bir Unicode karakteri temsil eder)
        char harf = 'A';
        System.out.println("Karakter Değeri: " + harf);

        // Unicode kullanarak char tanımlama
        char unicodeHarf = '\u0042'; // Unicode değeri 'B' harfine karşılık gelir
        System.out.println("Unicode Karakter Değeri: " + unicodeHarf);

        // boolean veri tipi (true veya false değerlerini alır)
        boolean isJavaFun = true;
        System.out.println("Java Eğlenceli mi? " + isJavaFun);

        boolean isFishTasty = false;
        System.out.println("Balık Lezzetli mi? " + isFishTasty);

        // Karşılaştırma işlemleriyle boolean değerler elde etme
        int a = 10;
        int b = 20;
        boolean compareResult = a > b;
        System.out.println("a, b'den büyük mü? " + compareResult);

        // Karakterlerin sayısal değerlerini gösterme
        int harfAscii = harf;
        System.out.println("Karakterin ASCII Değeri: " + harfAscii);

        // Boolean değerlerin koşullarda kullanılması
        if (isJavaFun) {
            System.out.println("Evet, Java eğlencelidir!");
        } else {
            System.out.println("Hayır, Java eğlenceli değildir.");
        }
    }
}
