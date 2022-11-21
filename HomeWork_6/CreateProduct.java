package Java_Project.HomeWork_6;

public class CreateProduct {
    Product temp;

    public CreateProduct() {
        temp = new Product();
        temp.count = CONST.NIL_VALUE;
        temp.price = CONST.NIL_VALUE;
        temp.name = CONST.EMPTY;
        temp.description = CONST.EMPTY;
        temp.location = CONST.EMPTY;
    }
    
    
    public CreateProduct setCount(int count) {
        if (count > 1000) {
            setLocation("Cклад");
            temp.count = count;
            return this;
        }
        else {
            setLocation("Магазин");
            temp.count = count;
            return this;
        }
       
    }
    public CreateProduct setPrice(int price) {
        
        temp.price = price;
        return this;
    }

    public CreateProduct setName(String name) {
                    
        temp.name = name;       
        return this;
    }

    public CreateProduct setLocation(String location) {
                    
        temp.location = location;       
        return this;
    } 

    public CreateProduct setDescription(String description) {
        temp.description = description;
        return this;
        
    }

    public Product Create() {
        return temp;
    }
}