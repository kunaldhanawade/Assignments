using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.Extensions.Configuration;

namespace MyConsoleApp
{
    public class CustomerLayer
    {
        string connectionString;
        public CustomerLayer(IConfiguration iconfig)
        {
            connectionString = iconfig.GetConnectionString("Default");
        }

        public void AddCustomers(string name, string address, long mobno)
        {
            using (SqlConnection con = new SqlConnection(connectionString))
            {
                try
                {
                    SqlCommand cmd = new SqlCommand($"Insert into Customer values ('{name}', '{address}', {mobno})", con);
                    con.Open();

                    int rowsAffected = cmd.ExecuteNonQuery();

                    if (rowsAffected != 0)
                    {
                        Console.WriteLine("Data Inserted Successfully... "+rowsAffected+" Row Affected");
                    }
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex.Message);
                }
            }
        }

        public void UpdateCustomer(int id, string name)
        {
            using (SqlConnection con = new SqlConnection(connectionString))
            {
                try
                {
                    SqlCommand cmd = new SqlCommand($"Update Customer Set Name='{name}' Where Id={id}", con);
                    con.Open();

                    int rowsAffected = cmd.ExecuteNonQuery();

                    if (rowsAffected != 0)
                    {
                        Console.WriteLine("Data Updated Successfully... "+rowsAffected+" Row Affected");
                    }
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex.Message);
                }
            }
        }



        public void DeleteCustomer(int id)
        {
            using (SqlConnection con = new SqlConnection(connectionString))
            {
                try
                {
                    SqlCommand cmd = new SqlCommand($"Delete From Customer Where Id={id}", con);
                    con.Open();

                    int rowsAffected = cmd.ExecuteNonQuery();

                    if (rowsAffected != 0)
                    {
                        Console.WriteLine("Data Deleted Successfully... "+rowsAffected +" Row Affected");
                    }
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex.Message);
                }
            }
        }

        public void ShowCustomers()
        {
            using (SqlConnection con = new SqlConnection(connectionString))
            {
                try
                {
                    SqlCommand cmd = new SqlCommand("Select * from Customer", con);

                    con.Open();

                    SqlDataReader data = cmd.ExecuteReader();

                    if (data.HasRows)
                    {
                        while (data.Read())
                        {
                            Console.WriteLine($"{data["id"]}\t{data["Name"]}\t{data["Address"]}\t{data["MobileNumber"]}");
                        }
                    }
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex.Message);
                }
            }
        }
    }
}