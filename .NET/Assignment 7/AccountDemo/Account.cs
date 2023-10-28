
namespace AccountDemo
{
    internal class Account
    {
        static Account()
        {
            Console.WriteLine("Bank of Kunal\n");
        }

        private static int setID = 100503400;
        private int id = setID++;
        private string name;
        private double balance;

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

        public virtual void withdraw(double amount)
        {

        }

        public void deposit(double amount)
        {
            if (balance > 0)
            {
                balance += amount;
            }
        }

        public override string ToString()
        {
            return $"id: {id} name: {name} balance: {balance}";
        }
    }
}
