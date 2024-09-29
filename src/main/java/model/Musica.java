package model;

public class Musica {
    private int ID;
    private String nome;
    private String estiloMusical;

    public Musica(){}
    public Musica(int ID, String nome, String estiloMusical) {
        this.ID = ID;
        this.nome = nome;
        this.estiloMusical = estiloMusical;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }
}
