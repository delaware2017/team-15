package code_for_good.wholesomewave;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity
{
    // import Context and Activity objects
    Context context;
    Activity activity;

    // import more objects
    LoginMenu loginMenu;
    AccountInfo accountInfo;
    TextView tvMainMenuBalance;

    // onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title_screen);

        // update the contexts
        updateContexts();
    }

    // updates the context and activity for switching views
    private void updateContexts()
    {
        context = getApplicationContext();
        activity = MainActivity.this;
    }

    // changes the view / performs operations based upon which buttons are pressed
    protected void changeMenu(View button){
        try
        {
            // first, update the context and activity
            updateContexts();
            switch (button.getId())
            {
                // when the title button ("Continue") is pressed, switch to the main activity
                case R.id.title_button:
                    setContentView(R.layout.activity_main);
                    break;
                // when the account info button is pressed, switch to the account info page
                case R.id.to_account_info_button:
                    setContentView(R.layout.account_info);
                    updateContexts();
                    accountInfo = new AccountInfo(context, activity);
                    break;
                // when the event menu button ("How to earn credit") is pressed, switch to the credits information page
                case R.id.event_menu_button:
                    setContentView(R.layout.event_menu);
                    updateContexts();
                    break;
                case R.id.earning_credit_info:
                    setContentView(R.layout.qr_screen);
                    updateContexts();
                    break;
                case R.id.btBack:
                    setContentView(R.layout.activity_main);
                    updateContexts();

                    // create a new Balance object
                    Balance balance = new Balance(context, activity);
                    balance.calculateBalance(-5);

                    // create a NumberFormat object with standard currency formatting
                    NumberFormat currency = NumberFormat.getCurrencyInstance();
                    currency.setMinimumFractionDigits(2);
                    currency.setMaximumFractionDigits(2);

                    tvMainMenuBalance = (TextView)findViewById(R.id.tv_main_menu_balance);

                    String newText = getString(R.string.balance) + "" + currency.format(balance.getBalance());
                    tvMainMenuBalance.setText(newText);
                    break;
                case R.id.btPurchases:
                    setContentView(R.layout.purchases);
                    updateContexts();
                    break;
                case R.id.btBackPurchases:
                    setContentView(R.layout.activity_main);
                    updateContexts();
                    break;
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    protected void toMainMenu(View button)
    {
        updateContexts();
        setContentView(R.layout.activity_main);
    }

}
