namespace 영화관_키오스크_CGV_키오스크_미믹_5번째_db_따로_뽑기.screen
{
    partial class HomeScreen
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.메인화면으로 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // 메인화면으로
            // 
            this.메인화면으로.Font = new System.Drawing.Font("배달의민족 주아", 19.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.메인화면으로.Location = new System.Drawing.Point(256, 141);
            this.메인화면으로.Name = "메인화면으로";
            this.메인화면으로.Size = new System.Drawing.Size(300, 150);
            this.메인화면으로.TabIndex = 0;
            this.메인화면으로.Text = "메인화면으로";
            this.메인화면으로.UseVisualStyleBackColor = true;
            this.메인화면으로.Click += new System.EventHandler(this.메인화면으로_Click);
            // 
            // HomeScreen
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.메인화면으로);
            this.Name = "HomeScreen";
            this.Text = "HomeScreen";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button 메인화면으로;
    }
}