package code_for_good.wholesomewave;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    Context context;
    Activity activity;
    Validator valid;
    LoginMenu loginMenu;
    AccountInfo accountInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updateContexts();
    }

    private void updateContexts(){
        context = getApplicationContext();
        activity = MainActivity.this;
    }


    protected void testButton(View button) {
        /*switch (button.getId()){

        }*/
    }

    // method is triggered by clicking on the updateBalanceButton
    protected void accountButtonsEvents(View button)
    {
        updateContexts();
        try {
            switch (button.getId()) {
                case R.id.btUpdateBalance:
                    // update the balance with a test value
                    accountInfo = new AccountInfo(context, activity);
                    accountInfo.updateBalance(3);
                    break;
            }
        } catch (Exception e){
            System.out.println(e.getStackTrace() + "\n" + e.getMessage());
        }
    }
    protected void verifyLogin(View button) {

        /*valid = new LoginValidator();
        if (valid.isTrue()) {
            setContentView()
        }*/
    }
    protected void changeMenu(View button){
        try {

            switch (button.getId()) {
                case R.id.to_account_info_button:
                    setContentView(R.layout.account_info);
                    updateContexts();
                    accountInfo = new AccountInfo(context, activity);
                    break;
                case R.id.to_fruit_basket_button: /*setContentView(R.layout.fruit_basket);*/
                    break;
                case R.id.to_redemption_menu:
                    break;

            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    protected void toMainMenu(View button) {
        updateContexts();
        setContentView(R.layout.activity_main);
    }
}
