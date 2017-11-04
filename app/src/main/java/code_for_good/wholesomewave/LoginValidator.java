package code_for_good.wholesomewave;


import android.content.Context;

public class LoginValidator implements Validator{

    private String DBusername;
    private String DBpassword;
    private String username;
    private String password;

    public LoginValidator(Context context, String username, String password) {
        this.username = username;
        this.password = password;
        getDataBaseInfo();
    }

    public boolean isTrue() {
        checkCredentials();

        //temporarily returns true
        return true;

    }

    private boolean checkCredentials(){
        return username.equals("") && password.equals(DBpassword);
    }

    private void getDataBaseInfo(){

    }
}
