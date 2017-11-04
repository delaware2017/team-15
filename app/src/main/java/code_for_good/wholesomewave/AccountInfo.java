package code_for_good.wholesomewave;

import android.app.Activity;
import android.content.Context;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.support.v7.widget.Toolbar;

import java.text.NumberFormat;

public class AccountInfo extends MenuData
{
    // instance variable for the patient's balance
    private static double balance;

    // instantiate TextView objects
    private TextView accountNumber;
    private TextView accountHolder;
    private TextView balanceText;
    private Button updateBalance;
    private Button mainMenuButton;

    public AccountInfo(Context context, Activity activity)
    {
        this.context = context;
        this.activity = activity;
        setupData();

        // create a new Toolbar and set the title
        Toolbar toolbar = new Toolbar(activity);
        toolbar.setTitle("My Account");

        // set balance to zero
        //FUTURE GET FROM DB
        balance = 0;
    }

    // initializes Android widgets
    private void setupData()
    {
        accountNumber = (TextView)activity.findViewById(R.id.tvAccountNumber);
        accountHolder = (TextView)activity.findViewById(R.id.tvAccountHolder);
        balanceText = (TextView)activity.findViewById(R.id.tvBalance);
        updateBalance = (Button) activity.findViewById(R.id.btUpdateBalance);
        mainMenuButton = (Button)activity.findViewById(R.id.btMainMenu);
    }
}
