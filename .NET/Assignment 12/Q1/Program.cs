using Microsoft.Extensions.Configuration;

namespace MyConsoleApp
{
    internal class Program
    {
        static IConfiguration _iconfig;
        static void GetAppsettingsFile()
        {
            var builder = new ConfigurationBuilder().SetBasePath(Directory.GetCurrentDirectory()).AddJsonFile("Appsettings.json", optional: false, reloadOnChange: true);
            _iconfig = builder.Build();
        }

        static void PrintEmployee()
        {
            EmployeeLayer emp = new EmployeeLayer(_iconfig);
            emp.Employees();
        }
        static void Main(string[] args)
        {
            GetAppsettingsFile();
            PrintEmployee();
        }
    }
}
