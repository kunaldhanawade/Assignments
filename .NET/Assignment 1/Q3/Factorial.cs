using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassLibrary1
{
    public class Factorial
    {
        public int fact(int num)
        {
            int fact = 1;
            for (int i = 1 ; i <= num; i++)
            {
                fact *= i;
            }
            return fact;
        }
    }
}
