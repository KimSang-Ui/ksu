
using Oracle.ManagedDataAccess.Client;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace 영화관_키오스크_CGV_키오스크_미믹_5번째_db_따로_뽑기.database
{
    public class TicketDB
    {
        string str = "data source = localhost; user id = hr; password = 1234";

        public List<string> MovieDetail1()
        {
            List<string>md = new List<string>();
            OracleConnection oracleConnection = new OracleConnection(str);
            oracleConnection.Open();
            string sql = "select 영화번호, 영화명, 상영등급,관람평점, 예매율 from 영화 where 영화번호 = 1";
            OracleCommand oracleCommand = new OracleCommand(sql, oracleConnection);
            OracleDataReader oracleDataReader = oracleCommand.ExecuteReader();
            while (oracleDataReader.Read())
            {
                md.Add(oracleDataReader.GetString(0) +"\n"+ oracleDataReader.GetString(1) +"\n"+ oracleDataReader.GetString(2) +"\n"+ oracleDataReader.GetString(3) +"\n" +oracleDataReader.GetString(4));
            }
            oracleConnection.Close();
            return md;
        }
        public List<string> MovieDetail2()
        {
            List<string> md = new List<string>();
            OracleConnection oracleConnection = new OracleConnection(str);
            oracleConnection.Open();
            string sql = "select 영화번호, 영화명, 상영등급,관람평점, 예매율 from 영화 where 영화번호 = 2";
            OracleCommand oracleCommand = new OracleCommand(sql, oracleConnection);
            OracleDataReader oracleDataReader = oracleCommand.ExecuteReader();
            while (oracleDataReader.Read())
            {
                md.Add(oracleDataReader.GetString(0) + "\n" + oracleDataReader.GetString(1) + "\n" + oracleDataReader.GetString(2) + "\n" + oracleDataReader.GetString(3) + "\n" + oracleDataReader.GetString(4));
            }
            oracleConnection.Close();
            return md;
        }
        public List<string> MovieDetail3()
        {
            List<string> md = new List<string>();
            OracleConnection oracleConnection = new OracleConnection(str);
            oracleConnection.Open();
            string sql = "select 영화번호, 영화명, 상영등급,관람평점, 예매율 from 영화 where 영화번호 = 3";
            OracleCommand oracleCommand = new OracleCommand(sql, oracleConnection);
            OracleDataReader oracleDataReader = oracleCommand.ExecuteReader();
            while (oracleDataReader.Read())
            {
                md.Add(oracleDataReader.GetString(0) + "\n" + oracleDataReader.GetString(1) + "\n" + oracleDataReader.GetString(2) + "\n" + oracleDataReader.GetString(3) + "\n" + oracleDataReader.GetString(4));
            }
            oracleConnection.Close();
            return md;
        }
        public List<string> MovieDetail4()
        {
            List<string> md = new List<string>();
            OracleConnection oracleConnection = new OracleConnection(str);
            oracleConnection.Open();
            string sql = "select 영화번호, 영화명, 상영등급,관람평점, 예매율 from 영화 where 영화번호 = 4";
            OracleCommand oracleCommand = new OracleCommand(sql, oracleConnection);
            OracleDataReader oracleDataReader = oracleCommand.ExecuteReader();
            while (oracleDataReader.Read())
            {
                md.Add(oracleDataReader.GetString(0) + "\n" + oracleDataReader.GetString(1) + "\n" + oracleDataReader.GetString(2) + "\n" + oracleDataReader.GetString(3) + "\n" + oracleDataReader.GetString(4));
            }
            oracleConnection.Close();
            return md;
        }
        public List<string> MovieDetail5()
        {
            List<string> md = new List<string>();
            OracleConnection oracleConnection = new OracleConnection(str);
            oracleConnection.Open();
            string sql = "select 영화번호, 영화명, 상영등급,관람평점, 예매율 from 영화 where 영화번호 = 5";
            OracleCommand oracleCommand = new OracleCommand(sql, oracleConnection);
            OracleDataReader oracleDataReader = oracleCommand.ExecuteReader();
            while (oracleDataReader.Read())
            {
                md.Add(oracleDataReader.GetString(0) + "\n" + oracleDataReader.GetString(1) + "\n" + oracleDataReader.GetString(2) + "\n" + oracleDataReader.GetString(3) + "\n" + oracleDataReader.GetString(4));
            }
            oracleConnection.Close();
            return md;
        }

    }
}
    

