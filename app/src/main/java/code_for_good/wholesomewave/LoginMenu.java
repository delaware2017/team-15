package code_for_good.wholesomewave;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * Author: Connor Price & Kevin Bradshaw
 * Date: 11/4/2017
 */

public class LoginMenu extends MenuData
{
    // instance variables
    private EditText username;
    private EditText password;
    private Button verify;
    TextView mainMenuBalance;
    Balance balance;
    String balanceString;

    // constructor that accepts a context and activity
    public LoginMenu(Context context, Activity activity) {
        this.context = context;
        this.activity = activity;


        // verify the user's data
        verify = (Button) activity.findViewById(R.id.login_button);
        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // collect and set user data
                System.out.println("Debug");
                collectUserData();
                setUserData();
                validateUserCredentials();
            }
        });
    }

    // method that validates the credentials
    private void validateUserCredentials()
        {
            valid = new LoginValidator(context, super.username, super.password);
            if (valid.isTrue()) {
                activity.setContentView(R.layout.activity_main);
                updateMainMenuBalance();
            }
            else
                theToasting("Incorrect login credentials");
        }

    // method that collects user data
    private void collectUserData()
    {
        username = (EditText) activity.findViewById(R.id.et_login_username);
        password = (EditText) activity.findViewById(R.id.et_login_password);
    }

    // method that sets user data
    private void setUserData()
    {
        super.username = getStringFromEditText(username);
        super.password = getStringFromEditText(password);
    }

    // method that gets a string from an EditText
    private String getStringFromEditText(EditText editText)
    {
        return editText.getText().toString();
    }

    protected void updateMainMenuBalance(){
        mainMenuBalance = (TextView) activity.findViewById(R.id.tv_balance_main_menu);
        balance = new Balance(context, activity);
        balanceString = formatAsCurrency(balance.getBalance());
        mainMenuBalance.setText(balanceString);
    }
    private String formatAsCurrency(double number){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        currency.setMaximumFractionDigits(2);
        currency.setMinimumIntegerDigits(2);

        return currency.format(number);

    }
}
