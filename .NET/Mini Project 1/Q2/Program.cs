using Microsoft.Extensions.Configuration;

namespace MiniProjectApp
{
    internal class Program
    {
        static IConfiguration _iconfig;
        static DataLayer dl;
        static void Main(string[] args)
        {
            GetAppSettingsFile();
            WorkWithEmployee();
        }

        static void GetAppSettingsFile()
        {
            var builder = new ConfigurationBuilder()
                .SetBasePath(Directory.GetCurrentDirectory())
                .AddJsonFile("Appsettings.json", optional: false, reloadOnChange: true);
            _iconfig = builder.Build();
        }

        static void WorkWithEmployee()
        {
            dl = new DataLayer(_iconfig);

            AddEmployee("Kunal", 75000, 'M', "Prabhadevi");

            GetAllEmployees();

            //UpdateEmployee(8, "Phalesh", 30000, 'M', "Dombivli W");

            //Employee e = dl.Get(8);
            //Console.WriteLine($"ID: {e.Id} Name: {e.Name} Salary: {e.Salary} Gender: {e.Gender} Address: {e.Address}");

            dl.Delete(9);

            GetAllEmployees();
        }

        static void AddEmployee(string name, double salary, char gender, string address)
        {
            dl.Add(new Employee()
            {
                Name = name,
                Salary = salary,
                Gender = gender,
                Address = address
            });
        }

        static void GetAllEmployees()
        {
            List<Employee> employeeList = dl.GetAll();
            Console.WriteLine("ID\tName\tSalary\tGender\tAddress");
            foreach (Employee emp in employeeList)
            {
                Console.WriteLine($"{emp.Id}\t{emp.Name}\t{emp.Salary}\t{emp.Gender}\t{emp.Address}");
            }
        }

        static void UpdateEmployee(int id, string name, double salary, char gender, string address)
        {
            Employee temp = new Employee()
            {
                Name = name,
                Salary = salary,
                Gender = gender,
                Address = address
            };
            dl.Update(temp, id);
        }
    }
}