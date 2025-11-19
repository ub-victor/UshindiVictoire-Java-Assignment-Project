package _27269.q1;

public class Sale extends Purchase {
    private String saleDate; // valid (not null)
    private int soldQuantity; // > 0
    private String customerName;

    public Sale(int id, String createdDate, String updatedDate,
                String warehouseName, String location, String contactNumber,
                String categoryName, String categoryCode,
                String supplierName, String supplierEmail, String supplierPhone,
                String productName, double unitPrice, int stockLimit,
                int quantityAvailable, int reorderLevel,
                String purchaseDate, int purchasedQuantity, String purchaseSupplierName,
                String saleDate, int soldQuantity, String customerName) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
              categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
              productName, unitPrice, stockLimit, quantityAvailable, reorderLevel,
              purchaseDate, purchasedQuantity, purchaseSupplierName);
        if (saleDate == null || saleDate.trim().isEmpty())
            throw new IllegalArgumentException("saleDate cannot be null/empty");
        if (soldQuantity <= 0) throw new IllegalArgumentException("soldQuantity must be > 0");
        if (customerName == null || customerName.trim().isEmpty())
            throw new IllegalArgumentException("customerName cannot be empty");
        this.saleDate = saleDate;
        this.soldQuantity = soldQuantity;
        this.customerName = customerName;
        // Decrease stock for sale - ensure we have stock
        decreaseQuantity(soldQuantity);
    }

    public String getSaleDate() { return saleDate; }
    public int getSoldQuantity() { return soldQuantity; }
    public String getCustomerName() { return customerName; }
}
