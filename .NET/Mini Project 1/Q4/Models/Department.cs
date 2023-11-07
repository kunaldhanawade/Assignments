using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MiniProjectApp.Models
{
    internal class Department
    {
        [Key]
        public int DeptId { get; set; }
        public string? DeptName { get; set; }

        public override string ToString()
        {
            return $"Department Name: {DeptName}";
        }
    }
}
