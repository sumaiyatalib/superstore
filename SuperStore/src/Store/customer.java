package Store;

import java.util.List;

public class customer {

    protected String pay_way, time, type;
    protected double t_amount, discount;
    private int recipt_no;

    customer() {

        type = "Regular";
       
    }

    public customer(String pay_way, String time, double t_amount, double discount, int recipt_no) {
        this.pay_way = pay_way;
        this.time = time;
        this.t_amount = t_amount;
        this.discount = discount;
        this.recipt_no = recipt_no;
        type = "Regular";
    }

    public customer(String pay_way, String time, String type, double t_amount, double discount, int recipt_no) {
        this.pay_way = pay_way;
        this.time = time;
        this.type = type;
        this.t_amount = t_amount;
        this.discount = discount;
        this.recipt_no = recipt_no;
    }

    void discount(double a) {
        
        double dis = 0;
        discount = dis;
        System.out.println("Reg m" + dis);
    }

    public String getPay_way() {
        return pay_way;
    }

    public void setPay_way(String pay_way) {
        this.pay_way = pay_way;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getT_amount() {
        return t_amount;
    }

    public void setT_amount(double t_amount) {
        this.t_amount = t_amount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getRecipt_no() {
        return recipt_no;
    }

    public void setRecipt_no(int recipt_no) {
        this.recipt_no = recipt_no;
    }

}

class golden extends customer {

    golden() {

        type = "Golden";
        System.out.println("Golden");
    }

    @Override
    void discount(double a) {
        double dis = a * 0.25;
        System.out.println("Golden m" + dis);
        discount = dis;
    }

}

class silver extends customer {

    silver() {

        type = "Silver";
        System.out.println("Silver");

    }

    @Override
    void discount(double a) {
        
        double dis = a * 0.10;
        discount = dis;
        System.out.println("Silver m" + dis);

    }
}
