package com.phoneLogic.Music;

import java.util.Objects;

public class Musica {
    private String artista;
    private String musica;

    public Musica(String artista, String musica) {
        this.artista = artista;
        this.musica = musica;
    }

    public String getArtista() {
        return artista;
    }

    public String getMusica() {
        return musica;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Musica musica1)) return false;
        return Objects.equals(getMusica(), musica1.getMusica());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMusica());
    }

    @Override
    public String toString() {
        return "Musica{" +
                "artista='" + artista + '\'' +
                ", musica='" + musica + '\'' +
                '}';
    }
}
