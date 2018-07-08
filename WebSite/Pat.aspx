<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.master" AutoEventWireup="true" CodeFile="Pat.aspx.cs" Inherits="Pat" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">

    <div style="background-color: lime; height: 416px;">
        <br>
        <br>
        <asp:Image ID="Image1" runat="server" Style="height: 200px; width: 200px; margin-left: 100px; border-radius: 30%; border: 4px solid blue;" />
        <strong style="margin-left: 180px; font-size: 50px;">Welcome
            <asp:Label ID="lblname" runat="server" Text=""></asp:Label></strong>
        <asp:LinkButton ID="btnlogout" runat="server" Text="LogOut" Style="margin-left: 1050px; font-size:30px; position:relative; bottom: 150px;" onclick="btnlogout_Click"></asp:LinkButton>

            <br>
        
    </div>
</asp:Content>

