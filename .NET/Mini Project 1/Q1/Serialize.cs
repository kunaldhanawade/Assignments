using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Serialization;

namespace AccountDemo
{
    public static class Serialize
    {
        public static void SaveAsXmlFormat(object objGraph, string fileName)
        {
            XmlSerializer xmlFormat = new XmlSerializer(typeof(AccountState));

            using (Stream fStream = new FileStream(fileName, FileMode.Append, FileAccess.Write))
            {
                xmlFormat.Serialize(fStream, objGraph);
            }
        }

        /*static void LoadFromFile(string fn)
        {
            XmlSerializer xmlFormat = new XmlSerializer(typeof(AccountState));
            using (Stream fStream = new FileStream(fn, FileMode.Open, FileAccess.Read))
            {
                fStream.Position = 0;
                AccountState obj = (AccountState)xmlFormat.Deserialize(fStream);
            }
        }*/
    }
}
