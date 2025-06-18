public class Store {
    private int storeId;
    private String storeName;
    private String location;
    private int openingHour;
    private int totalSales;
    private int totalDiscount;

    // Constructor
    public Store(int storeId, String storeName, String location, int openingHour, int totalSales, int totalDiscount) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.location = location;
        this.openingHour = openingHour;
        this.totalSales = totalSales;
        this.totalDiscount = totalDiscount;
    }

    // Accessor methods
    public int getStoreId() {
        return storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getLocation() {
        return location;
    }

    public int getOpeningHour() {
        return openingHour;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public int getTotalDiscount() {
        return totalDiscount;
    }

    // Mutator methods
    public void setTotalDiscount(int totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    // Method to display store details
    public void display() {
        System.out.println("Store ID: " + storeId);
        System.out.println("Store Name: " + storeName);
        System.out.println("Location: " + location);
        System.out.println("Opening Hour: " + openingHour);
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Total Discount: " + totalDiscount);
    }
}
