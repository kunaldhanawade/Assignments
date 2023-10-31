using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MyConsoleApp
{
    public class Employee
    {
        private static int setID;
        private int id;
        private string name;
        private double salary;
        private double netSalary;

        public Employee(string name, double salary)
        {
            this.id = setID++;
            this.name = name;
            this.salary = salary;
            CalculateNetSalary();
        }
        public void CalculateNetSalary()
        {
            netSalary = salary - salary * 0.1;
        }

        public void display()
        {
            Console.WriteLine($"Name: {name} Net Salary: {netSalary}");
        }
    }
}
