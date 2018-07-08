using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;
using System.Data;

public partial class Pat : System.Web.UI.Page
{
        SqlConnection con = new SqlConnection("database=db; server=.; uid=sa; pwd=1234");
    protected void Page_Load(object sender, EventArgs e)
    {
    
        lblname.Text = Convert.ToString(Session["uid"]);
        con.Open();
        SqlCommand com = new SqlCommand("select * from tbpat where email='" + lblname.Text + "'", con);
        SqlDataReader dr = com.ExecuteReader();
        DataTable dt = new DataTable();
        dt.Load(dr);
        if (dt.Rows.Count > 0)
        Session["uname"] = dt.Rows[0][0];
           
        if (Session["uname"] != null)
        {   
            lblname.Text = Convert.ToString(Session["uname"]);
            com = new SqlCommand("select * from tbpat where name='" + lblname.Text + "'", con);
            dr = com.ExecuteReader();
            dt = new DataTable();
            dt.Load(dr);
            if(dt.Rows.Count>0)
            lblname.Text = Convert.ToString(dt.Rows[0]["name"]);
            Image1.ImageUrl = Convert.ToString(dt.Rows[0]["path"]);
            con.Close();
        }
        else
        {
            Response.Redirect("Signin.aspx");
        }
    }
    
    protected void btnlogout_Click(object sender, EventArgs e)
    {
        Session.Clear();
        Response.Redirect("Signpat.aspx");
    }

    
}