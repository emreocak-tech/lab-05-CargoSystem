class TwoDayPackage extends Package {
    private double flatFee;

    public TwoDayPackage(String senderName, String senderAddress, String senderCity, String senderState, String senderZip,
                         String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZip,
                         double weight, double costPerOunce, double flatFee) {
        // Üst sınıfın constructor'ını çağırıyoruz
        super(senderName, senderAddress, senderCity, senderState, senderZip,
                recipientName, recipientAddress, recipientCity, recipientState, recipientZip,
                weight, costPerOunce);
        this.flatFee = flatFee;
    }

    // calculateCost() metodunu override ediyoruz (Eziyoruz)
    @Override
    public double calculateCost() {
        // Temel maliyet + sabit ücret
        return super.calculateCost() + flatFee;
    }
}
