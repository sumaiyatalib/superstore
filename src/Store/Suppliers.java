package Store;

class Suppliers {

    String date_in, Name, prod_name;
    double price;
    int Order_no, stocks;

    public String getDate_in() {
        return date_in;
    }

    public Suppliers(String date_in, String Name, String prod_name, double price, int stocks) {
        this.date_in = date_in;
        this.Name = Name;
        this.prod_name = prod_name;
        this.price = price;
        this.stocks = stocks;
    }

    public Suppliers(String date_in, String Name, String prod_name, double price, int Order_no, int stocks) {
        this.date_in = date_in;
        this.Name = Name;
        this.prod_name = prod_name;
        this.price = price;
        this.Order_no = Order_no;
        this.stocks = stocks;
    }

    public void setDate_in(String date_in) {
        this.date_in = date_in;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getOrder_no() {
        return Order_no;
    }

    public void setOrder_no(int Order_no) {
        this.Order_no = Order_no;
    }

    public int getStocks() {
        return stocks;
    }

    public void setStocks(int stocks) {
        this.stocks = stocks;
    }

    protected void sell(Product o) {
        double tot_amt = 0;

    }

    Suppliers Clone() {
    return new Suppliers(date_in, Name, prod_name, price, Order_no, stocks);
    }

}
