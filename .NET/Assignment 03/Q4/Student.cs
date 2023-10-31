using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    internal class Student
    {
        private string name;
        private int maths;
        private int science;
        private int english;
        private int total;

        static Student()
        {
            Console.WriteLine("Holy Cross High School");
        }

        public Student(string name, int maths, int science, int english)
        {
            this.name = name;
            if (maths <= 100 && science <= 100 && english <= 100)
            {
                this.maths = maths;
                this.science = science;
                this.english = english;
            }
            else
            {
                throw new Exception("Invalid Marks");
            }
        }

        public int get_Total()
        {
            if(total== 0)
                total = maths + science + english;
            return total;
        }

        public string display()
        {
            return $"Name: {name}\tTotal Marks: {get_Total()}";
        }
    }
}
