package suppliers;

import Store.Product;

class Suppliers {
    
    String date_in , Name  ;
    Product p ;
    int Order_no , stocks ; 

    public String getDate_in() {
        return date_in;
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

    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
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

}