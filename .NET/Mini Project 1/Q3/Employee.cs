using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MiniProjectApp
{
    enum Gender { M, F, NB}

    internal class Employee
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public double Salary { get; set; }
        public Gender Gender { get; set; }
        public string Address { get; set; }

        public override string ToString()
        {
            return $"[ ID: {Id}\tName: {Name}\tSalary: {Salary}\tGender: {Gender}\tAddress: {Address} ]";
        }
    }
}
