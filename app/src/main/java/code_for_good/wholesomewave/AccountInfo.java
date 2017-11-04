package code_for_good.wholesomewave;

import android.app.Activity;
import android.content.Context;

import android.support.v7.widget.Toolbar;

public class AccountInfo extends MenuData
{
    // instance variable for the patient's balance
    private double balance;

    public AccountInfo(Context context, Activity activity)
    {
        this.context = context;
        this.activity = activity;

        // create a new Toolbar and set the title
        Toolbar toolbar = new Toolbar(activity);
        toolbar.setTitle("My Account");

        balance = 0;
    }

    // method updates the patient's balance
    public void updateBalance(double amount)
    {
        balance += amount;

    }
}
