package Packk;

import com.sun.source.tree.BreakTree;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Customer {
    private String cosName;
    private Passport passport;
    private Bank bank;
    private Product[] products;
    private static Scanner scan = new Scanner(System.in);

    public Customer(String cosName, Passport passport, Bank bank, Product[] products) {
        this.cosName = cosName;
        this.passport = passport;
        this.bank = bank;
        this.products = products;
    }

    public Passport getPassports() {
        return passport;
    }

    public void setPassports(Passport passports) {
        this.passport = passport;
    }

    public Bank getBanks() {
        return bank;
    }

    public void setBanks(Bank banks) {
        this.bank = bank;
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


    public String deleteProductByName(String name, String findProductName) {
        if (name.equals(getCosName())) {
            int indexToRemove = -1;

            for (int i = 0; i < products.length; i++) {
                if (products[i].getProductName().equals(findProductName)) {
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
                return "Продукт удален: " + findProductName;
            } else {
                return "Продукт с таким именем не найден!";
            }
        } else {
            return "Клиент с таким именем не найден";
        }
    }

    public Product[] addProduct(String name, Product newProduct) {
        if (name.equals(getCosName())) {
            Product[] newProducts = new Product[products.length + 1];
            System.arraycopy(products, 0, newProducts, 0, products.length);
            newProducts[newProducts.length - 1] = newProduct;
            products = newProducts;
            return products;
        } else {
            return null;
        }
    }

    public String updateCustomerName (String newName){
        setCosName  (newName);

        return newName;
    }



    public int totalSpendByCostumer (String name) {
        int totalSpend = 0;
        for (Product product : products) {
            totalSpend += product.getPrice();
        }
        return totalSpend;
    }
    public int creditMethod (int totalSpend) {
        if (totalSpend > bank.getTotalMoney()) {
            System.out.println("У вас недостаточно средств ддля оплаты продуктов вы можете взять кредит \nДля этого нажмите 'credit'");
            String credit = scan.next();
            if (credit.equals("credit")) {
                System.out.println("Введите сумму кредита: ");
                int summaCredit = scan.nextInt();
                return totalSpend + summaCredit;
            }
        }
        return 0;
    }


    public String checkProductAlcohol (Product[] products){
            for (Product product : products) {
                if (product.isAlcoholic() ) {
                    System.out.println("Этот продукт содержить алкоголь и запрещается употреблять лицам на достигшим 18 лет " + product);
                    return deleteProductByName(cosName,product.getProductName());
                }
            }
 return null;
    }

    public String methodDeleteAlcoholP() {
        int currentYear = LocalDate.now().getYear();
        int birthYear = passport.getDateOfBirth().getYear();

        if (currentYear - birthYear > 18) {
            String result = checkProductAlcohol(products);
            return result;
        }
        return null;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "cosName='" + cosName + '\'' +
                ", passport=" + passport +
                ", bank=" + bank +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
