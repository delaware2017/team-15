package code_for_good.wholesomewave;

import android.app.Activity;
import android.content.Context;

import android.support.v7.widget.Toolbar;

/**
 * Created by Connor on 11/3/2017.
 */

public class AccountInfo
{
    // instance variable for patient's balance
    double balance = 0;

    //


    public AccountInfo(Context context, Activity activity)
    {
        // create a new Toolbar and set the title
        Toolbar toolbar = new Toolbar(activity);
        toolbar.setTitle("My Account");
    }

    // method updates the patient's balance
    public void updateBalance(double amount)
    {
        balance += amount;

    }
}
