class Package {
    // Gönderici ve alıcı bilgileri
    private String senderName;
    private String senderAddress;
    private String senderCity;
    private String senderState;
    private String senderZip;

    private String recipientName;
    private String recipientAddress;
    private String recipientCity;
    private String recipientState;
    private String recipientZip;

    // Paket ağırlığı (ons) ve ons başına maliyet
    private double weight;
    private double costPerOunce;

    // 3. Görev: Constructor (Yapıcı Metot) ve doğrulama
    public Package(String senderName, String senderAddress, String senderCity, String senderState, String senderZip,
                   String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZip,
                   double weight, double costPerOunce) {

        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderCity = senderCity;
        this.senderState = senderState;
        this.senderZip = senderZip;

        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.recipientCity = recipientCity;
        this.recipientState = recipientState;
        this.recipientZip = recipientZip;

        // Ağırlık ve maliyetin pozitif olma zorunluluğu
        if (weight > 0) {
            this.weight = weight;
        } else {
            this.weight = 0;
            System.out.println("Uyarı: Ağırlık pozitif olmalıdır. Varsayılan olarak 0 atandı.");
        }

        if (costPerOunce > 0) {
            this.costPerOunce = costPerOunce;
        } else {
            this.costPerOunce = 0;
            System.out.println("Uyarı: Ons başına maliyet pozitif olmalıdır. Varsayılan olarak 0 atandı.");
        }
    }

    // Getter metotları (Alt sınıflarda hesaplama yapabilmek için gerekli)
    public double getWeight() {
        return weight;
    }

    public double getCostPerOunce() {
        return costPerOunce;
    }

    // 4. Görev: Temel maliyet hesaplama metodu
    public double calculateCost() {
        return weight * costPerOunce;
    }
}
