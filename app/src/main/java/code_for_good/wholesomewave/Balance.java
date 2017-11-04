package code_for_good.wholesomewave;

import android.app.Activity;
import android.content.Context;

import java.text.NumberFormat;

import android.widget.Toast;

public class Balance extends MenuData
{
    // instance variable for the patient's balance
    static double balance = 38.46;

    // constructor that accepts a context and activity
    public Balance(Context context, Activity activity)
    {
        this.context = context;
        this.activity = activity;

    }

    // getBalance method that returns the balance
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

        // ADD PURCHASE TO THE DATABASE
    }

    // method that creates toast messages from the string passed to it
    public void toast(String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
