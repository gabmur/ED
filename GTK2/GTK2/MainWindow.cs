using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();

        buttonAceptar.Clicked+=delegate {
            labelSaludo.Text = "Hola " + entryNombre.Text;
        };
        for (int index = 0; index < 4; index++)
        {
            Button button = new Button(Stock.Close);
            button.Label = "HOla" + index;
            button.Visible = true;
            vBox.Add(button);
        }
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

   // protected void OnButtonAceptarClicked(object sender, EventArgs e)
    //{
     //   labelSaludo.Text = "Hola " + entryNombre.Text;
    //}
}
