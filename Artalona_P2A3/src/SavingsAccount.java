public class SavingsAccount
{
    private static double annuallIntrestRate;
    private double savingsBalance;

    public SavingsAccount(int savingsBalance)
    {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyIntrestRate()
    {
        savingsBalance += (((annuallIntrestRate) / 12) * savingsBalance);
    }

    public static void modifyIntrestRate(double newRate)
    {
        annuallIntrestRate = newRate;
    }
    public double getBalance()
    {
        return savingsBalance;
    }
}
