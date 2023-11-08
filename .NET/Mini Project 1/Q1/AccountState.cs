using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Serialization;

namespace AccountDemo
{
    public class AccountState
    {
        public string Name { get; set; }
        public int Id { get; set; }
        public double Balance { get; set; }
        public double Amount { get; set; }
        public string Transaction { get; set; }
    }
}
