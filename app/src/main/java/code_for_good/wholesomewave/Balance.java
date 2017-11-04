package code_for_good.wholesomewave;

public class Balance
{
    private static double balance = 0;
    public Balance()
    {

    }

    public double getBalance()
    {
        return balance;
    }

    // method updates the patient's balance
    public void calculateBalance(double amount)
    {
        // add the passed amount (even negative) to the account balance
        balance += amount;

        // FUTURE: UPDATE THE DATABASE WITH THE NEW BALANCE
    }
}
