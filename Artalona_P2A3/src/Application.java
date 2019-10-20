public class Application {
//final
    public static void main(String[] args) {
        //instantiate two SavingsAccount objects
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.modifyIntrestRate(.04);

        int counter = 1;

        while (counter != 13) {
            saver1.calculateMonthlyIntrestRate();
            saver2.calculateMonthlyIntrestRate();
            System.out.print("Saver1 after " + counter + " months has $");
            System.out.printf("%.2f \n", saver1.getBalance());

            System.out.print("Saver2 after " + counter + " months has $");
            System.out.printf("%.2f \n", saver2.getBalance());

            counter++;
        }

        SavingsAccount.modifyIntrestRate(.05);
        saver1.calculateMonthlyIntrestRate();
        saver2.calculateMonthlyIntrestRate();

        System.out.println("The two accounts after .05 intrest rate will now be:");
        System.out.printf("Saver1 is :%.2f\n", saver1.getBalance());
        System.out.printf("Saver2 is :%.2f\n", saver2.getBalance());
    }
}
