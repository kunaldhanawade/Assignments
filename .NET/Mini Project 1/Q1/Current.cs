
using System.Xml.Linq;

namespace AccountDemo
{
    internal class Current : Account
    {
        public Current(string name) : base(name) { }
        public override void withdraw(double amount)
        {
            Balance -= amount;
            OnWithdraw(amount, Balance, Name, Id);

            if(Balance< 0)
            {
                Console.Beep();
                Console.WriteLine("Reminder: Your Balance is less than Rs. 0.  Please deposit money to maintain a positive balance.\n");
            }

            AccountState ac = new AccountState
            {
                Name = Name,
                Id = Id,
                Balance = Balance,
                Amount = amount,
                Transaction = "Debit"
            };
            Serialize.SaveAsXmlFormat(ac, @$"..\Data\{Name}_{Id}.xml");
        }
    }
}
