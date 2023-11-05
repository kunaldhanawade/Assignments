using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.Extensions.Configuration;
using Microsoft.SqlServer.Server;

namespace MiniProjectApp
{
    internal class DataLayer
    {
        string connectionSring;
        public DataLayer(IConfiguration iconfig)
        {
            connectionSring = iconfig.GetConnectionString("Default");
        }

        SqlConnection GetSqlConnection()
        {
            return new SqlConnection(connectionSring);
        }
        public void Add(Employee e)
        {
            using (SqlConnection conn = GetSqlConnection())
            {
                try
                {
                    SqlCommand cmd = new SqlCommand();
                    cmd.CommandText = "INSERT INTO EMPLOYEE (Name, Salary, Gender, Address) values (@eName, @eSalary, @eGender, @eAddress)";
                    cmd.Parameters.Add("@eName", System.Data.SqlDbType.NVarChar).Value = e.Name;
                    cmd.Parameters.Add("@eSalary", System.Data.SqlDbType.Float).Value = e.Salary;
                    cmd.Parameters.Add("@eGender", System.Data.SqlDbType.Char).Value = e.Gender;
                    cmd.Parameters.Add("@eAddress", System.Data.SqlDbType.NVarChar).Value = e.Address;
                    cmd.Connection = conn;

                    conn.Open();
                    int record = cmd.ExecuteNonQuery();
                    Console.WriteLine("Inserted " + record);
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex);
                }
            }
        }
        public void Delete(int Id)
        {
            using (SqlConnection conn = GetSqlConnection())
            {
                try
                {
                    SqlCommand cmd = new SqlCommand();
                    cmd.CommandText = "DELETE FROM EMPLOYEE WHERE Id=@eId";
                    cmd.Parameters.Add("@eId", System.Data.SqlDbType.NVarChar).Value = Id;
                    cmd.Connection = conn;

                    conn.Open();
                    int record = cmd.ExecuteNonQuery();
                    Console.WriteLine("Deleted " + record);
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex);
                }
            }
        }
        public void Update(Employee e, int Id)
        {
            using (SqlConnection conn = GetSqlConnection())
            {
                try
                {
                    SqlCommand cmd = new SqlCommand();
                    cmd.CommandText = "UPDATE EMPLOYEE SET Name=@eName, Salary=@eSalary, Gender=@eGender, Address=@eAddress WHERE Id=@eId";
                    cmd.Parameters.Add("@eId", System.Data.SqlDbType.NVarChar).Value = Id;
                    cmd.Parameters.Add("@eName", System.Data.SqlDbType.NVarChar).Value = e.Name;
                    cmd.Parameters.Add("@eSalary", System.Data.SqlDbType.Float).Value = e.Salary;
                    cmd.Parameters.Add("@eGender", System.Data.SqlDbType.Char).Value = e.Gender;
                    cmd.Parameters.Add("@eAddress", System.Data.SqlDbType.NVarChar).Value = e.Address;
                    cmd.Connection = conn;

                    conn.Open();
                    int record = cmd.ExecuteNonQuery();
                    Console.WriteLine("Updated " + record);
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex);
                }
            }
        }
        public Employee Get(int id)
        {
            Employee e = null;
            using (SqlConnection conn = GetSqlConnection())
            {
                try
                {
                    SqlCommand cmd = new SqlCommand();
                    cmd.CommandText = "SELECT * FROM EMPLOYEE WHERE Id=@eId";
                    cmd.Parameters.Add("@eId", System.Data.SqlDbType.NVarChar).Value = id;
                    cmd.Connection = conn;

                    conn.Open();
                    SqlDataReader data = cmd.ExecuteReader();
                    if (data.HasRows)
                    {
                        while (data.Read())
                            e = new Employee
                            {
                                Id = Convert.ToInt32(data["Id"]),
                                Name = data["Name"].ToString(),
                                Salary = Convert.ToDouble(data["Salary"]),
                                Gender = data["Gender"].ToString()[0],
                                Address = data["Address"].ToString()
                            };
                    }
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex);
                }
            }
            return e;
        }
        public List<Employee> GetAll()
        {
            List<Employee> list = new List<Employee>();
            using (SqlConnection conn = GetSqlConnection())
            {
                try
                {
                    SqlCommand cmd = new SqlCommand();
                    cmd.CommandText = "SELECT * FROM EMPLOYEE";
                    cmd.Connection = conn;

                    conn.Open();
                    SqlDataReader data = cmd.ExecuteReader();
                    if (data.HasRows)
                    {
                        while (data.Read())
                            list.Add(new Employee
                            {
                                Id = Convert.ToInt32(data["Id"]),
                                Name = data["Name"].ToString(),
                                Salary = Convert.ToDouble(data["Salary"]),
                                Gender = data["Gender"].ToString()[0],
                                Address = data["Address"].ToString()
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
    }
}
