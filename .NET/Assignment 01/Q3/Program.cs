using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            ClassLibrary1.Factorial factorial = new ClassLibrary1.Factorial();
            int fact = factorial.fact(7);
            Console.WriteLine("Factorial is "+fact);
            Console.ReadLine();
        }
    }
}
