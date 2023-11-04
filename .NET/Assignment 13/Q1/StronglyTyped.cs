using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.Extensions.Configuration;

namespace MyConsoleApp
{
    internal class StronglyTyped
    {
        string connectionString;
        public StronglyTyped(IConfiguration iconfig)
        {
            connectionString = iconfig.GetConnectionString("Default");
        }

        public SqlConnection GetConnection()
        {
            return new SqlConnection(connectionString);
        }

        public int Add(Customer c)
        {
            SqlConnection conn;
            SqlCommand cmd;
            int record = 0;

            using (conn = GetConnection())
            {
                try
                {
                    cmd = new SqlCommand("addCustomer", conn);
                    cmd.CommandType = CommandType.StoredProcedure;

                    cmd.Parameters.Add("@cname", SqlDbType.NVarChar).Value = c.Name;
                    cmd.Parameters.Add("@caddress", SqlDbType.NVarChar).Value = c.Address;
                    cmd.Parameters.Add("@cmobno", SqlDbType.NChar).Value = c.MobileNumber;

                    conn.Open();
                    record = cmd.ExecuteNonQuery();
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex);
                }
            }
            return record;
        }

        public List<Customer> Search()
        {
            SqlConnection conn;
            SqlCommand cmd;
            List<Customer> list = new List<Customer>();

            using (conn = GetConnection())
            {
                try
                {
                    cmd = new SqlCommand("getAllCustomers", conn);
                    cmd.CommandType = CommandType.StoredProcedure;

                    conn.Open();
                    SqlDataReader data = cmd.ExecuteReader();

                    while (data.Read())
                    {
                        list.Add(new Customer()
                        {
                            Id = Convert.ToInt32(data["Id"]),
                            Name = data["Name"].ToString(),
                            Address = data["Address"].ToString(),
                            MobileNumber = data["MobileNumber"].ToString()
                        });
                    }
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex);
                }
            }
            return list;
        }

        public List<Customer> Search(int id)
        {
            SqlConnection conn;
            SqlCommand cmd;
            List<Customer> list = new List<Customer>();

            using (conn = GetConnection())
            {
                try
                {
                    cmd = new SqlCommand("SELECT * FROM Customer WHERE Id=@pId", conn);
                    cmd.Parameters.AddWithValue("@pid", id);

                    conn.Open();
                    SqlDataReader data = cmd.ExecuteReader();

                    while (data.Read())
                    {
                        list.Add(new Customer()
                        {
                            Id = Convert.ToInt32(data["Id"]),
                            Name = data["Name"].ToString(),
                            Address = data["Address"].ToString(),
                            MobileNumber = data["MobileNumber"].ToString()
                        });
                    }
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex);
                }
            }
            return list;
        }

        public List<Customer> Search(string name, string mobileNo)
        {
            SqlConnection conn;
            SqlCommand cmd;
            List<Customer> list = new List<Customer>();

            using (conn = GetConnection())
            {
                try
                {
                    cmd = new SqlCommand("SELECT * FROM Customer WHERE Name=@cName AND MobileNumber=@cMobileNo", conn);
                    cmd.Parameters.AddWithValue("@cName", name);
                    cmd.Parameters.AddWithValue("@cMobileNo", mobileNo);

                    conn.Open();
                    SqlDataReader data = cmd.ExecuteReader();

                    while (data.Read())
                    {
                        list.Add(new Customer()
                        {
                            Id = Convert.ToInt32(data["Id"]),
                            Name = data["Name"].ToString(),
                            Address = data["Address"].ToString(),
                            MobileNumber = data["MobileNumber"].ToString()
                        });
                    }
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex);
                }
            }
            return list;
        }

        public int Delete(int id)
        {
            SqlConnection conn;
            SqlCommand cmd;
            int record = 0;

            using (conn = GetConnection())
            {
                try
                {
                    cmd = new SqlCommand("deleteCustomer", conn);
                    cmd.CommandType = CommandType.StoredProcedure;

                    cmd.Parameters.Add("@cid", SqlDbType.Int).Value = id;

                    conn.Open();
                    record = cmd.ExecuteNonQuery();
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex);
                }
            }
            return record;
        }

        public int Update(int id, string name)
        {
            SqlConnection conn;
            SqlCommand cmd;
            int record = 0;

            using (conn = GetConnection())
            {
                try
                {
                    cmd = new SqlCommand("UPDATE Customer SET Name=@cname WHERE id=@cid", conn);
                    cmd.Parameters.AddWithValue("@cname", name);
                    cmd.Parameters.AddWithValue("@cid", id);

                    conn.Open();
                    record = cmd.ExecuteNonQuery();
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex);
                }
            }
            return record;
        }
    }
}
