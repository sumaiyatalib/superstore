package Store;

import java.util.List;

public class MainRev {

    static double payment = 0.0;
    static double revenue;
    int month ;
    double t_sell , profit , t_buy ,expense;

    public MainRev(int month, double t_sell, double profit, double t_buy, double expense) {
        this.month = month;
        this.t_sell = t_sell;
        this.profit = profit;
        this.t_buy = t_buy;
        this.expense = expense;
    }

    

   

}

interface financial {

    double buy();

}
