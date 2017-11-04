package code_for_good.wholesomewave;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Context context;
    Activity activity;
    AccountInfo accountInfo;
    LoginMenu loginMenu;
    Button titleButton;
    TextView titleMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title_screen);
        animateTitleScreen();
        updateContexts();
    }

    private void updateContexts()
    {
        context = getApplicationContext();
        activity = MainActivity.this;
    }

    private void animateTitleScreen(){
        titleButton = (Button) findViewById(R.id.title_button);
        titleMessage = (TextView) findViewById(R.id.title_message);

        Animation infiniteFade = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.infinite_fade);
        titleButton.startAnimation(infiniteFade);

        AlphaAnimation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(3000);
        titleMessage.startAnimation(fadeIn);
    }

    protected void changeMenu(View button){
        try
        {
            switch (button.getId())
            {
                case R.id.title_button:
                    setContentView(R.layout.user_login);
                    updateContexts();
                    loginMenu = new LoginMenu(context, activity);
                    break;
                case R.id.to_account_info_button:
                    setContentView(R.layout.account_info);
                    updateContexts();
                    accountInfo = new AccountInfo(context, activity);
                    break;
                case R.id.event_menu_button:
                    setContentView(R.layout.event_menu);
                    break;
                case R.id.earning_credit_info:
                    setContentView(R.layout.qr_screen);
                    break;
                case R.id.btBack:
                    setContentView(R.layout.activity_main);
                    updateContexts();
                    Balance balance = new Balance(context, activity);
                    balance.calculateBalance(-5);
                    break;
                case R.id.btPurchases:
                    setContentView(R.layout.purchases);
                    break;
                case R.id.btBackPurchases:
                    setContentView(R.layout.activity_main);
                    break;
            }
            updateContexts();
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
