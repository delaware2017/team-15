package code_for_good.wholesomewave;

import java.text.NumberFormat;

public class Balance
{
    private static double balance;

    public Balance()
    {
        balance = 0;
    }

    // get method for balance
    public double getBalance()
    {
        return balance;
    }

    // method updates the patient's balance
    public void calculateBalance(double amount)
    {
        // create a NumberFormat object with standard currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        currency.setMinimumFractionDigits(2);
        currency.setMaximumFractionDigits(2);

        // add the passed amount (even negative) to the account balance
        balance += amount;

        // FUTURE: UPDATE THE DATABASE WITH THE NEW BALANCE
    }
}
