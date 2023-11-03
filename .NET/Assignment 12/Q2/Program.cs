using Microsoft.Extensions.Configuration;

namespace MyConsoleApp
{
    internal class Program
    {
        static IConfiguration _iconfig;
        static void GetAppsettingsFile()
        {
            var builder = new ConfigurationBuilder()
                .SetBasePath(Directory.GetCurrentDirectory())
                .AddJsonFile("Appsettings.json", optional: false, reloadOnChange: true);
            _iconfig = builder.Build();
        }

        static void InsertCustomer(string name, string address, long mobno)
        {
            string values = $"('{name}', '{address}', {mobno})";
            CustomerLayer customer = new CustomerLayer(_iconfig);
            customer.AddCustomers(name, address, mobno);
        }

        static void ChangeNameUsingID(int id, string name)
        {
            CustomerLayer customer = new CustomerLayer(_iconfig);
            customer.UpdateCustomer(id, name);
        }

        static void DeleteCustomer(int id)
        {
            CustomerLayer customer = new CustomerLayer(_iconfig);
            customer.DeleteCustomer(id);
        }

        static void PrintCustomer()
        {
            CustomerLayer customer = new CustomerLayer(_iconfig);
            customer.ShowCustomers();
        }
        static void Main(string[] args)
        {
            GetAppsettingsFile();
            InsertCustomer("Harsh", "Goregaon", 9576570188);
            InsertCustomer("Omkar", "Lalbaug", 9565701245);
            InsertCustomer("Vedant", "Amravati", 7012345765);
            InsertCustomer("Akshay", "Cotton", 8657013747);
            PrintCustomer();
            ChangeNameUsingID(1, "Kunal");
            PrintCustomer();
            DeleteCustomer(3);
            PrintCustomer();
        }
    }
}
