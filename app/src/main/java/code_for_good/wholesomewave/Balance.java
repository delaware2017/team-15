package code_for_good.wholesomewave;

import android.app.Activity;
import android.content.Context;

import java.text.NumberFormat;

import android.widget.TextView;
import android.widget.Toast;

public class Balance extends MenuData
{
    // instance variable for the patient's balance
<<<<<<< HEAD
    static double balance = 38.46;
=======
    public static double balance = 30;
    public static TextView mainMenuBalance;
    public static TextView accountInfoBalance;
>>>>>>> 6b601b5e52d1278a693c1b17d9c2abc5de021398

    // constructor that accepts a context and activity
    public Balance(Context context, Activity activity)
    {
        this.context = context;
        this.activity = activity;

    }

    private void setViews(){
        mainMenuBalance = (TextView) activity.findViewById(R.id.tv_main_menu_balance);
        accountInfoBalance = (TextView) activity.findViewById(R.id.tv_account_info_balance);

        mainMenuBalance.setText(formatAsCurrency(balance));
        accountInfoBalance.setText(formatAsCurrency(balance));

    }
    // create a new NumberFormat with standard currency settings
    private String formatAsCurrency(double number){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        currency.setMaximumFractionDigits(2);
        currency.setMinimumIntegerDigits(2);

        return currency.format(number);

    }

    // getBalance method that returns the balance
    public double getBalance()
    {
        return balance;
    }

    // method updates the patient's balance
    public void calculateBalanceAndUpdateViews(double amount)
    {
        // add the passed amount (even negative) to the account balance,
        //and update textViews
        balance += amount;
        setViews();

        // FUTURE: UPDATE THE DATABASE WITH THE NEW BALANCE

        // show a toast message that displays the change to the patient's balance
        if (amount < 0)
            toast(formatAsCurrency(Math.abs(amount)) + " has been deducted from your account!");
        else
            toast(formatAsCurrency(amount) + " has been added to your account!");



        // TODO: ADD PURCHASE TO THE DATABASE
    }

    // method that creates toast messages from the string passed to it
    public void toast(String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
