/*Q2.) Create a class called invoice that hardware store might use to represent an
invoice for an item sold at the store. An invoice should include four pieces of
information as instance variable

 a part number(type string)
 a part description(type string)
 a quantity of the item being purchased(type int)
 a price per item(double)

Your class should have a constructor that initialization the four instance variable .
Provide a set and a get method for each instance variable . In addition provide
method named getInvoiceAmount that calculate the invoice amount(i.e. multiplies
the quantity per item ), then return the amount as a double value.If the quantity is not
positive it should be set to 0. If the price per item is not positive it should be set to
0.0. Write test application named invoice test that demonstration class invoice
capabilities. */



class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity : 0;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}


public class invoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("A123", "Hammer", 5, 20.50);
        
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: $" + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());
    }
}
