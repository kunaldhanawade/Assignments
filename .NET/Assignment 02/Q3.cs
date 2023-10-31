/*Create a class calculator and write 3 instance method square, cube, round[if in put 22.5 o/p 22]
Which will return square .cube and rounded number.
Create object and call method and print the result.*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    class Calculator
    {
        public double square(double x)
        {
            return x * x;
        }

        public double cube(double x)
        {
            return x * x * x;
        }

        public int round(double x)
        {
            return (int)x;
        }
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter a Double value: ");
            string d = Console.ReadLine();

            Calculator calculator = new Calculator();

            double a = double.Parse(d);
            Console.WriteLine($"Square: {calculator.square(a)}");

            double m = Convert.ToDouble(d);
            // double m = Convert.ToDouble(null);
            Console.WriteLine($"Cube: {calculator.cube(m)}");

            double r;
            bool i = double.TryParse(d, out r);
            if (i)
                Console.WriteLine($"Round: {calculator.round(r)}");
            else
                Console.WriteLine("Invalid Data");
        }
    }
}
