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
    // import Context and Activity objects
    Context context;
    Activity activity;

    // import more objects
    AccountInfo accountInfo;
    LoginMenu loginMenu;
    Button titleButton;
    TextView titleMessage;
    TextView tvMainMenuBalance;
    Balance balance;

    // onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title_screen);

        animateTitleScreen();
        updateContexts();

        balance = new Balance(context, activity);
    }

    // updates the context and activity for switching views
    private void updateContexts()
    {
        context = getApplicationContext();
        activity = MainActivity.this;
    }


    //makes elements of title screen fade in and out
    private void animateTitleScreen(){
        titleButton = (Button) findViewById(R.id.title_button);
        titleMessage = (TextView) findViewById(R.id.title_message);

        Animation infiniteFade = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.infinite_fade);
        titleButton.startAnimation(infiniteFade);

        AlphaAnimation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(3000);
        titleMessage.startAnimation(fadeIn);
    }


    // changes the view / performs operations based upon which buttons are pressed
    protected void changeMenu(View button){
        try
        {
            // first, update the context and activity
            updateContexts();

            switch (button.getId())
            {
                // when the title button ("Continue") is pressed, switch to the login screen
                case R.id.title_button:
                    setContentView(R.layout.user_login);
                    updateContexts();
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
                    break;
                // when the qr button is pressed, the app displays a QR code to scan at the register
                case R.id.qr_button:
                    setContentView(R.layout.qr_screen);
                    break;
                // when the back button is pressed, the program leaves the QR screen and returns to the main menu
                case R.id.btBack:
                    setContentView(R.layout.activity_main);
                    updateContexts();
                    Balance balance = new Balance(context, activity);
                    balance.calculateBalance(-5);
                    break;
                // when the purchases button is pressed, the app switches to the purchase history view
                case R.id.btPurchases:
                    setContentView(R.layout.purchases);
                    break;
                // when the back-purchases button is pressed, the program leaves the purchases history view
                case R.id.btBackPurchases:
                    setContentView(R.layout.activity_main);
                    break;
            }
            // update the context and activity again
            updateContexts();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    // method displays the main menu
    protected void toMainMenu(View button)
    {
        updateContexts();
        setContentView(R.layout.activity_main);
    }

}
