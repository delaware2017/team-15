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
    Context context;
    Activity activity;
    LoginMenu loginMenu;
    AccountInfo accountInfo;
    TextView tvMainMenuBalance;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title_screen);

        updateContexts();
    }

    private void updateContexts()
    {
        context = getApplicationContext();
        activity = MainActivity.this;
    }

    protected void verifyLogin(View button) {
        /*valid = new LoginValidator();
        if (valid.isTrue()) {
            setContentView()
        }*/
    }
    protected void changeMenu(View button){
        try
        {
            updateContexts();
            switch (button.getId())
            {
                case R.id.title_button:
                    setContentView(R.layout.activity_main);
                    break;
                case R.id.to_account_info_button:
                    setContentView(R.layout.account_info);
                    updateContexts();
                    accountInfo = new AccountInfo(context, activity);
                    break;
                case R.id.event_menu_button:
                    setContentView(R.layout.event_menu);
                    updateContexts();
                    break;
                case R.id.to_redemption_menu:
                    break;
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    protected void updateBalance(View v)
    {
        // create a NumberFormat object with standard currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        currency.setMinimumFractionDigits(2);
        currency.setMaximumFractionDigits(2);

        Balance balance = new Balance();
        balance.calculateBalance(125.73);

        tvMainMenuBalance = (TextView)findViewById(R.id.tv_main_menu_balance);

        String newText = getString(R.string.balance) + "" + currency.format(balance.getBalance());
        tvMainMenuBalance.setText(newText);
    }

    protected void toMainMenu(View button)
    {
        updateContexts();
        setContentView(R.layout.activity_main);
    }
}
