
namespace MyConsoleApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Student s1 = new Student("omkar", 75, 75, 70);
            Student.Give_marks(s1);
            Console.WriteLine(s1.display());

            Student s2 = new Student("vedant", 80, 75, 60);
            Student.Give_marks(s2);
            Console.WriteLine(s2.display());
        }
    }
}
