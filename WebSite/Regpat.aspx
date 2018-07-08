<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.master" AutoEventWireup="true" CodeFile="Regpat.aspx.cs" Inherits="Regpat" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
<div style="background-color:lime; height:600px;">

<div style=" margin-left:470px;">

<br><br><br>
<asp:Image ID="Image1" runat="server" Style="height: 200px; width: 200px;  margin-left:-300px; border-radius: 30%; border: 4px solid blue;" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
FIRST NAME:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<asp:TextBox ID="txtname" runat="server"></asp:TextBox>
<br><br>
LAST NAME:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<asp:TextBox ID="txtlname" runat="server" style="margin-top:-70px;"></asp:TextBox>
<br><br>
EMAIL ID:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<asp:TextBox ID="txtid" runat="server"></asp:TextBox>
<br><br>
PASSWORD:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<asp:TextBox ID="txtpwd" runat="server"></asp:TextBox>
<br><br>
<asp:FileUpload ID="FileUpload1" runat="server"  style=" margin-left:-260px;"/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<asp:Button ID="btnSubmit1"  class="btn btn-primary mb-4 submit btn-danger" runat="server" Text="SignUp" 
        onclick="btnSubmit1_Click"/>
    <br>
    <asp:Button ID="btndelete"  class="btn btn-primary mb-4 submit btn-danger" runat="server" Text="DELETE" 
        onclick="btndelete_Click" />
    <asp:Button ID="btnupdate"  class="btn btn-primary mb-4 submit btn-danger" runat="server" Text="UPDATE" onclick="btnupdate_Click" />
    <asp:Button ID="btnopen"  class="btn btn-primary mb-4 submit btn-danger" runat="server" Text="OPEN" onclick="btnopen_Click" />
    <asp:Button ID="btnopenall"  class="btn btn-primary mb-4 submit btn-danger" runat="server" Text="OPEN ALL" onclick="btnopenall_Click" />
    <asp:GridView ID="GridView1" runat="server" style="margin-left:400px; margin-top:-340px;">
    </asp:GridView>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<asp:Label ID="lblmessage" runat="server" Text=""></asp:Label>
</div>

</div>


</asp:Content>

