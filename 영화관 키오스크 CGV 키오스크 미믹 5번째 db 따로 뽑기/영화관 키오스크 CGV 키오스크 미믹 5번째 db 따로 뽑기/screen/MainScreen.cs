using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using 영화관_키오스크_CGV_키오스크_미믹_5번째_db_따로_뽑기.ticket;

namespace 영화관_키오스크_CGV_키오스크_미믹_5번째_db_따로_뽑기
{
    public partial class MainScreen : Form
    {
        public MainScreen()
        {
            InitializeComponent();
        }

        private void 티켓구매_Click(object sender, EventArgs e)
        {
            MessageBox.Show(" 영화관 이용안내 \n * 상영관 내 외부음식 반입금지 \n * 일행 당 이용 가능 최대 인원: 10인(전국) \n\n * 안전한 영화관람을 위해 관람 중 상시 마스크 착용을 권장합니다.");
            Hide();
            TicketPurchase ticketPurchase = new TicketPurchase();
            ticketPurchase.ShowDialog();
        }
    }
}
