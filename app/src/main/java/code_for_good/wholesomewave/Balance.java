package code_for_good.wholesomewave;

import android.app.Activity;
import android.content.Context;

import java.text.NumberFormat;

import android.widget.Toast;

public class Balance extends MenuData
{
    private static double balance = 0;
    public Balance(Context context, Activity activity)
    {
        this.context = context;
        this.activity = activity;
    }

    public double getBalance()
    {
        return balance;
    }

    // method updates the patient's balance
    public void calculateBalance(double amount)
    {
        // create a new NumberFormat with standard currency settings
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        currency.setMaximumFractionDigits(2);
        currency.setMinimumIntegerDigits(2);

        // add the passed amount (even negative) to the account balance
        balance += amount;

        // FUTURE: UPDATE THE DATABASE WITH THE NEW BALANCE

        // show a toast message that displays the change to the patient's balance
        if (amount < 0)
            toast(currency.format(Math.abs(amount)) + " has been deducted from your account!");
        else
            toast(currency.format(amount) + " has been added to your account!");
    }

    public void toast(String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
