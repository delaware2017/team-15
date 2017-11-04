package code_for_good.wholesomewave;


import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.EditText;

public class LoginMenu extends MenuData{
    private EditText username;
    private EditText password;


    public LoginMenu(Context context, Activity activity){
        this.context = context;
        this.activity = activity;

        collectUserData();

    }

    private void validateUserCredentials() {
        valid = new LoginValidator(context);
    }

    private void collectUserData(){
        username = (EditText) activity.findViewById(R.id.et_login_username);
        password = (EditText) activity.findViewById(R.id.et_login_password);
    }


    private String getStringFromEditText(EditText editText){
        return editText.getText().toString();
    }
}
