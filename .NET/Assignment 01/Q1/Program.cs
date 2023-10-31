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
            Calculator calculator = new Calculator();

            int sum = calculator.add(7, 24);
            int prod = calculator.product(7, 24);

            Console.WriteLine($"sum = {sum}");
            Console.WriteLine("product = {0}", prod);
            Console.ReadLine();
        }
    }
}
