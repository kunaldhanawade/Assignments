using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.Extensions.Configuration;

namespace MyConsoleApp
{
    public class EmployeeLayer
    {
        string connectionString;

        public EmployeeLayer(IConfiguration iconfig)
        {
            connectionString = iconfig.GetConnectionString("Default");
        }

        public void Employees()
        {
            using(SqlConnection con = new SqlConnection(connectionString))
            {
                SqlCommand cmd = new SqlCommand("Select * From Employee_Data", con);
                con.Open();
                Console.WriteLine("connected");
                SqlDataReader data = cmd.ExecuteReader();

                if(data.HasRows)
                {
                    while(data.Read())
                    {
                        Console.WriteLine($"{data["id"]} \t {data["Name"]} \t {data["Salary"]}");
                    }
                }
            }
        }
    }
}
