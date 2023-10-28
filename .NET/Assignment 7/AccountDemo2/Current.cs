
using System.Xml.Linq;

namespace AccountDemo
{
    internal class Current : Account
    {
        public Current(string name) : base(name) { }
        public override void withdraw(double amount)
        {
            Balance -= amount;
        }
    }
}
