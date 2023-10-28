namespace AccountDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Account[] accounts = new Account[2]
            {
                new Savings("Omkar"),
                new Current("Vedant")
            };
            
            Console.WriteLine("Initial balance");
            foreach (var acc in accounts)
                Console.WriteLine(acc);

            accounts[0].deposit(9999);
            accounts[1].deposit(678);

            Console.WriteLine("On Deposit: ");
            foreach (var acc in accounts)
                Console.WriteLine(acc);

            accounts[0].withdraw(8907);
            accounts[1].withdraw(2345);

            Console.WriteLine("On Withdraw: ");
            foreach (var acc in accounts)
                Console.WriteLine(acc);
        }
    }
}