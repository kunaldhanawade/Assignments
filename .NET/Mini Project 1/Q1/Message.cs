using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace AccountDemo
{
    internal class Message
    {
        public void DepositSMS(double amount, double balance, string name, int id)
        {
            Console.WriteLine($"SMS: Dear {name}, amount of Rs. {amount} has been deposited in your account ending in xxxxxx{id % 1000}. Your balance is Rs. {balance}");
        }

        public void DepositEmail(double amount, double balance, string name, int id)
        {
            Console.WriteLine($"Email: Dear {name}, amount of Rs. {amount} has been deposited in your account ending in xxxxxx{id % 1000}. Your balance is Rs. {balance}\n");
        }
        public void WithdrawSMS(double amount, double balance, string name, int id)
        {
            Console.WriteLine($"SMS: Dear {name}, amount of Rs. {amount} has been withdrawn from your account ending in xxxxxx{id % 1000}. Your balance is Rs. {balance}");
        }

        public void WithdrawEmail(double amount, double balance, string name, int id)
        {
            Console.WriteLine($"Email: Dear {name}, amount of Rs. {amount} has been withdrawn from your account ending in xxxxxx{id % 1000}. Your balance is Rs. {balance}\n");
        }
    }
}
