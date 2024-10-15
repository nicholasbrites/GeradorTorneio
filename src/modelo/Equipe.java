package modelo;

import javax.swing.ImageIcon;

public class Equipe
{
    private String nome;
    private int pais;
    private ImageIcon logo;

    public Equipe(String nome, int pais, ImageIcon logo) {
        this.nome = nome;
        this.pais = pais;
        this.logo = logo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

    public ImageIcon getLogo() {
        return logo;
    }

    public void setLogo(ImageIcon logo) {
        this.logo = logo;
    }
}
