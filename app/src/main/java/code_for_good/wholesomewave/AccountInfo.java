package code_for_good.wholesomewave;

import android.app.Activity;
import android.content.Context;

import android.widget.Button;
import android.widget.TextView;

import android.support.v7.widget.Toolbar;

public class AccountInfo extends MenuData
{
    // instance variable for the patient's balance
    private static double balance = 0;

    // instantiate TextView objects
    private TextView accountNumber;
    private TextView accountHolder;
    private TextView balanceText;
    private Button mainMenuButton;

    public AccountInfo(Context context, Activity activity)
    {
        // update the context and activity
        this.context = context;
        this.activity = activity;
        setupData();

        // create a new Toolbar and set the title
        Toolbar toolbar = new Toolbar(activity);
        toolbar.setTitle("My Account");

        //FUTURE GET BALANCE FROM DB
    }

    // initializes Android widgets
    private void setupData()
    {
        accountNumber = (TextView)activity.findViewById(R.id.tvAccountNumber);
        accountHolder = (TextView)activity.findViewById(R.id.tvAccountHolder);
        balanceText = (TextView)activity.findViewById(R.id.tvBalance);
        mainMenuButton = (Button)activity.findViewById(R.id.btMainMenu);
    }
}
