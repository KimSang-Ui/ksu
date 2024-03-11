using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace 영화관_키오스크_CGV_키오스크_미믹_5번째_db_따로_뽑기.screen
{
    public partial class HomeScreen : Form
    {
        public HomeScreen()
        {
            InitializeComponent();
        }

        private void 메인화면으로_Click(object sender, EventArgs e)
        {
            MessageBox.Show("메인화면으로 이동합니다");
            Hide();
            MainScreen mainScreen = new MainScreen();
            mainScreen.ShowDialog();
        }
    }
}
