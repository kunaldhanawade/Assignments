
namespace AccountDemo
{
    public delegate void notifyOnDeposit(double amount, double balance, string name, int id);
    public delegate void notifyOnWithdraw(double amount, double balance, string name, int id);
    abstract class Account
    {
        public event notifyOnDeposit notifyOnDepositEvent;
        public event notifyOnWithdraw notifyOnWithdrawEvent;

        private static int setID = 100503400;
        private int id;
        private string name;
        private double balance;
        const int noOfObjects = 5;
        static int counter;

        static Account()
        {
            Console.WriteLine("Bank of Baroda\n");
        }

        public Account(string name)
        {
            counter++;
            if (counter > noOfObjects)
                throw new Exception("Object Creation is not Allowed");
            else
                id = setID++;
            Name = name;
        }

        public int Id
        {
            get { return id; }
        }

        public string Name
        {
            set
            {
                if (value.Length > 2 && value.Length < 15)
                    name = value;
                else
                    Console.WriteLine("Invalid Name Format!");
            }
            get { return name; }
        }

        public double Balance
        {
            protected set { balance = value; }
            get { return balance; }
        }

        public abstract void withdraw(double amount);

        public void OnWithdraw(double amount, double balance, string name, int id)
        {
            if (notifyOnWithdrawEvent != null)
                notifyOnWithdrawEvent(amount, balance, name, id);
        }

        public void OnDeposit(double amount, double balance, string name, int id)
        {
            if (notifyOnDepositEvent != null)
                notifyOnDepositEvent(amount, balance, name, id);
        }

        public void deposit(double amount)
        {
            if (amount > 0)
            {
                balance += amount;
                OnDeposit(amount, Balance, Name, Id);
            }
            else
                throw new Exception("Invalid Input\n");
        }

        public override string ToString()
        {
            return $"id: {id} name: {name} balance: {balance}";
        }
    }
}
