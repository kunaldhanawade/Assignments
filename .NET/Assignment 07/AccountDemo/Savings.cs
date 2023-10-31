
namespace AccountDemo
{
    internal class Savings : Account
    {
        public Savings(string name, double balance)
        {
            Name = name;
            Balance = balance;
        }
        public override void withdraw(double amount)
        {
            double x = Balance - amount;
            if ( x >= 1000)
            {
                Balance = x;
            }
        }
    }
}
