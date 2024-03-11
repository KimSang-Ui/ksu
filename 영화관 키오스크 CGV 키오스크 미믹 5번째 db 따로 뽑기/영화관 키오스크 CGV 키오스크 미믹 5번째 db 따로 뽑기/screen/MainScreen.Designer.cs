namespace 영화관_키오스크_CGV_키오스크_미믹_5번째_db_따로_뽑기
{
    partial class MainScreen
    {
        /// <summary>
        /// 필수 디자이너 변수입니다.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 사용 중인 모든 리소스를 정리합니다.
        /// </summary>
        /// <param name="disposing">관리되는 리소스를 삭제해야 하면 true이고, 그렇지 않으면 false입니다.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form 디자이너에서 생성한 코드

        /// <summary>
        /// 디자이너 지원에 필요한 메서드입니다. 
        /// 이 메서드의 내용을 코드 편집기로 수정하지 마세요.
        /// </summary>
        private void InitializeComponent()
        {
            this.티켓구매 = new System.Windows.Forms.Button();
            this.스낵샵 = new System.Windows.Forms.Button();
            this.티켓출력 = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // 티켓구매
            // 
            this.티켓구매.Font = new System.Drawing.Font("배달의민족 주아", 19.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.티켓구매.Location = new System.Drawing.Point(79, 134);
            this.티켓구매.Name = "티켓구매";
            this.티켓구매.Size = new System.Drawing.Size(200, 100);
            this.티켓구매.TabIndex = 0;
            this.티켓구매.Text = "티켓구매";
            this.티켓구매.UseVisualStyleBackColor = true;
            this.티켓구매.Click += new System.EventHandler(this.티켓구매_Click);
            // 
            // 스낵샵
            // 
            this.스낵샵.Font = new System.Drawing.Font("배달의민족 주아", 19.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.스낵샵.Location = new System.Drawing.Point(551, 134);
            this.스낵샵.Name = "스낵샵";
            this.스낵샵.Size = new System.Drawing.Size(200, 100);
            this.스낵샵.TabIndex = 1;
            this.스낵샵.Text = "스낵샵";
            this.스낵샵.UseVisualStyleBackColor = true;
            // 
            // 티켓출력
            // 
            this.티켓출력.Font = new System.Drawing.Font("배달의민족 주아", 19.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.티켓출력.Location = new System.Drawing.Point(320, 298);
            this.티켓출력.Name = "티켓출력";
            this.티켓출력.Size = new System.Drawing.Size(200, 100);
            this.티켓출력.TabIndex = 0;
            this.티켓출력.Text = "티켓출력";
            this.티켓출력.UseVisualStyleBackColor = true;
            // 
            // button1
            // 
            this.button1.Font = new System.Drawing.Font("배달의민족 주아", 19.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.button1.Location = new System.Drawing.Point(604, 12);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(200, 100);
            this.button1.TabIndex = 2;
            this.button1.Text = "티켓취소";
            this.button1.UseVisualStyleBackColor = true;
            // 
            // MainScreen
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(832, 453);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.스낵샵);
            this.Controls.Add(this.티켓출력);
            this.Controls.Add(this.티켓구매);
            this.Name = "MainScreen";
            this.Text = "MainScreen";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button 티켓구매;
        private System.Windows.Forms.Button 스낵샵;
        private System.Windows.Forms.Button 티켓출력;
        private System.Windows.Forms.Button button1;
    }
}

