package code_for_good.wholesomewave;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginMenu extends MenuData{
    private EditText username;
    private EditText password;
    private Button verify;


    public LoginMenu(Context context, Activity activity){
        this.context = context;
        this.activity = activity;

        collectUserData();
        setUserData();

        verify = (Button) activity.findViewById(R.id.login_button);

        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateUserCredentials();
            }
        });
    }

    private void validateUserCredentials() {
        valid = new LoginValidator(context, super.username, super.password);
        if (valid.isTrue()) {
            activity.setContentView(R.layout.activity_main);
        }
    }

    private void collectUserData(){
        username = (EditText) activity.findViewById(R.id.et_login_username);
        password = (EditText) activity.findViewById(R.id.et_login_password);
    }
    private void setUserData(){
        super.username = getStringFromEditText(username);
        super.password = getStringFromEditText(password);
    }

    private String getStringFromEditText(EditText editText){
        return editText.getText().toString();
    }
}
