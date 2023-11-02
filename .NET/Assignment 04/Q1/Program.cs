namespace MyConsoleApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num = 0;
            Console.WriteLine("Enter No. of Rows: ");
            int nrows;
            int.TryParse(Console.ReadLine(), out nrows);

            int[][] myarr = new int[nrows][];

            for (int i = 0; i < nrows; i++)
            {
                Console.WriteLine("Enter No. of Columns for row " + (i+1));
                int ncols;
                int.TryParse(Console.ReadLine(), out ncols);

                myarr[i] = new int[ncols];
                for (int j = 0; j < ncols; j++)
                {
                    myarr[i][j] = num++;
                }
            }

            foreach (var item in myarr)
            {
                foreach (var element in item)
                {
                    Console.Write(element+"\t");
                }
                Console.WriteLine();
            }
        }
    }
}
