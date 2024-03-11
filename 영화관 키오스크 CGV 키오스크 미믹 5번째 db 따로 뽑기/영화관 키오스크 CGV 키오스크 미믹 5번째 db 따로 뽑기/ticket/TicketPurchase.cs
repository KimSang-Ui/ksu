using System;
using System.Collections.Generic;
using System.Windows.Forms;
using 영화관_키오스크_CGV_키오스크_미믹_5번째_db_따로_뽑기.database;
using 영화관_키오스크_CGV_키오스크_미믹_5번째_db_따로_뽑기.screen;

namespace 영화관_키오스크_CGV_키오스크_미믹_5번째_db_따로_뽑기.ticket
{
    public partial class TicketPurchase : Form
    {
        TicketDB ticketDB = new TicketDB();
        public TicketPurchase()
        {
            InitializeComponent();
            현재시간.Enabled = true;
            MovieDetail1();
            MovieDetail2();
            MovieDetail3(); 
            MovieDetail4();
            MovieDetail5();

            
        }

        private void 뒤로_Click(object sender, EventArgs e)
        {
            MessageBox.Show(" 뒤로가기 \n 메인화면으로 이동합니다. ");
            Hide();
            MainScreen mainScreen = new MainScreen();
            mainScreen.ShowDialog();
        }

        private void 홈_Click(object sender, EventArgs e)
        {
            MessageBox.Show(" 홈화면으로 이동합니다. ");
            Hide(); 
            HomeScreen homeScreen = new HomeScreen();
            homeScreen.ShowDialog();
        }

        private void 현재시간_Tick(object sender, EventArgs e)
        {
            현재시간_label.Text = DateTime.Now.ToString("yyyy.HH.dd \n tt hh:mm");
        }
       
        public void MovieDetail1()
        {
            List<string> Md = new List<string>();
            Md = ticketDB.MovieDetail1();
            for (int i = 0; i < Md.Count; i++)
            {
               label2.Text = Md[i];
            }

        }
        public void MovieDetail2()
        {
            List<string> Md = new List<string>();
            Md = ticketDB.MovieDetail2();
            for (int i = 0; i < Md.Count; i++)
            {
                label3.Text = Md[i];
            }

        }
        public void MovieDetail3()
        {
            List<string> Md = new List<string>();
            Md = ticketDB.MovieDetail3();
            for (int i = 0; i < Md.Count; i++)
            {
                label4.Text = Md[i];
            }

        }
        public void MovieDetail4()
        {
            List<string> Md = new List<string>();
            Md = ticketDB.MovieDetail4();
            for (int i = 0; i < Md.Count; i++)
            {
                label5.Text = Md[i];
            }

        }
        public void MovieDetail5()
        {
            List<string> Md = new List<string>();
            Md = ticketDB.MovieDetail5();
            for (int i = 0; i < Md.Count; i++)
            {
                label6.Text = Md[i];
            }

        }

        private void Movie1새벽의저주_Click(object sender, EventArgs e)
        {
            MessageBox.Show("청소년 관람불가 영화입니다. +\n+ 19세 이하 관람객들은 성인을 동반하여 영화관에 입장하여 주십시오");
            Hide();

        }
    }
}
