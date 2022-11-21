package Java_Project.HomeWork_6;

public class Product {
    public String name;    
    public String description;
    public double price;
    public int count;
    public String location;
    

    public void print() {
        System.out.printf(
            "%s - %s - Где: %s - Кол-во: %d шт. Цена:%.2fр  %n",
            this.name,            
            this.description,            
            this.location,
            this.count,
            this.price);
    }
}