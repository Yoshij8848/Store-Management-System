/*
 * This is a Store class which is a superclass of Department and Retailer
 * @author (Reman Shrestha)
 * NP05CP4S240090
 * London met ID: 23056715
 */

public class Department extends Store {
    private String productName;
    private double markedPrice;
    private double sellingPrice;
    private boolean isInSales;

    // Constructor method
    // Constructor method
public Department(int storeId, String storeName, String location, int openingHour, int totalSales, int totalDiscount, String productName, double markedPrice) {
    super(storeId, storeName, location, openingHour, totalSales, totalDiscount);  // Pass all required parameters to the Store constructor
    this.productName = productName;  // Initialize productName
    this.markedPrice = markedPrice;  // Initialize markedPrice
    this.isInSales = true;  // Assume the product is in sales initially
    this.sellingPrice = 0;  // Initial selling price is 0
}


    // Accessor methods
    public String getProductName() {
        return productName;
    }

    public double getMarkedPrice() {
        return markedPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public boolean isInSales() {
        return isInSales;
    }

    // Mutator method for marked price
    public void setMarkedPrice(double markedPrice) {
        this.markedPrice = markedPrice;
    }

    // Method to calculate selling price based on discount
 public double calculateDiscountPrice(double markedPrice, boolean isInSales) {
    this.isInSales = isInSales;
    double discount = 0.0;

    // Apply discounts based on marked price
    if (isInSales) {
        if (markedPrice >= 5000) {
            discount = 0.20;  // 20% discount
        } else if (markedPrice >= 3000 && markedPrice < 5000) {
            discount = 0.10;  // 10% discount
        } else if (markedPrice >= 1000 && markedPrice < 3000) {
            discount = 0.05;  // 5% discount
        }
    }

    // Calculate the selling price after discount
    this.sellingPrice = markedPrice - (markedPrice * discount);

    // Update the total sales in the Store superclass
    double currentTotalSales = super.getTotalSales();  // Get current total sales
    super.setTotalSales((int) (currentTotalSales + this.sellingPrice));  // Update total sales

    // Update the total discount in the Store superclass
    double currentTotalDiscount = super.getTotalDiscount();  // Get current total discount
    super.setTotalDiscount((int) (currentTotalDiscount + (markedPrice - this.sellingPrice)));  // Update total discount

    // After applying the discount, the product is no longer on sale
    this.isInSales = false;

     // Return the discounted price
        return this.sellingPrice;
    

 }


    // Method to display details of the Department class
    @Override
    public void display() {
        super.display();  // Call the display method of the superclass (Store)
        System.out.println("Product Name: " + productName);
        System.out.println("Marked Price: " + markedPrice);
        if (!isInSales) {
            System.out.println("Selling Price: " + sellingPrice);
        
        }
    }
}
