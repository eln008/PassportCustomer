package Packk;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    Passport passport4 = new Passport(LocalDate.of(2000, 9,21),"Male", "USA");




    Bank bank5 = new Bank("David","bank5pass",100);


    Product product1 = new Product ("tequila","description tequila",200, LocalDate.of(2023,2,3),34, true);
    Product product2 = new Product ("bread","description bread",45, LocalDate.of(2023,6,2),100, false);
    Product product3 = new Product ("banana","description banana",10, LocalDate.of(2023,1,22),40, false);
    Product product4 = new Product ("apple","description apple",15, LocalDate.of(2023,5,23),50, false);
    Product product5 = new Product ("cake","Description cake",20, LocalDate.of(2022,9,9),10, true);
    Product [] products = {product1, product2, product3, product4 , product5};
    Product newProduct = new Product("milk", "description milk", 45, LocalDate.of(2023,3,30),15,false);

    Customer customer = new Customer("David", passport4,bank5,products);
    Customer[] customers = {customer};


        for (Product product : products) {
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Description: " + product.getDescription());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Made In: " + product.getMadeInDate());
            System.out.println("Quantity: " + product.getCount());
            System.out.println("Is Alcoholic: " + product.isAlcoholic());
            System.out.println("-------------------------");
        }

        System.out.println(customer.deleteProductByName("David", "cake"));

        System.out.println("------------------------new product----------------------------");
        System.out.println("New Product Name: " + newProduct.getProductName());
        System.out.println("New Product Description: " + newProduct.getDescription());
        System.out.println("New Product Price: " + newProduct.getPrice());
        System.out.println("New Product Made In: " + newProduct.getMadeInDate());
        System.out.println("New Product Quantity: " + newProduct.getCount());
        System.out.println("New Product Is Alcoholic: " + newProduct.isAlcoholic());

        System.out.println(customer.updateCustomerName("Bob"));

        System.out.println(customer.totalSpendByCostumer("David"));

        System.out.println(customer.creditMethod(customer.totalSpendByCostumer("David")));

        System.out.println(customer.checkProductAlcohol(products));
        System.out.println(customer.methodDeleteAlcoholP());

    }

}