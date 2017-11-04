package code_for_good.wholesomewave;

import android.app.Activity;
import android.content.Context;

import android.support.v7.widget.Toolbar;



public class AccountInfo extends MenuData{
    public AccountInfo(Context context, Activity activity)
    {
        this.context = context;
        this.activity = activity;
        Toolbar toolbar = new Toolbar(activity);
        toolbar.setTitle("Account Information");
    }
}
