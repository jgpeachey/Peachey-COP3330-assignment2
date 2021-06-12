package ex26.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(double[] bap){
        double n; //n = number of months
        double balance = Math.round(bap[0]*100.0)/100.0;
        double daily_rate = bap[1]/365.0;
        double payment = Math.round(bap[2]*100.0)/100.0;

        //only this long cause the math didn't want to work when directly set to n
        double a = Math.log(1 + (balance/payment) * (1 - Math.pow((1 + daily_rate), 30.0)));
        double b = Math.log(1+daily_rate);
        double c = -1/30.0;
        double ans = (a/b)*c;
        if(ans%1.0 > 0.0) ans = ans+1-ans%1.0;

        n = ans;
        return n;
    }
}
