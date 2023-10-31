using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    struct Student
    {
        public int rollNo;
        public string name;

        /*public Student()
        {
            rollNo = 0;
            name = string.Empty;
        }

        public Student(int rollNo)
        {
            this.rollNo = rollNo;
        }*/

        public Student(int rollNo, string name)
        {
            this.rollNo = rollNo;  
            this.name = name;
        }

        public void Disp()
        {
            Console.WriteLine(rollNo+ " " + name);
        }

        public static void hello()
        {
            Console.WriteLine("hello there mate");
        }
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            Student student;
            student = new Student();
            student.Disp();

            Student student2 = new Student(69, "Rohit Pagar");
            student2.Disp();

            student = student2;
            student.Disp();

            student.rollNo = 53;
            student.name = "Omkar";
            student.Disp();

            Student.hello();
        }
    }
}
