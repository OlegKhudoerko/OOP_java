package sem5.Ex_2;

import java.math.BigDecimal;

public class Account {
    public BigDecimal balance(String numberAccount) {
        //logic
        return balance(numberAccount);
    }
    public  void refill(String numberAccount,BigDecimal sum){
    //logic
    }
    public  void payment(String numberAccount,BigDecimal sum){
        //logic
    }
public class SelaryAccount extends Account implements Payment {
    @Override
    public BigDecimal balance(String numberAccount) {
        return super.balance(numberAccount);
    }

    @Override
    public void refill(String numberAccount, BigDecimal sum) {
        super.refill(numberAccount, sum);
    }

//    @Override
//    public void payment(String numberAccount, BigDecimal sum) {
//        super.payment(numberAccount, sum);
//    }
}
public class DepositAccount extends Account implements Payment {
    @Override
    public BigDecimal balance(String numberAccount) {
        return super.balance(numberAccount);
    }

    @Override
    public void refill(String numberAccount, BigDecimal sum) {
        super.refill(numberAccount, sum);
    }

   // @Override
    public void payment(String numberAccount, BigDecimal sum){
        throw new UnsupportedOperationException("Operation not supported");
    }
}
}
