using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    class A
    {
        string fname;
        // var lname;

        /*public var disp(var age)
        {
            Console.WriteLine(age);
        }*/

        public string disp()
        {
            var s = "something";
            return s;
        }
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            bool b = new bool();
            Console.WriteLine(b);
            Console.WriteLine(b.GetHashCode());

            char c;
            // Console.WriteLine(c);
            c = 'k';
            Console.WriteLine(c);
            Console.WriteLine(c.ToString());

            int n = 0;
            Console.WriteLine(n.GetType());
            Console.WriteLine(n.GetType().BaseType);
            Console.WriteLine(n.GetType().BaseType.BaseType);

            A a= new A();
            Console.WriteLine(a.GetType());
            Console.WriteLine(a.GetType().BaseType);
            Console.WriteLine(a.GetHashCode());

            var name = "kunal";
            name = "dhanawade";
            // name = 7;
            name = null;

            //var height = null;

            // var age;
            // age = 21;
            var age = 21;
            var age2 = age;
            Console.WriteLine(age2.ToString());
            Console.WriteLine(age2.GetType());
            Console.WriteLine(age2.GetType().BaseType);
        }
    }
}
