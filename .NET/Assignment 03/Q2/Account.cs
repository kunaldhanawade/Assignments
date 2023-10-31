using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MyConsoleApp
{
    public class Account
    {
        private static int setID;
        private int id;
        private string name;
        private double balance;

        public Account(string name)
        {
            this.id = setID++;
            this.name = name;
            Console.Write("Account Created: ");
            display();
        }
        public void deposit(int amt)
        {
            balance += amt;
            Console.Write("On Deposit: ");
            display();
        }

        public void withdraw(int amt)
        {
            balance -= amt;
            Console.Write("On Withdraw: ");
            display();
        }

        public void display()
        {
            Console.WriteLine($"Name: {name} Balance: {balance}");
        }
    }
}
