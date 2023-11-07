using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using MiniProjectApp.Models;

namespace MiniProjectApp
{
    internal class DBServices
    {
        private static readonly EmployeeContext db = new EmployeeContext();

        public List<Employee> EmployeesInDept(int Id)
        {
            FormattableString sql = $"SELECT * FROM Employees WHERE DeptId={Id}";
            List<Employee> employees = db.Employees.FromSql(sql).ToList<Employee>();
            return employees;
        }

        public List<Employee> AllEmployees()
        {
            List<Employee> employees = db.Employees.ToList<Employee>();
            return employees;
        }

        public void AddEmployee(Employee employee)
        {
            db.Add(employee);
            db.SaveChanges();
        }

        public void DeleteEmployee(int Id)
        {
            Employee employee = db.Employees.SingleOrDefault(employee => employee.Id == Id);
            if (employee != null)
            {
                db.Remove(employee);
                db.SaveChanges();
            }
        }

        public void EmployeesInDept()
        {
            List<Department> dept = db.Departments.ToList<Department>();
            foreach (Department department in dept)
            {
                Console.WriteLine(department);
                List<Employee> employeesList = EmployeesInDept(department.DeptId);
                foreach (Employee employee in employeesList)
                {
                    Console.WriteLine(employee);
                }
            }
        }

        public List<Employee> EmployeesBySalary(double salary)
        {
            FormattableString sql = $"SELECT * FROM Employees WHERE Salary>{salary}";
            List<Employee> employees = db.Employees.FromSql(sql).ToList<Employee>();
            return employees;
        }

        public List<Employee> EmployeesByInitial(char initial)
        {
           string value = initial.ToString()+"%";
            FormattableString sql = $"SELECT * FROM Employees WHERE Name LIKE {value}";
            List<Employee> employees = db.Employees.FromSql(sql).ToList<Employee>();
            return employees;
        }
    }
}
