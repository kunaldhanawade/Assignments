
using System.Xml.Linq;

namespace AccountDemo
{
    internal class Current : Account
    {
        public Current(string name, double balance)
        {
            Name = name;
            Balance = balance;
        }
        public override void withdraw(double amount)
        {
            Balance -= amount;
        }
    }
}
