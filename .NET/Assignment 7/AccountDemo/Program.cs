namespace AccountDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Account a1 = new Savings("Omkar", 80254);
            Console.WriteLine("Initial balance: " + a1);
            a1.deposit(20000);
            Console.WriteLine("On Deposit: " + a1);
            a1.withdraw(50000);
            Console.WriteLine("On Withdraw: " + a1);

            Account a2 = new Current("Vedant", 921569);
            Console.WriteLine("Initial balance: " + a2);
            a2.deposit(1);
            Console.WriteLine("On Deposit: "+a2);
            a2.withdraw(1000000);
            Console.WriteLine("On Withdraw: "+a2);
        }
    }
}