package code_for_good.wholesomewave;

import android.app.Activity;
import android.content.Context;

import android.widget.TextView;

import android.support.v7.widget.Toolbar;

import java.text.NumberFormat;

public class AccountInfo extends MenuData
{
    // instance variable for the patient's balance
    private static double balance;

    // instantiate TextView objects
    private TextView accountNumber = (TextView)activity.findViewById(R.id.tvAccountNumber);
    private TextView accountHolder = (TextView)activity.findViewById(R.id.tvAccountHolder);
    private TextView balanceText = (TextView)activity.findViewById(R.id.tvBalance);

    public AccountInfo(Context context, Activity activity)
    {
        this.context = context;
        this.activity = activity;

        // create a new Toolbar and set the title
        Toolbar toolbar = new Toolbar(activity);
        toolbar.setTitle("My Account");

        // set balance to zero
        //FUTURE GET FROM DB
        balance = 0;
    }

    // method updates the patient's balance
    public void updateBalance(double amount)
    {
        // create a NumberFormat object with standard currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        currency.setMinimumFractionDigits(2);
        currency.setMaximumFractionDigits(2);

        // add the passed amount (even negative) to the account balance
        balance += amount;

        // update the balanceText TextView to display the updated balance
        // negative values are displayed along with a minus sign
        String newText;

        /*
        if (balance >= 0)
            newText = R.string.balance + "$" + balance;
        else
            newText = R.string.balance + "-$" + balance;
        */

        newText = R.string.balance + "" + currency.format(balance);
        balanceText.setText(newText);
    }
}
