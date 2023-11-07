using Microsoft.Extensions.Configuration;
using MiniProjectApp.Models;

namespace MiniProjectApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            DBServices services = new DBServices();

            List<Employee> list = services.EmployeesInDept(1);
            foreach (var emp in list)
            {
                Console.WriteLine(emp);
            }

            Console.WriteLine("----------------------------------------------------------");

            Employee employee = new Employee
            {
                Name = "Samruddhi",
                Salary = 85000,
                DeptId = 3
            };
            services.AddEmployee(employee);

            services.DeleteEmployee(3);

            list = services.AllEmployees();
            foreach (var emp in list)
            {
                Console.WriteLine(emp);
            }

            Console.WriteLine("----------------------------------------------------------");

            services.EmployeesInDept();

            Console.WriteLine("----------------------------------------------------------");

            list = services.EmployeesBySalary(60000);
            foreach (var emp in list)
            {
                Console.WriteLine(emp);
            }

            Console.WriteLine("----------------------------------------------------------");

            list = services.EmployeesByInitial('s');
            foreach (var emp in list)
            {
                Console.WriteLine(emp);
            }
        }
    }
}