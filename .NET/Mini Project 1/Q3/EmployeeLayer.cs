using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.Extensions.Configuration;
using Microsoft.SqlServer.Server;

namespace MiniProjectApp
{
    internal class EmployeeLayer : IEmployeeRepository
    {
        public static List<Employee> eList;
        public EmployeeLayer()
        {
            eList = new List<Employee>()
            {
                new Employee { Id=1, Name="Rahul", Salary=50000, Gender=Gender.M, Address="Bhandup"},
                new Employee { Id=2, Name="Sanjay", Salary=55000, Gender=Gender.M, Address="Shahad"},
                new Employee { Id=3, Name="Bhehul", Salary=60000, Gender=Gender.M, Address="Dombivli"},
                new Employee { Id=4, Name="Vikrant", Salary=60000, Gender=Gender.M, Address="Kalyan"},
            };
        }

        public Employee Add(Employee employee)
        {
            employee.Id = eList.Max(e => e.Id) + 1;
            eList.Add(employee);
            return employee;
        }

        public Employee Delete(int Id)
        {
            Employee e = eList.FirstOrDefault(e => e.Id == Id);
            eList?.Remove(e);
            return e;
        }

        public IEnumerable<Employee> GetAllEmployee()
        {
            return eList;
        }

        public Employee Update(int Id, Employee employeeChanges)
        {
            Employee e = eList.FirstOrDefault(e => e.Id == Id);
            if (e.Id == employeeChanges.Id)
            {
                e.Name = employeeChanges.Name;
                e.Salary = employeeChanges.Salary;
                e.Gender = employeeChanges.Gender;
                e.Address = employeeChanges.Address;
            }
            return e;
        }

        public Employee GetEmployee(int Id)
        {
            return eList.FirstOrDefault(e => e.Id == Id);
        }
    }
}
