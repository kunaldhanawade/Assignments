using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MyConsoleApp
{
    public enum Department
    {
        Marketing, Admin, Advertisement
    }
    public class Employee
    {
        private static int setID;
        private int id;
        private string name;
        private double salary;
        private double netSalary;
        private Department d;

        static Employee()
        {
            Console.WriteLine("Kunal.co.in");
        }

        public Employee(string name, double salary, Department d)
        {
            this.id = setID++;
            this.name = name;
            this.salary = salary;
            this.d = d;
        }

        public double paytax(double p)
        {
            netSalary = salary - salary * (p / 100);
            return p;
        }
        public void display()
        {
            Console.WriteLine($"Name: {name} Net Salary: {netSalary} Deartment: {d}");
        }
    }
}
