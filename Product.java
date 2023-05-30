package personalProject;

import java.util.ArrayList;

public class Product extends Menu {
    double price = 0.0;

     Product (int number, String name, String explan, double price){
         super(number, name, explan);
         this.price = price;
    }
}
