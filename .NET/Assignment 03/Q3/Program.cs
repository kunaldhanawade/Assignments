
namespace MyConsoleApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee e1 = new Employee("Vedant Dhadange", 100);
            e1.display();

            Employee e2 = new Employee("Omkar Sakpal", 200);
            e2.display();

            Employee e3 = new Employee("Harsh Yadav", 300);
            e3.display();
        }
    }
}
