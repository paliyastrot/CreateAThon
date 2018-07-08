<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.master" AutoEventWireup="true" CodeFile="Doc.aspx.cs" Inherits="Doc" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">

    <div style="background-color: lime; height: 416px;">
        <br>
        <br>
        <strong style="margin-left: 180px; font-size: 50px;">Welcome
            <asp:Label ID="lblname" runat="server" Text=""></asp:Label></strong>
        <asp:LinkButton ID="btnlogout" runat="server" Text="LogOut" 
            Style="margin-left: 1050px; font-size:30px; position:relative; bottom: 65px;" 
            onclick="btnlogout_Click1"></asp:LinkButton>
        <a href="Regpat.aspx"><input type="button" class ="btn btn-danger submit mb-4 btn-primary" value= "PATIENT REGISTER OR UPDATE PATIENT RECORDS" style=" margin-left:470px; margin-right:500px;" /></a>


        <br>
       
    </div>
</asp:Content>

