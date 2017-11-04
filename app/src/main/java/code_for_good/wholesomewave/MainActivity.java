package code_for_good.wholesomewave;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    Context context;
    Activity activity;
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
        switch (button.getId()){

        }
    }
    protected void verifyLogin(View button) {

        updateContexts();
        loginMenu = new LoginMenu(context, activity);


    }
}
