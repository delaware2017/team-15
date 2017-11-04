package code_for_good.wholesomewave;

import android.app.Activity;
import android.content.Context;

import android.support.v7.widget.Toolbar;

/**
 * Created by Connor on 11/3/2017.
 */

public class AccountInfo {
    public AccountInfo(Context context, Activity activity)
    {
        Toolbar toolbar = new Toolbar(activity);
        toolbar.setTitle("Account Information");
    }
}
