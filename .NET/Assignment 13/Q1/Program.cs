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

        static void CustomerDisplay()
        {
            StronglyTyped st = new StronglyTyped(_iconfig);

            Customer customer = new Customer()
            {
                Name = "Harsh",
                Address = "Goregaon",
                MobileNumber = "7357729257"
            };
            int a = st.Add(customer);
            Console.WriteLine(a+" Record Inserted");

            List<Customer> myFirstList = st.Search();
            foreach (var item in myFirstList)
                Console.WriteLine($"{item.Id}\t{item.Name}\t{item.Address}\t{item.MobileNumber}");

            Console.WriteLine("------------------------------------------------------------");

            List<Customer> mySecondList = st.Search(1);
            foreach (var item in mySecondList)
                Console.WriteLine($"{item.Id}\t{item.Name}\t{item.Address}\t{item.MobileNumber}");

            Console.WriteLine("------------------------------------------------------------");

            List<Customer> myThirdList = st.Search("Akshay", "8657013747");
            foreach (var item in myThirdList)
                Console.WriteLine($"{item.Id}\t{item.Name}\t{item.Address}\t{item.MobileNumber}");

            Console.WriteLine("------------------------------------------------------------");

            int d = st.Delete(1003);
            Console.WriteLine(d + " Record Deleted");

            Console.WriteLine("------------------------------------------------------------");

            int u = st.Update(2, "Omkar");
            Console.WriteLine(u + " Record Updated");
        }

        static void Main()
        {
            GetAppsettingsFile();
            CustomerDisplay();
        }
    }
}
