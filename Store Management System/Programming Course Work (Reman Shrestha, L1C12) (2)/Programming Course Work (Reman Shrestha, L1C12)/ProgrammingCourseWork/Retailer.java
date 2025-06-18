/*
 * This is a Store class which is a superclass of Department and Retailer
 * @author (Reman Shrestha)
 * NP05CP4S240090
 * London met ID: 23056715
 */

public class Retailer extends Store {
    private int VATInclusivePrice;
    private int loyaltyPoint;
    private boolean isPaymentOnline;
    private String purchasedYear;
    private boolean isRemoved;

    // Constructor method
    public Retailer(int storeId, String storeName, String location, int openingHour, int totalSales, int totalDiscount, int VATInclusivePrice, String purchasedYear, boolean isPaymentOnline) {
        super(storeId, storeName, location, openingHour, totalSales, totalDiscount);  // Correcting super constructor call
        this.VATInclusivePrice = VATInclusivePrice;
        this.isPaymentOnline = isPaymentOnline;
        this.purchasedYear = purchasedYear;
        this.loyaltyPoint = 0;
        this.isRemoved = false;
    }

    // Accessor methods
    public int getVATInclusivePrice() {
        return VATInclusivePrice;
    }

    public int getLoyaltyPoint() {
        return loyaltyPoint;
    }

    public boolean getIsPaymentOnline() {
        return isPaymentOnline;
    }

    public String getPurchasedYear() {
        return purchasedYear;
    }

    public boolean getIsRemoved() {
        return isRemoved;
    }

    // Mutator method for isPaymentOnline
    public void setPaymentOnline(boolean isPaymentOnline) {
        this.isPaymentOnline = isPaymentOnline;
    }

    // Method to set loyalty point
    public void setLoyaltyPoint(int newVATInclusivePrice) {
        if (this.isPaymentOnline) {
            this.loyaltyPoint = (int) (newVATInclusivePrice * 0.01); // 1% of VAT price
        }
    }

    // Method to remove product
    public void removeProduct() {
        if (loyaltyPoint == 0 && (purchasedYear.equals("2020") || purchasedYear.equals("2021") || purchasedYear.equals("2022"))) {
            isRemoved = true;
            VATInclusivePrice = 0;
            loyaltyPoint = 0;
            isPaymentOnline = false;
        }
    }

    // Method to display details of the Retailer class
    @Override
    public void display() {
        if (!isRemoved) {
            super.display();  // Calling the display method of the superclass (Store)
            System.out.println("VAT Inclusive Price: " + VATInclusivePrice);
            System.out.println("Loyalty Point: " + loyaltyPoint);
            System.out.println("Purchased Year: " + purchasedYear);
            System.out.println("Payment Online: " + (isPaymentOnline ? "Yes" : "No"));
        } else {
            super.display();
            System.out.println("Product has been removed.");
        }
    }
}
