package code_for_good.wholesomewave;


import android.content.Context;

/**
 * Author: Connor Price & Kevin Bradshaw
 * Date: 11/4/2017
 */

public class LoginValidator implements Validator{

    // instance variables
    private String DBusername;
    private String DBpassword;
    private String username;
    private String password;

    // constructor that accepts a context, username, and password
    public LoginValidator(Context context, String username, String password) {
        this.username = username;
        this.password = password;
        getDataBaseInfo();
    }

    // returns true if checkCredentials returns true
    public boolean isTrue() {
        return checkCredentials();

    }

    // checks the user's credentials
    private boolean checkCredentials(){
        return username.equals("admin") && password.equals("password");
    }


    // TODO: get database information
    private void getDataBaseInfo(){

    }
}
