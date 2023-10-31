
namespace AccountDemo
{
    abstract class Account
    {
        static Account()
        {
            Console.WriteLine("Bank of Kunal\n");
        }

        private static int setID = 100503400;
        private int id = setID++;
        private string name;
        private double balance;
        private static double interestRate = 0.07;

        public Account(string name)
        {
            Name = name;
        }

        public int Id
        {
            get { return id; }
        }

        public string Name
        {
            set { name = value; }
            get { return name; }
        }

        public double Balance
        {
            protected set { balance = value; }
            get { return balance; }
        }

        public abstract void withdraw(double amount);

        public void deposit(double amount)
        {
            if (amount > 0)
            {
                balance += amount;
            }
        }

        public static double PayInterest(Account obj)
        {
            double interest = 0.0;
            if(obj.balance > 0)
            {
                interest = obj.balance * interestRate;
                obj.balance += interest;
            }
            return interest;
        }

        public override string ToString()
        {
            return $"id: {id} name: {name} balance: {balance}";
        }
    }
}
