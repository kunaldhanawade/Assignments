/*Q1.Accept two numbers from user and do the sum of it
Solve above code using Parse(), ToSingle() and TryPrase() method.
Also observe exception if you do not enter valid data*/

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
            Console.WriteLine("Enter Number x: ");
            string x = Console.ReadLine();
            Console.WriteLine("Enter Number y: ");
            string y = Console.ReadLine();

            int a = int.Parse(x);
            int b = int.Parse(y);
            Console.WriteLine($"Sum using Parse: {a + b}");

            int m = Convert.ToInt32(x);
            int n = Convert.ToInt32(y);
            Console.WriteLine($"Sum using Convert: {m + n}");

            int r, s;
            bool i = int.TryParse(x, out r);
            bool j = int.TryParse(y, out s);
            if (i && j)
                Console.WriteLine($"Sum using TryParse: {r + s}");
            else
                Console.WriteLine("Invalid Data");
        }
    }
}
