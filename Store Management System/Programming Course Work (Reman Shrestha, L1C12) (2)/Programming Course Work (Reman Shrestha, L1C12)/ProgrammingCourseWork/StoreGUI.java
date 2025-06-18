import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class StoreGUI {

    private JFrame frame;
    private JTextField storeIdTextField, storeNameTextField, locationTextField, openingHoursTextField, totalSalesTextField, totalDiscountTextField, productNameTextField, markedPriceTextField,
            storeIdTF, storeNameTF, locationTF2, openingHourTF2, totalSalesTF2, removeTextField, paymentOnlineTextField, totalDiscountTF2 , vatpricetTF, pyearTextField;

    private JCheckBox isPaymentOnlineCB, isInSalesCB;

    private ArrayList<Store> storeList = new ArrayList<>();

    public StoreGUI() {
        frame = new JFrame();
        frame.setTitle("StoreGUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1100, 650);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.WHITE);

        Border border = BorderFactory.createLineBorder(Color.GREEN, 30);
        frame.getRootPane().setBorder(border);

        // Panel One
        JPanel panelOne = new JPanel();
        panelOne.setBackground(Color.GREEN);
        panelOne.setBounds(20, 20, 300, 380);
        panelOne.setLayout(null);
        frame.add(panelOne);

        JLabel departmentLabel = new JLabel("Department");
        departmentLabel.setBounds(140, 10, 200, 40);
        panelOne.add(departmentLabel);

        JLabel storeIdLabel = new JLabel("Store ID:");
        storeIdLabel.setBounds(60, 45, 200, 40);
        panelOne.add(storeIdLabel);

        storeIdTextField = new JTextField();
        storeIdTextField.setBounds(120, 55, 150, 25);
        panelOne.add(storeIdTextField);

        JLabel storeNameLabel = new JLabel("Store Name:");
        storeNameLabel.setBounds(40, 80, 200, 40);
        panelOne.add(storeNameLabel);

        storeNameTextField = new JTextField();
        storeNameTextField.setBounds(120, 90, 150, 25);
        panelOne.add(storeNameTextField);

        JLabel locationLabel = new JLabel("Location:");
        locationLabel.setBounds(55, 115, 200, 40);
        panelOne.add(locationLabel);

        locationTextField = new JTextField();
        locationTextField.setBounds(120, 125, 150, 25);
        panelOne.add(locationTextField);

        JLabel openingHourLabel = new JLabel("Opening Hour:");
        openingHourLabel.setBounds(28, 150, 200, 40);
        panelOne.add(openingHourLabel);

        openingHoursTextField = new JTextField();
        openingHoursTextField.setBounds(120, 160, 150, 25);
        panelOne.add(openingHoursTextField);

        JLabel totalSalesLabel = new JLabel("Total Sales:");
        totalSalesLabel.setBounds(40, 185, 200, 40);
        panelOne.add(totalSalesLabel);

        totalSalesTextField = new JTextField();
        totalSalesTextField.setBounds(120, 195, 150, 25);
        panelOne.add(totalSalesTextField);

        JLabel totalDiscountLabel = new JLabel("Total Discount:");
        totalDiscountLabel.setBounds(25, 220, 200, 40);
        panelOne.add(totalDiscountLabel);

        totalDiscountTextField = new JTextField();
        totalDiscountTextField.setBounds(120, 230, 150, 25);
        panelOne.add(totalDiscountTextField);

        JLabel productNameLabel = new JLabel("Product Name:");
        productNameLabel.setBounds(30, 255, 200, 40);
        panelOne.add(productNameLabel);

        productNameTextField = new JTextField();
        productNameTextField.setBounds(120, 265, 150, 25);
        panelOne.add(productNameTextField);

        JLabel markedPriceLabel = new JLabel("Marked Price:");
        markedPriceLabel.setBounds(30, 290, 200, 40);
        panelOne.add(markedPriceLabel);

        markedPriceTextField = new JTextField();
        markedPriceTextField.setBounds(120, 300, 150, 25);
        panelOne.add(markedPriceTextField);

        



        JButton addDepartmentButton = new JButton("Add Department");
        addDepartmentButton.setBounds(100, 330, 125, 40);
        panelOne.add(addDepartmentButton);
        addDepartmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                addDepartment();
            }
        });

        // Panel Two
        JPanel panelTwo = new JPanel();
        panelTwo.setBackground(Color.GREEN);
        panelTwo.setBounds(350, 20, 300, 350);
        panelTwo.setLayout(null);
        frame.add(panelTwo);

        JLabel retailerLabel = new JLabel("Retailer");
        retailerLabel.setBounds(120, 10, 100, 40);
        panelTwo.add(retailerLabel);

        JLabel storeIdLabel2 = new JLabel("Store ID:");
        storeIdLabel2.setBounds(55, 40, 120, 40);
        panelTwo.add(storeIdLabel2);

        storeIdTF = new JTextField();
        storeIdTF.setBounds(115, 50, 150, 25);
        panelTwo.add(storeIdTF);

        JLabel storeNameLabel2 = new JLabel("Store Name:");
        storeNameLabel2.setBounds(35, 70, 120, 40);
        panelTwo.add(storeNameLabel2);

        storeNameTF = new JTextField();
        storeNameTF.setBounds(115, 80, 150, 25);
        panelTwo.add(storeNameTF);

        JLabel locationLabel2 = new JLabel("Location:");
        locationLabel2.setBounds(52, 100, 120, 40);
        panelTwo.add(locationLabel2);

        locationTF2 = new JTextField();
        locationTF2.setBounds(115, 108, 150, 25);
        panelTwo.add(locationTF2);

        JLabel openingHourLabel2 = new JLabel("Opening Hour:");
        openingHourLabel2.setBounds(20, 130, 120, 40);
        panelTwo.add(openingHourLabel2);

        openingHourTF2 = new JTextField();
        openingHourTF2.setBounds(115, 138, 150, 25);
        panelTwo.add(openingHourTF2);

        JLabel totalSalesLabel2 = new JLabel("Total Sales:");
        totalSalesLabel2.setBounds(35, 160, 120, 40);
        panelTwo.add(totalSalesLabel2);

        totalSalesTF2 = new JTextField();
        totalSalesTF2.setBounds(115, 170, 150, 25);
        panelTwo.add(totalSalesTF2);

        JLabel totaldiscountLabel2 = new JLabel("Total Discount:");
        totaldiscountLabel2.setBounds(20, 190, 120, 40);
        panelTwo.add(totaldiscountLabel2);

        totalDiscountTF2 = new JTextField();
        totalDiscountTF2.setBounds(115, 202, 150, 25);
        panelTwo.add(totalDiscountTF2);

        JLabel vatpriceLabel = new JLabel("Vat Inclusive Price:");
        vatpriceLabel.setBounds(5, 220, 120, 40);
        panelTwo.add(vatpriceLabel);

        vatpricetTF = new JTextField();
        vatpricetTF.setBounds(115, 232, 150, 25);
        panelTwo.add(vatpricetTF);

        JLabel purchedyearLabel = new JLabel("Purchase year:");
        purchedyearLabel.setBounds(20, 250, 200, 40);
        panelTwo.add(purchedyearLabel);

        pyearTextField = new JTextField();
        pyearTextField.setBounds(115, 262, 150, 25);
        panelTwo.add(pyearTextField);



        JButton addRetailerButton = new JButton("Add Retailer");
        addRetailerButton.setBounds(90, 300, 120, 30);
        panelTwo.add(addRetailerButton);
        addRetailerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                addRetailer();
            }
        });

        // Panel Three for calculating discount price
        JPanel panelThree = new JPanel();
        panelThree.setBackground(Color.GREEN);
        panelThree.setBounds(700, 20, 300, 250);
        panelThree.setLayout(null);
        frame.add(panelThree);

        // Label for calculating discount price
        JLabel calculateDiscountPriceLabel = new JLabel("Calculate Discount Price");
        calculateDiscountPriceLabel.setBounds(75, 20, 190, 40);
        panelThree.add(calculateDiscountPriceLabel);

        // Label for Store ID
        JLabel storeIdLabel3 = new JLabel("Store ID:");
        storeIdLabel3.setBounds(35, 50, 120, 40);
        panelThree.add(storeIdLabel3);

        // Text Field for Store ID
        JTextField storeIdTF3 = new JTextField();
        storeIdTF3.setBounds(100, 60, 150, 25);
        panelThree.add(storeIdTF3);

        // Checkbox for Is In Sales
        JLabel isInSalesLabel = new JLabel("Is In Sales:");
        isInSalesLabel.setBounds(32, 80, 120, 40);
        panelThree.add(isInSalesLabel);

        isInSalesCB = new JCheckBox();
        isInSalesCB.setBounds(100, 90, 25, 25);
        panelThree.add(isInSalesCB);

        // Label for Marked Price
        JLabel markedPriceLabel2 = new JLabel("Marked Price:");
        markedPriceLabel2.setBounds(18, 110, 120, 40);
        panelThree.add(markedPriceLabel2);

        // Text Field for Marked Price
        JTextField markedPriceTF2 = new JTextField();
        markedPriceTF2.setBounds(100, 120, 150, 25);
        panelThree.add(markedPriceTF2);

        // Button for Discount Price
        JButton calculateDiscountButton = new JButton("Calculate Discount");
        calculateDiscountButton.setBounds(80, 160, 150, 30);
        panelThree.add(calculateDiscountButton);
        calculateDiscountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                calculateDiscountPrice(storeIdTF3.getText(), Double.parseDouble(markedPriceTF2.getText()), isInSalesCB.isSelected());
            }
        });

        // Panel Four for removing a store
        JPanel panelFour = new JPanel();
        panelFour.setBackground(Color.GREEN);
        panelFour.setBounds(20, 420, 300, 150);
        panelFour.setLayout(null);
        frame.add(panelFour);

        // Label for Removing Store
        JLabel removeStoreLabel = new JLabel("Remove Store");
        removeStoreLabel.setBounds(105, 20, 120, 40);
        panelFour.add(removeStoreLabel);

        // Label for Store ID
        JLabel removeStoreIdLabel = new JLabel("Store ID:");
        removeStoreIdLabel.setBounds(35, 50, 120, 40);
        panelFour.add(removeStoreIdLabel);

        // Text Field for Removing Store
        removeTextField = new JTextField();
        removeTextField.setBounds(100, 60, 150, 25);
        panelFour.add(removeTextField);

        // Button for Removing Store
        JButton removeButton = new JButton("Remove");
        removeButton.setBounds(80, 100, 120, 30);
        panelFour.add(removeButton);
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                removeStore(removeTextField.getText());
            }
        });

        // Checkbox for Is Payment Online
        JPanel panelFive = new JPanel();
        panelFive.setBackground(Color.GREEN);
        panelFive.setBounds(350, 420, 300, 150);
        panelFive.setLayout(null);
        frame.add(panelFive);

        JLabel LoyalityLabel = new JLabel("Loyality");
        LoyalityLabel.setBounds(80, 5, 150, 30);
        panelFive.add(LoyalityLabel);

        JLabel isPaymentOnlineLabel = new JLabel("Is Payment Online:");
        isPaymentOnlineLabel.setBounds(60, 35, 150, 30);
        panelFive.add(isPaymentOnlineLabel);

        isPaymentOnlineCB = new JCheckBox();
        isPaymentOnlineCB.setBounds(180, 35, 30, 30);
        panelFive.add(isPaymentOnlineCB);

        JLabel paymentOnlineTextLabel = new JLabel("Vat Inclusive Price:");
        paymentOnlineTextLabel.setBounds(10, 60, 150, 30);
        panelFive.add(paymentOnlineTextLabel);

        paymentOnlineTextField = new JTextField();
        paymentOnlineTextField.setBounds(130, 65, 150, 25);
        panelFive.add(paymentOnlineTextField);

        JButton updatePaymentButton = new JButton("Update Payment");
        updatePaymentButton.setBounds(80, 100, 150, 30);
        panelFive.add(updatePaymentButton);
        updatePaymentButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        boolean isPaymentOnline = true; // or false, depending on your logic
        String paymentOnlineText = "Your text here"; // replace with the actual text

        updatePaymentOnline(isPaymentOnline, paymentOnlineText);
    }
});

        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new StoreGUI();
    }
    
     private void addDepartment() {
         try {

             int storeId = Integer.parseInt(storeIdTextField.getText());
             String storeName = storeNameTextField.getText();
             String location = locationTextField.getText();
             int openingHour = Integer.parseInt(openingHoursTextField.getText());


             int totalSales = Integer.parseInt(totalSalesTextField.getText());
             int totalDiscount = Integer.parseInt(totalDiscountTextField.getText());

             String productName = productNameTextField.getText();
             double markedPrice = Double.parseDouble(markedPriceTextField.getText());


             Department department = new Department(storeId, storeName, location, openingHour, totalSales, totalDiscount, productName, markedPrice);
             storeList.add(department);
            //  JOptionPane.showMessageDialog(frame, "Department added successfully!", JOptionPane.INFORMATION_MESSAGE);
             // Display all department information
            StringBuilder info = new StringBuilder();
            info.append("Department added successfully!\n\n");
            info.append("Store ID: ").append(department.getStoreId()).append("\n");
            info.append("Store Name: ").append(department.getStoreName()).append("\n");
            info.append("Location: ").append(department.getLocation()).append("\n");
            info.append("Opening Hour: ").append(department.getOpeningHour()).append("\n");
            info.append("Total Sales: ").append(department.getTotalSales()).append("\n");
            info.append("Total Discount: ").append(department.getTotalDiscount()).append("\n");
            info.append("Product Name: ").append(department.getProductName()).append("\n");
            info.append("Marked Price: ").append(department.getMarkedPrice()).append("\n");
            if (!department.isInSales()) {
                info.append("Selling Price: ").append(department.getSellingPrice()).append("\n");
            } else {
                info.append("Product is currently on sale.\n");
            }

            // Show the information in a dialog
            JOptionPane.showMessageDialog(frame, info.toString(), "Department Information", JOptionPane.INFORMATION_MESSAGE);
            // Log information to the console
            System.out.println("Department added successfully:");
            System.out.println("Store ID: " + department.getStoreId());
            System.out.println("Store Name: " + department.getStoreName());
            System.out.println("Location: " + department.getLocation());
            System.out.println("Opening Hour: " + department.getOpeningHour());
            System.out.println("Total Sales: " + department.getTotalSales());
            System.out.println("Total Discount: " + department.getTotalDiscount());
            System.out.println("Product Name: " + department.getProductName());
            System.out.println("Marked Price: " + department.getMarkedPrice());
            if (!department.isInSales()) {
                System.out.println("Selling Price: " + department.getSellingPrice());
            } else {
                System.out.println("Product is currently on sale.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter valid numbers for Store ID, Opening Hour, Total Sales, Total Discount, and Marked Price.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

        //     JOptionPane.showMessageDialog(frame, "Department added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);


        //  } catch (NumberFormatException e) {
        //      JOptionPane.showMessageDialog(frame, "Please enter valid numbers for Store ID, Opening Hours, Total Sales, Total Discount, and Marked Price.", "Error", JOptionPane.ERROR_MESSAGE);
        //  } catch (Exception e) {
        //      JOptionPane.showMessageDialog(frame, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        //  }
    //  }

    private void addRetailer() {
        try {
            // Convert storeId and openingHours to integers
            int storeId = Integer.parseInt(storeIdTF.getText());
            String storeName = storeNameTF.getText();
            String location = locationTF2.getText();
            int openingHours = Integer.parseInt(openingHourTF2.getText());

            // Convert totalSales to an integer
            int totalSales = Integer.parseInt(totalSalesTF2.getText());

            // Convert totalDiscount, VATInclusivePrice to integers and get purchasedYear
            int totalDiscount = Integer.parseInt(totalDiscountTF2.getText());
            int VATInclusivePrice = Integer.parseInt(vatpricetTF.getText());
            String purchasedYear = pyearTextField.getText();

            // Get the state of the isPaymentOnline checkbox
            boolean isPaymentOnline = isPaymentOnlineCB.isSelected(); // Assuming this is a JCheckBox

            // Instantiate Retailer object with correct parameter types
            Retailer retailer = new Retailer(storeId, storeName, location, openingHours, totalSales, totalDiscount, VATInclusivePrice, purchasedYear, isPaymentOnline);

            // Add retailer to the storeList
            storeList.add(retailer);
            // JOptionPane.showMessageDialog(frame, "Retailer added successfully!");
               // Build information string
            StringBuilder info = new StringBuilder();
            info.append("Retailer added successfully!\n\n");
            info.append("Store ID: ").append(retailer.getStoreId()).append("\n");
            info.append("Store Name: ").append(retailer.getStoreName()).append("\n");
            info.append("Location: ").append(retailer.getLocation()).append("\n");
            info.append("Opening Hours: ").append(retailer.getOpeningHour()).append("\n");
            info.append("Total Sales: ").append(retailer.getTotalSales()).append("\n");
            info.append("Total Discount: ").append(retailer.getTotalDiscount()).append("\n");
            info.append("VAT Inclusive Price: ").append(retailer.getVATInclusivePrice()).append("\n");
            info.append("Purchased Year: ").append(retailer.getPurchasedYear()).append("\n");
            info.append("Payment Online: ").append(retailer.getIsPaymentOnline() ? "Yes" : "No").append("\n");

            // Display information in a dialog
            JOptionPane.showMessageDialog(frame, info.toString(), "Retailer Information", JOptionPane.INFORMATION_MESSAGE);

              // Log information to the console
            System.out.println("Retailer added successfully:");
            System.out.println("Store ID: " + retailer.getStoreId());
            System.out.println("Store Name: " + retailer.getStoreName());
            System.out.println("Location: " + retailer.getLocation());
            System.out.println("Opening Hours: " + retailer.getOpeningHour());
            System.out.println("Total Sales: " + retailer.getTotalSales());
            System.out.println("Total Discount: " + retailer.getTotalDiscount());
            System.out.println("VAT Inclusive Price: " + retailer.getVATInclusivePrice());
            System.out.println("Purchased Year: " + retailer.getPurchasedYear());
            System.out.println("Payment Online: " + (retailer.getIsPaymentOnline() ? "Yes" : "No"));




        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter valid numbers for Store ID, Opening Hours, Total Sales, Total Discount, and VAT Inclusive Price.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
//     private void calculateDiscountPrice(String storeId, double markedPrice, boolean isInSales) {
//        for (Store store : storeList) {
//            if (store.getStoreId().equals(storeId) && store instanceof Department) {
//                Department department = (Department) store;
//                double discountPrice = department.calculateDiscountPrice(markedPrice, isInSales);
//                JOptionPane.showMessageDialog(frame, "The discounted price is: $" + discountPrice);
//                return;
//            }
//        }
//        JOptionPane.showMessageDialog(frame, "Store ID not found or the store is not a department.");
//    }
    private void calculateDiscountPrice(String storeId, double markedPrice, boolean isInSales) {
        try {
            int storeIdInt = Integer.parseInt(storeId);

            for (Store store : storeList) {
                if (store.getStoreId() == storeIdInt && store instanceof Department) {
                    Department department = (Department) store;
                    double discountPrice = department.calculateDiscountPrice(markedPrice, isInSales);
                    JOptionPane.showMessageDialog(frame, "The discounted price is: $" + discountPrice);
                    return;
                }
            }
            JOptionPane.showMessageDialog(frame, "Store ID not found or the store is not a department.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Invalid Store ID. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }




   
    private void removeStore(String storeId) {
        // Validate storeId
        if (storeId == null || storeId.trim().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Store ID cannot be empty or null.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Try to parse storeId to an integer
        int storeIdInt;
        try {
            storeIdInt = Integer.parseInt(storeId);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Store ID must be a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean storeFound = false;

        // Iterate through the list to find the store with the given ID
        for (int i = 0; i < storeList.size(); i++) {
            if (storeList.get(i).getStoreId() == storeIdInt) {
                // Confirm removal action
                int confirmation = JOptionPane.showConfirmDialog(frame, "Are you sure you want to remove this store?", "Confirm Removal", JOptionPane.YES_NO_OPTION);
                if (confirmation == JOptionPane.YES_OPTION) {
                    storeList.remove(i);
                    JOptionPane.showMessageDialog(frame, "Store removed successfully!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Store removal canceled.");
                }
                storeFound = true;
                break;
            }
        }

        // Notify user if store ID was not found
        if (!storeFound) {
            JOptionPane.showMessageDialog(frame, "Store ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


        private void updatePaymentOnline(boolean isPaymentOnline, String paymentOnlineText) {
        for (Store store : storeList) {
            if (store instanceof Retailer) {
                Retailer retailer = (Retailer) store;
                if (isPaymentOnline) {
                    retailer.setPaymentOnline(true);
                    int vat = Integer.parseInt(paymentOnlineTextField.getText());
                    retailer.setLoyaltyPoint(vat);
                    JOptionPane.showMessageDialog(frame, "Payment Online Updated to Yes.");
                } else {
                    retailer.setPaymentOnline(false);
                    JOptionPane.showMessageDialog(frame, "Payment Online Updated to No.");
                }

            }
        }
    }
}
