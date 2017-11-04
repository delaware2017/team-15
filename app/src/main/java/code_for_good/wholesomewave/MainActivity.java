package code_for_good.wholesomewave;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
{
    Context context;
    Activity activity;
    Validator valid;
    LoginMenu loginMenu;
    AccountInfo accountInfo;

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
                case R.id.to_fruit_basket_button:
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

    protected void updateBalance()
    {
        Balance balance = new Balance();
        balance.calculateBalance(125.73);

        TextView tvMainMenuBalance = (TextView)findViewById(R.id.tv_main_menu_balance);

        String newText = R.string.balance + "" + balance.getBalance();
        tvMainMenuBalance.setText(newText);
    }

    protected void toMainMenu(View button)
    {
        updateContexts();
        setContentView(R.layout.activity_main);
    }
}
