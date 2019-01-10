﻿
using Gtk;
using System;
using System.Collections.Generic;

using CBingo;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        Panel panel = new Panel(vbox);
        Bombo bombo = new Bombo();

        buttonAdelante.Clicked += delegate {
            int numero = bombo.sacarBola();
            panel.Marcar(numero);
            Console.WriteLine("bottonAdelante pulsado");
        };


    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }
}
