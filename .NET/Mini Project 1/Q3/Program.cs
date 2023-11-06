using Microsoft.Extensions.Configuration;

namespace MiniProjectApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            EmployeeLayer emp = new EmployeeLayer();

            Console.WriteLine("Added: " + emp.Add(new Employee
            {
                Name = "Janhavi",
                Salary = 45000,
                Gender = Gender.F,
                Address = "Dombivli"
            }));

            Console.WriteLine("Got: " + emp.GetEmployee(7));

            Console.WriteLine("Updated: " + emp.Update(4, new Employee
            {
                Name = "Vedika",
                Salary = 55000,
                Gender = Gender.F,
                Address = "Dombivli"
            }));

            Console.WriteLine("Got: " + emp.GetEmployee(4));

            Console.WriteLine("Deleted: " + emp.Delete(5));

            var list = emp.GetAllEmployee();
            foreach (var item in list)
            {
                Console.WriteLine(item);
            }
        }
    }
}