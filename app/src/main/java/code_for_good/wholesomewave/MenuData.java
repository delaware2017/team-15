package code_for_good.wholesomewave;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

public class MenuData {
    public Activity activity;
    public Context context;


    public void theToasting(String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}