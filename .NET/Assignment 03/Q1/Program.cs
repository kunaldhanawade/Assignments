using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Student s1 = new Student("omkar", 75, 75, 70);
            Console.WriteLine(s1.display());

            Student s2 = new Student("vedant", 80, 75, 60);
            Console.WriteLine(s2.display());
        }
    }
}
