using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    protected void OnButtonUnoClicked(object sender, EventArgs e)
    {
        labelSaludo.Text = "Hola " + entryNombre.Text;
        entry1.Text =buttonUno.
        decimal numero = decimal.Parse(" entry1.text ");

    }

    protected void OnButton2Clicked(object sender, EventArgs e)
    {
    }

    protected void OnButton3Clicked(object sender, EventArgs e)
    {
    }

    protected void OnButton14Clicked(object sender, EventArgs e)
    {
    }

    protected void OnButton4Clicked(object sender, EventArgs e)
    {
    }

    protected void OnButton5Clicked(object sender, EventArgs e)
    {
    }

    protected void OnButton6Clicked(object sender, EventArgs e)
    {
    }

    protected void OnButton7Clicked(object sender, EventArgs e)
    {
    }

    protected void OnButton8Clicked(object sender, EventArgs e)
    {
    }

    protected void OnButton9Clicked(object sender, EventArgs e)
    {
    }

    protected void OnButtonClicked(object sender, EventArgs e)
    {
    }

    protected void OnButtone1Clicked(object sender, EventArgs e)
    {
    }

    protected void OnButtonEClicked(object sender, EventArgs e)
    {
    }

    protected void OnButton15Clicked(object sender, EventArgs e)
    {
    }

    protected void OnButtonXClicked(object sender, EventArgs e)
    {
    }

    protected void OnButtonDClicked(object sender, EventArgs e)
    {

    }
}
