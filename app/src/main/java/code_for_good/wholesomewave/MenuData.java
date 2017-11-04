package code_for_good.wholesomewave;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

public class MenuData {
    // object instantiations
    public Activity activity;
    public Context context;
    public Validator valid;
    public String username;
    public String password;

    // method that creates toast messages from passed strings
    public void theToasting(String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
