
namespace MyConsoleApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Account a1 = new Account("Akshay More");
            a1.deposit(100000);
            a1.withdraw(45000);

            Account a2 = new Account("Sarthak Dhargalkar");
            a1.deposit(10000);
            a1.withdraw(4000);
        }
    }
}
