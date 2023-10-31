
namespace MyConsoleApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee e1 = new Employee("Raj", 50000, Department.Marketing);
            e1.paytax(17);
            e1.display();
        }
    }
}
