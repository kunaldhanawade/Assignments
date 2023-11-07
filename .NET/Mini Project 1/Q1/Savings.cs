
namespace AccountDemo
{
    internal class Savings : Account
    {
        const double minBalance = 1000;

        private static double interestRate = 0.07;
        public Savings(string name, double balance) : base(name)
        {
            if (balance >= minBalance)
                Balance = balance;
        }
        public override void withdraw(double amount)
        {
            double x = Balance - amount;
            if (x >= minBalance)
            {
                Balance = x;
                OnWithdraw(amount, Balance, Name, Id);
            }
            else
                throw new Exception("Insufficient Balance\n");
        }

        public static double PayInterest(Account acc)
        {
            if (!(acc is Savings))
                throw new Exception(acc.Id + ": " + acc.Name + " is not a Savings Account\n");

            double interest = 0.0;
            if (acc.Balance > 0)
            {
                interest = acc.Balance * interestRate;
                acc.deposit(interest);
            }
            return interest;
        }
    }
}
