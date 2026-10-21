// 7. Görev: Test Programı (Main Class)
public class Main {
    public static void main(String[] args) {
        System.out.println("=====================================================");
        System.out.println("       PAKET TESLİMAT SİSTEMİ TEST PROGRAMI          ");
        System.out.println("=====================================================\n");

        // Formatlayıcı: Çıktıları daha düzenli göstermek için
        // (Örn: 15.5 yerine 15.50 gibi iki basamaklı göstermek için)

        // --- SENARYO 1: Standart Paket (Normal Gönderim) ---
        System.out.println("--- 1. Standart Paket (Normal Gönderim) ---");
        Package standardPackage1 = new Package(
                "Ahmet Yilmaz", "Ataturk Cad. No:1", "Istanbul", "TR", "34000",
                "Ayse Kaya", "Cumhuriyet Cad. No:5", "Ankara", "TR", "06000",
                10.0, 1.5 // 10 ons ağırlık, ons başına 1.5 TL
        );
        System.out.printf("Ağırlık: 10.0 ons | Ons Ücreti: 1.5 TL%n");
        System.out.printf("Toplam Maliyet: %.2f TL%n%n", standardPackage1.calculateCost());


        // --- SENARYO 2: Standart Paket (Çok Hafif ve Ucuz) ---
        System.out.println("--- 2. Standart Paket (Hafif Gönderi) ---");
        Package standardPackage2 = new Package(
                "Canan Öz", "Menekşe Sok. No:3", "Izmir", "TR", "35000",
                "Burak Şahin", "Papatya Cad. No:9", "Bursa", "TR", "16000",
                2.5, 0.8 // 2.5 ons ağırlık, ons başına 0.8 TL
        );
        System.out.printf("Ağırlık: 2.5 ons | Ons Ücreti: 0.8 TL%n");
        System.out.printf("Toplam Maliyet: %.2f TL%n%n", standardPackage2.calculateCost());


        // --- SENARYO 3: İki Günlük Paket (Sabit Ücretli) ---
        System.out.println("--- 3. İki Günlük Paket (TwoDayPackage) ---");
        TwoDayPackage twoDayPackage1 = new TwoDayPackage(
                "Mehmet Demir", "Inonu Bulvari No:10", "Izmir", "TR", "35000",
                "Fatma Celik", "Barbaros Mah. No:20", "Antalya", "TR", "07000",
                5.0, 2.0, // 5 ons ağırlık, ons başına 2.0 TL
                10.0      // 10 TL sabit ücret (flat fee)
        );
        System.out.printf("Ağırlık: 5.0 ons | Ons Ücreti: 2.0 TL | Sabit Ücret: 10.0 TL%n");
        System.out.printf("Temel Maliyet (5*2): 10.00 TL + Sabit Ücret: 10.00 TL%n");
        System.out.printf("Toplam Maliyet: %.2f TL%n%n", twoDayPackage1.calculateCost());


        // --- SENARYO 4: İki Günlük Paket (Ağır ve Pahalı) ---
        System.out.println("--- 4. İki Günlük Paket (Ağır Kargo) ---");
        TwoDayPackage twoDayPackage2 = new TwoDayPackage(
                "Hasan Yıldız", "Sanayi Sitesi 5. Blok", "Kocaeli", "TR", "41000",
                "Elif Kara", "Universite Mah. No:1", "Eskisehir", "TR", "26000",
                25.0, 3.5, // 25 ons ağırlık, ons başına 3.5 TL
                15.0       // 15 TL sabit ücret
        );
        System.out.printf("Ağırlık: 25.0 ons | Ons Ücreti: 3.5 TL | Sabit Ücret: 15.0 TL%n");
        System.out.printf("Toplam Maliyet: %.2f TL%n%n", twoDayPackage2.calculateCost());


        // --- SENARYO 5: Gece Paketi (OvernightPackage) ---
        System.out.println("--- 5. Gece Paketi (Hızlı Teslimat) ---");
        OvernightPackage overnightPackage1 = new OvernightPackage(
                "Ali Veli", "Gazi Bulvari No:3", "Bursa", "TR", "16000",
                "Zeynep Ak", "Lale Sok. No:7", "Eskisehir", "TR", "26000",
                8.0, 1.5,  // 8 ons ağırlık, ons başına 1.5 TL
                0.75       // Ons başına ek 0.75 TL
        );
        System.out.printf("Ağırlık: 8.0 ons | Ons Ücreti: 1.5 TL | Ons Başına Ek Ücret: 0.75 TL%n");
        System.out.printf("Hesaplama: 8.0 * (1.5 + 0.75)%n");
        System.out.printf("Toplam Maliyet: %.2f TL%n%n", overnightPackage1.calculateCost());


        // --- SENARYO 6: Gece Paketi (Çok Ağır ve Acil) ---
        System.out.println("--- 6. Gece Paketi (Acil Ağır Kargo) ---");
        OvernightPackage overnightPackage2 = new OvernightPackage(
                "Ozan Tekin", "Ticaret Merkezi", "Adana", "TR", "01000",
                "Selin Yılmaz", "Is Bankasi Cad. No:4", "Ankara", "TR", "06000",
                15.0, 2.0, // 15 ons ağırlık, ons başına 2.0 TL
                1.20       // Ons başına ek 1.20 TL
        );
        System.out.printf("Ağırlık: 15.0 ons | Ons Ücreti: 2.0 TL | Ons Başına Ek Ücret: 1.20 TL%n");
        System.out.printf("Toplam Maliyet: %.2f TL%n%n", overnightPackage2.calculateCost());


        // --- SENARYO 7: Hatalı Veri Girişi Testi (Negatif Ağırlık) ---
        System.out.println("--- 7. Hatalı Veri Girişi Testi (Negatif Ağırlık) ---");
        System.out.println("(Sistemin uyarı vermesi ve maliyeti 0 hesaplaması beklenir)");
        Package invalidPackage = new Package(
                "Test Gonderici", "Adres 1", "Sehir 1", "ST", "11111",
                "Test Alici", "Adres 2", "Sehir 2", "ST", "22222",
                -5.0, 2.0 // Negatif ağırlık denemesi
        );
        System.out.printf("Toplam Maliyet: %.2f TL%n%n", invalidPackage.calculateCost());


        // --- SENARYO 8: Hatalı Veri Girişi Testi (Negatif Ons Ücreti) ---
        System.out.println("--- 8. Hatalı Veri Girişi Testi (Negatif Ons Ücreti) ---");
        System.out.println("(Sistemin uyarı vermesi ve maliyeti 0 hesaplaması beklenir)");
        Package invalidPackage2 = new Package(
                "Test Gonderici 2", "Adres 3", "Sehir 3", "ST", "33333",
                "Test Alici 2", "Adres 4", "Sehir 4", "ST", "44444",
                10.0, -1.5 // Negatif ons ücreti denemesi
        );
        System.out.printf("Toplam Maliyet: %.2f TL%n%n", invalidPackage2.calculateCost());

        System.out.println("=====================================================");
        System.out.println("                 TESTLER TAMAMLANDI                   ");
        System.out.println("=====================================================");
    }
}