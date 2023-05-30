package personalProject;

import java.util.ArrayList;

public class Menu {
    int number = 0;
    String name = "coffie";
    String explan = "delicious!";
    ArrayList<Product> products = new ArrayList<Product>();

    Menu (int number, String name, String explan) {
        this.number = number;
        this.name = name;
        this.explan = explan;
    }
    void addProducts (Product product) {
           this.products.add(product);
    }
}
