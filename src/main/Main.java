package main;

import apresentacao.frmPrincipal;
import modelo.Musica;

public class Main
{
    public static void main(String[] args)
    {    
        Musica musica = new Musica();
        musica.tocarMusica(Musica.Playlist.playlist());
        frmPrincipal frmP = new frmPrincipal(null, true);
        frmP.setVisible(true);
    }
}
