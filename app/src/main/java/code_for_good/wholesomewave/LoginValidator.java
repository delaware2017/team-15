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
        return checkCredentials();

    }

    private boolean checkCredentials(){
        return username.equals("admin") && password.equals("password");
    }

    //When database is implemented
    private void getDataBaseInfo(){

    }
}
