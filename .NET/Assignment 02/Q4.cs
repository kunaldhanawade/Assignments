/*Create class student with private member variable 
Prn_no, 
Java, c#, Html (subjects),
Total,
Percentage

Write method public void get_total()
Write method public void get_percentage()
Write method public string display() which will display Prn_no total percentage
Create 2 object of a class and display record.*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    class Student
    {
        private int prnNo;
        private int Java;
        private int CSharp;
        private int HTML;
        private int total;
        private double percentage;

        public Student(int prnNo, int Java, int CSharp, int HTML)
        {
            this.prnNo = prnNo;
            if (Java <= 100 && CSharp <= 100 && HTML <= 100)
            {
                this.Java = Java;
                this.CSharp = CSharp;
                this.HTML = HTML;
                total = get_Total();
                percentage = get_percentage();
            }
            else
            {
                throw new Exception("Invalid Marks");
            }
        }

        private int get_Total()
        {
            if (total == 0)
                total = Java + CSharp + HTML;
            return total;
        }

        private double get_percentage()
        {
            if (percentage == 0)
                percentage = total * 100 / 300;
            return percentage;
        }

        public string display()
        {
            return $"PRN: {prnNo}\tTotal Marks: {total}\tPercentage: {percentage}";
        }
        internal class Program
        {
            static void Main(string[] args)
            {
                Student s1 = new Student(53, 75, 75, 70);
                Console.WriteLine(s1.display());

                Student s2 = new Student(99, 80, 75, 60);
                Console.WriteLine(s2.display());
            }
        }
    }
}
