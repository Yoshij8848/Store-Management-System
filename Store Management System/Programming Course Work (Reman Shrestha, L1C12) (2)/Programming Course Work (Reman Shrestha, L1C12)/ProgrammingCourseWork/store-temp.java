import java.awt.Color;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class store extends Department
{
    // private JFrame frame;
    // private JTextField StoreIDlabel;
    // private JTextField StoreIDTF;
    // private JLabel StoreNamelabel;
    // private JTextField StoreNameTF;
    // private JTextField Locationlabel;
    // private JTextField LocationTF;
    // private JTextField OpeningHourlabel;
    // private JTextField OpeningHourTF;
    // private JTextField TotalSaleslabel;
    // private JTextField TotalSalesTF;
    // private JTextField TotalDiscountlabel;
    // private JTextField TotalDiscountTF;
    // private JTextField ProductNamelabel;
    // private JTextField ProductNameTF;
    // private JTextField MarkedPricelabel;
    // private JTextField MarkedPriceTF;
    // private JButton addDepartmentbutton;
    // private JButton addRetailerbutton;
    //private JLabel RemoveTheProduct;


    public store() 
    {
        JFrame frame = new JFrame();
        frame.setTitle("StoreGUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1100, 650);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.white);
        
        Border border = BorderFactory.createLineBorder(Color.RED, 30);
        frame.getRootPane().setBorder(border);

        // Panel One
        JPanel panelone = new JPanel();
        panelone.setBackground(Color.RED);
        panelone.setBounds(20, 20, 300,380);
        panelone.setLayout(null);
        frame.add(panelone);

         // Label for DepartmentGUI 
         JLabel Departmentguilabel = new JLabel();
         Departmentguilabel.setText("Department");
         Departmentguilabel.setBounds(140, 10, 200, 40);
         panelone.add(Departmentguilabel);
 
         // Label for Store ID 
         JLabel Storeidlabel = new JLabel();
         Storeidlabel.setText("Store ID:");
         Storeidlabel.setBounds(60, 45, 200, 40);
         panelone.add(Storeidlabel);
 
         // textfield for StoreID
         JTextField StoreidtTextField = new JTextField();
         StoreidtTextField.setBounds(120, 55, 150, 25);
         panelone.add(StoreidtTextField);
 
         // Label for Store Name 
         JLabel StoreNamelabel = new JLabel();
         StoreNamelabel.setText("Store Name:");
         StoreNamelabel.setBounds(40, 80, 200, 40);
         panelone.add(StoreNamelabel);
 
         // textfield for StoreName
         JTextField StoreNameTF = new JTextField();
         StoreNameTF.setBounds(120, 90, 150, 25);
         panelone.add(StoreNameTF);
 
         // Location label
         JLabel Locationlabel = new JLabel();
         Locationlabel.setText("Location:");
         Locationlabel.setBounds(55, 115, 200, 40);
         panelone.add(Locationlabel);
 
         // textfield for Location
         JTextField LocationTF = new JTextField();
         LocationTF.setBounds(120, 125, 150, 25);
         panelone.add(LocationTF);
 
         // Opening Hour label
         JLabel OpeningHourlabel = new JLabel();
         OpeningHourlabel.setText("Opening Hour:");
         OpeningHourlabel.setBounds(28, 150, 200, 40);
         panelone.add(OpeningHourlabel);

         // Text Field for Opening Hour
         JTextField OpeningHoursTF = new JTextField();
         OpeningHoursTF.setBounds(120, 160, 150, 25);
         panelone.add(OpeningHoursTF);
 
         // Total Sales label
         JLabel Totalsaleslabel = new JLabel();
         Totalsaleslabel.setText("Total Sales:");
         Totalsaleslabel.setBounds(40, 185, 200, 40);
         panelone.add(Totalsaleslabel);

         // Text Field for Total Sales
         JTextField TotalsalesTF = new JTextField();
         TotalsalesTF.setBounds(120, 195, 150, 25);
         panelone.add(TotalsalesTF);
 
        
         // Total Discount label
         JLabel TotalDiscountlabel = new JLabel();
         TotalDiscountlabel.setText("Total Discount:");
         TotalDiscountlabel.setBounds(25, 220, 200, 40);
         panelone.add(TotalDiscountlabel);
 
         // textfield for Total Discount
         JTextField TotalDiscountTF = new JTextField();
         TotalDiscountTF.setBounds(120, 230, 150, 25);
         panelone.add(TotalDiscountTF);
 
         // ProductName label
         JLabel ProductNamelabel = new JLabel();
         ProductNamelabel.setText("ProductName:");
         ProductNamelabel.setBounds(30, 255, 200, 40);
         panelone.add(ProductNamelabel);
 
         // textfield for Product Name
         JTextField  ProductNameTF = new JTextField();
         ProductNameTF.setBounds(120, 265, 150, 25);
         panelone.add(ProductNameTF);
 
         // Marked Price label
         JLabel MarkedPricelabel = new JLabel();
         MarkedPricelabel.setText("Marked Price:");
         MarkedPricelabel.setBounds(30, 290, 200, 40);
         panelone.add(MarkedPricelabel);
 
         // textfield for Marked Price
         JTextField  MarkedPriceTF = new JTextField();
         MarkedPriceTF.setBounds(120, 300, 150, 25);
         panelone.add(MarkedPriceTF);
 
         // add Department button
         JButton addDepartmentbutton = new JButton();
         addDepartmentbutton.setText("Add Department");
         addDepartmentbutton.setBounds(100, 330, 125, 40);
         panelone.add(addDepartmentbutton);
         //addDepartmentbutton.addActionListener(new ActionListener() {
         //@Override // adding Department button to the actionlistner for the functionality
         //public void actionPerformed(ActionEvent a) {
         //addDepartmentbutton();
        


       

         frame.setVisible(true);

            
        };
    
    
        
         
    public static void main(String[] args) 
    {
        new store();
    }
}

 



    