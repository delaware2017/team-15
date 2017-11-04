package code_for_good.wholesomewave;


import android.content.Context;

public class LoginValidator implements Validator{
    LoginDBConnector loginDBConnector;
    private String DBusername;
    private String DBpassword;

    public LoginValidator(Context context){

    }

    public boolean isTrue() {

        //temporarily returns true
        return true;

    }

    private boolean checkCredentials(){

        return true; //temp
    }

    private void getDataBaseInfo(){

    }
}
