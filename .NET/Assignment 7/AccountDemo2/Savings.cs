
namespace AccountDemo
{
    internal class Savings : Account
    {
        const double minBalance = 1000;
        public Savings(string name) : base(name) { }
        public override void withdraw(double amount)
        {
            double x = Balance - amount;
            if ( x >= minBalance)
            {
                Balance = x;
            }
        }
    }
}
