package Java_Project.HomeWork_6;

public class app {
    public static void main(String[] args) {
        Product currentProduct;
        currentProduct = new CreateProduct()
                .setName("LG TV")
                .setDescription("Телевизор")
                .setPrice(150000)
                .setCount(5)                            
                .Create();
        currentProduct.print();

        currentProduct = new CreateProduct()
                .setName("Xbox")
                .setDescription("Игровая приставка")
                .setPrice(65000)
                .setCount(150)
                .Create();
        currentProduct.print();

        
        currentProduct = new CreateProduct()
                .setName("PlayStation")
                .setDescription("Игровая приставка")
                .setCount(1005)
                .setPrice(60000)
                .Create();
                
        currentProduct.print();

    }
}