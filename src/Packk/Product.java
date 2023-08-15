package Packk;

import java.time.LocalDate;

public class Product {
    private String productName;
    private String description;
    private int price;
    private LocalDate  madeInDate;
    private int quantity;
    private  boolean isAlcoholic;
    public Product(String productName, String description, int price, LocalDate madeInDate, int quantity, boolean isAlcoholic) {
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.madeInDate = madeInDate;
        this.quantity = quantity;
        this.isAlcoholic = isAlcoholic;
    }

    public Product() {

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getMadeInDate() {
        return madeInDate;
    }

    public void setMadeInDate(LocalDate madeInDate) {
        this.madeInDate = madeInDate;
    }

    public int getCount() {
        return quantity;
    }

    public void setCount(int count) {
        this.quantity = count;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        isAlcoholic = alcoholic;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", madeInDate=" + madeInDate +
                ", quantity=" + quantity +
                ", isAlcoholic=" + isAlcoholic +
                '}';
    }

}
