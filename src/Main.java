public class Main {
    public static void main(String[] args)
    {
        //create a bank app
        // 1. hi
        // 2. bye
        // 3. hello
        // 4. goodbye
        // 5. hello again!
        // 6. i changed this...
        System.out.println("lets create a bank app");
        bank sbi = new SBIBank(1000, "Radhika","Radhika@123");
        System.out.println(sbi.checkBalance());
        System.out.println(sbi.addMoney(20000));
        System.out.println(sbi.withdrawMoney(500));
        System.out.println(sbi.checkBalance());

    }
}