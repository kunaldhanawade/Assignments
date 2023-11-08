namespace AccountDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Account> accounts = new List<Account>()
            {
                new Savings("Rohit", 2000),
                new Savings("Sanket", 6000),
                new Current("Vedant"),
                new Current("Omkar"),
                new Savings("Anup", 10000),
            };

            try
            {
                accounts.Add(new Current("Nikhil"));
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }

            Message msg = new Message();
            foreach (var account in accounts)
            {
                account.notifyOnDepositEvent += msg.DepositSMS;
                account.notifyOnDepositEvent += msg.DepositEmail;
                account.notifyOnWithdrawEvent += msg.WithdrawSMS;
                account.notifyOnWithdrawEvent += msg.WithdrawEmail;
            }

            Console.WriteLine("\n-----------------Initial balance-----------------");
            foreach (var acc in accounts)
                Console.WriteLine(acc);

            Console.WriteLine("\n-----------------On Deposit: -----------------\n");
            accounts[0].deposit(9999);
            accounts[1].deposit(678);
            try
            {
                accounts[2].deposit(0);
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            accounts[3].deposit(2146);
            accounts[4].deposit(4326);

            Console.WriteLine("\n-----------------On Paying Interest: -----------------\n");
            foreach (var acc in accounts)
            {
                try
                {
                    Savings.PayInterest(acc);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine("\n-----------------On Withdraw: -----------------\n");
            accounts[0].withdraw(8907);
            try
            {
                accounts[1].withdraw(50000);
            } catch(Exception e)
            {
                Console.WriteLine(e.Message);
            }
            accounts[2].withdraw(835);
            accounts[3].withdraw(1375);
            accounts[4].withdraw(9835);
        }
    }
}