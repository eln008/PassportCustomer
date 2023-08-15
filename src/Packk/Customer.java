package Packk;

public class Costumer {
    private String cosName;
    private Passport[] passports;
    private Bank[] banks;
    private Product[] products;

    public Costumer(String cosName, Passport[] passports, Bank[] banks, Product[] products) {
        this.cosName=cosName;
        this.passports = passports;
        this.banks = banks;
        this.products = products;
    }

    public Costumer() {

    }

    public Passport[] getPassports() {
        return passports;
    }

    public void setPassports(Passport[] passports) {
        this.passports = passports;
    }

    public Bank[] getBanks() {
        return banks;
    }

    public void setBanks(Bank[] banks) {
        this.banks = banks;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public String getCosName() {
        return cosName;
    }

    public void setCosName(String cosName) {
        this.cosName = cosName;
    }

    public String deleteProductByName(String name, String productName) {
        if (name.equals(getCosName())) {
            int indexToRemove = -1;

            for (int i = 0; i < products.length; i++) {
                if (products[i].getProductName().equals(productName)) {
                    indexToRemove = i;
                    break;
                }
            }

            if (indexToRemove != -1) {
                Product[] newProducts = new Product[products.length - 1];
                int newIndex = 0;

                for (int i = 0; i < products.length; i++) {
                    if (i != indexToRemove) {
                        newProducts[newIndex++] = products[i];
                    }
                }

                products = newProducts;
                return "Продукт удален: ";
            } else {
                return "Продукт с таким именем не найден!";
            }
        } else {
            return "Клиент с таким именем не найден";
        }
    }

}
