using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        Table table = new Table(3, 3, true);
        for (int row = 0; row < 3;row++)
            for (int column = 0; column < 3; column++){
                Button buton = new Button();
                table.Attach(button, (unit)column, (unit)column+1, (unit)row, (unit)row+1)
            }

        }
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }
}
