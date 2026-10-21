class OvernightPackage extends Package {
    private double additionalFeePerOunce;

    public OvernightPackage(String senderName, String senderAddress, String senderCity, String senderState, String senderZip,
                            String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZip,
                            double weight, double costPerOunce, double additionalFeePerOunce) {
        // Üst sınıfın constructor'ını çağırıyoruz
        super(senderName, senderAddress, senderCity, senderState, senderZip,
                recipientName, recipientAddress, recipientCity, recipientState, recipientZip,
                weight, costPerOunce);
        this.additionalFeePerOunce = additionalFeePerOunce;
    }

    // calculateCost() metodunu override ediyoruz (Eziyoruz)
    @Override
    public double calculateCost() {
        // (Ağırlık * (Ons başına temel maliyet + Ons başına ek ücret))
        return getWeight() * (getCostPerOunce() + additionalFeePerOunce);
    }
}
