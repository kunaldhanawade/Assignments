using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using DAC;
using DBDA;

namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            DAC.Student student1 = new DAC.Student();
            DBDA.Student student2 = new DBDA.Student();

            student1.add("Kunal Dhanawade");
            student2.add("Mahesh Katale");
            Console.ReadLine();
        }
    }
}
