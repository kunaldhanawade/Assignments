using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MiniProjectApp
{
    internal class Employee
    {
        [Key]
        public int Id { get; set; }
        public string? Name { get; set; }
        public double? Salary { get; set; }

        [ForeignKey("Department")]
        public int? DeptId { get; set; }

        public override string ToString()
        {
            return $"[ ID: {Id}\tName: {Name}\tSalary: {Salary}\tDepartment Id: {DeptId} ]";
        }
    }
}
