/*Q2.Accept a float value and print square of that number
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
            Console.WriteLine("Enter a Foat value: ");
            string f = Console.ReadLine();

            float a = float.Parse(f);
            Console.WriteLine($"Square using Parse: {a * a}");

            float m = Convert.ToSingle(f);
            // float m = Convert.ToSingle(null);
            Console.WriteLine($"Square using Convert: {m * m}");

            float r;
            bool i = float.TryParse(f, out r);
            if (i)
                Console.WriteLine($"Square using TryParse: {r * r}");
            else
                Console.WriteLine("Invalid Data");
        }
    }
}
