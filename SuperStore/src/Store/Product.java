package Store;

public class Product implements financial {

    private String Name;
    private int Stock, id;
    private double Price;
    private String type, subtype;

    public Product(String Name, int Stock, int id, double Price, String type, String subtype) {
        this.Name = Name;
        this.Stock = Stock;
        this.id = id;
        this.Price = Price;
        this.type = type;
        this.subtype = subtype;
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getStock() {
        return Stock;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    @Override
    public double buy() {
        return Price;

    }

    Product Clone() {
        return new Product(this.Name, this.Stock, this.id, this.Price, this.type, this.subtype);
    }

    public String toString() {
        String s = Name + "\n";
        s += subtype + "\n " + type + "\n " + Price + "\n " + Stock + "\n " + id;
        return s;

    }

    public Product() {
    }

}
