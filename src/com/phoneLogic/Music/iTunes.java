package com.phoneLogic.Music;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class iTunes {

    private Map<Musica,Double> listaMusicas;

    public iTunes() {
        this.listaMusicas = new HashMap<>();
    }


    public void addMusica(String artista, String musica, double valor){
        listaMusicas.put(new Musica(artista,musica),valor);
    }

    public void tocarMusica(Musica m){
        System.out.println("Tocando - " + m.getMusica() + " Por - " + m.getArtista());
    }

    public void pausar(){
        System.out.println("Musica pausada");
    }

    public Musica getByMusicName(String musica){
       Musica musicToFind = null;
        for (Musica m : listaMusicas.keySet()){
           if (m.getMusica().equalsIgnoreCase(musica)){
               musicToFind = m;
               break;
           }
       }
        return musicToFind;

    }

    public List<String> getMusicFromArtists(String artist){
        List<String> musicsFromArtists = new ArrayList<>();
        for (Musica m : listaMusicas.keySet()){
            if (m.getArtista().equalsIgnoreCase(artist)){
                musicsFromArtists.add("Musica- " + m.getMusica() + " Artista- " + m.getArtista());
            }
        }
        return musicsFromArtists;
    }

    public double valorCarrinho(){
        double valor = 0;
        for (Musica m : listaMusicas.keySet()){{
            valor += listaMusicas.get(m);
        }
        }
        return valor;
    }
}
