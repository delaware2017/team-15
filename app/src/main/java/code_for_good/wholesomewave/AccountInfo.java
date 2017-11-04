package code_for_good.wholesomewave;

import android.app.Activity;
import android.content.Context;
import android.view.View;

import android.widget.TextView;
import android.widget.Button;

import android.support.v7.widget.Toolbar;

import org.w3c.dom.Text;

public class AccountInfo extends MenuData
{
    // instance variable for the patient's balance
    private double balance;

    // instantiate TextView objects
    TextView accountNumber = (TextView)activity.findViewById(R.id.tvAccountNumber);
    TextView accountHolder = (TextView)activity.findViewById(R.id.tvAccountHolder);
    TextView balanceText = (TextView)activity.findViewById(R.id.tvBalance);

    public AccountInfo(Context context, Activity activity)
    {
        this.context = context;
        this.activity = activity;

        // create a new Toolbar and set the title
        Toolbar toolbar = new Toolbar(activity);
        toolbar.setTitle("My Account");

        // set balance to zero
        balance = 0;
    }

    protected void updateButtonEvent(View button)
    {
        updateBalance(3);
    }

    // method updates the patient's balance
    public void updateBalance(double amount)
    {
        // add the passed amount (even negative) to the account balance
        balance += amount;

        // update the balanceText TextView to display the updated balance
        String newText;
        if (balance >= 0)
            newText = R.string.balance + "$" + balance;
        else
            newText = R.string.balance + "-$" + balance;
        balanceText.setText(newText);
    }
}
