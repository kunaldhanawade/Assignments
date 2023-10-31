/*Create enum dep having value [MKT=1 , ADV=2,ADMN=3]
Create a class Employee with instance member id, name , salary and enum dept d.
Create 5 object of class Employee and put them into different department.
Write a  sataic method which will display department wise total salary paid*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    enum dept
    {
        Marketing,
        Advertisement,
        Admin
    }

    class Employee
    {
        public int id;
        public string name;
        public double salary;
        public dept d;

        public Employee(int id, string name, double salary, dept d)
        {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.d = d;
        }

        public static void display(Employee[] employee)
        {
            double totalMarketing = 0;
            double totalAdvertisement = 0;
            double totalAdmin = 0;

            for (int i = 0; i < employee.Length; i++)
            {
                if (employee[i].d == dept.Marketing)
                {
                    totalMarketing += employee[i].salary;
                }
                else if (employee[i].d == dept.Advertisement)
                {
                    totalAdvertisement += employee[i].salary;
                }
                else if (employee[i].d == dept.Admin)
                {
                    totalAdmin += employee[i].salary;
                }
            }

            Console.WriteLine("Department wise salary:");
            Console.WriteLine(dept.Marketing.ToString()+": "+totalMarketing);
            Console.WriteLine(dept.Advertisement.ToString()+": "+totalAdvertisement);
            Console.WriteLine(dept.Admin.ToString()+": "+totalAdmin);
        }
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee e1 = new Employee(1001, "harsh", 1000, dept.Advertisement);
            Employee e2 = new Employee(1002, "omkar", 2000, dept.Advertisement);
            Employee e3 = new Employee(1003, "akshay", 3000, dept.Marketing);
            Employee e4 = new Employee(1004, "vedant", 4000, dept.Admin);

            Employee[] emparr = { e1, e2, e3, e4 };

            Employee.display(emparr);
        }
    }
}
