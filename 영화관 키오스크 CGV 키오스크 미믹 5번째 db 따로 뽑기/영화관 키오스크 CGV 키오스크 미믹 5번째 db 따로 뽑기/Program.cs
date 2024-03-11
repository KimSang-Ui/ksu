using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;
using 영화관_키오스크_CGV_키오스크_미믹_5번째_db_따로_뽑기.screen;

namespace 영화관_키오스크_CGV_키오스크_미믹_5번째_db_따로_뽑기
{
    internal static class Program
    {
        /// <summary>
        /// 해당 애플리케이션의 주 진입점입니다.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new HomeScreen());
        }
    }
}
