package entities;

public class Product {

    protected String name;
    protected Double price;

    public Product() {

    }

    public Product(Double price, String name) {
        this.price = price;
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String priceTag(){
        return name
                +" $ "
                +String.format("%.2f", price);

    }
}
