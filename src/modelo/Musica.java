package modelo;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineEvent;

public class Musica
{
    private String nome;
    private File som;

    public Musica() {
    }

    
    
    public Musica(String nome, File som) {
        this.nome = nome;
        this.som = som;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public File getSom() {
        return som;
    }

    public void setSom(File som) {
        this.som = som;
    }
    
    private int currentTrackIndex = 0;
    private List<Musica> playlist;
    private Clip clipe;
    
   public void tocarMusica(List<Musica> playlist) {
        this.playlist = playlist;
        Collections.shuffle(this.playlist);
        tocarProximaMusica();
    }

    public void tocarProximaMusica() {
        if (currentTrackIndex < playlist.size()) {
            try {
                File somArquivo = playlist.get(currentTrackIndex).getSom();
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(somArquivo);
                clipe = AudioSystem.getClip();
                clipe.open(audioStream);
                
                FloatControl volumeControl = (FloatControl) clipe.getControl(FloatControl.Type.MASTER_GAIN);
                volumeControl.setValue(Math.max(volumeControl.getMinimum(), Math.min(-13.0f, volumeControl.getMaximum())));

                clipe.addLineListener(event -> {
                    if (event.getType() == LineEvent.Type.STOP) {
                        clipe.close();
                        currentTrackIndex++;
                        if (currentTrackIndex >= playlist.size()) {
                            currentTrackIndex = 0;
                        }
                        tocarProximaMusica();
                    }
                });

                clipe.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void ajustarVolume(int valorVolume) {
        FloatControl volumeControle = (FloatControl) clipe.getControl(FloatControl.Type.MASTER_GAIN);
        float min = volumeControle.getMinimum();
        float max = volumeControle.getMaximum();

        float volume = (float) (min + (Math.log10(valorVolume / 100.0f) * (max - min)));
        volumeControle.setValue(volume);
        
        System.out.println("Valor do Slider: " + valorVolume);
        System.out.println("Volume mínimo: " + min);
        System.out.println("Volume máximo: " + max);
        System.out.println("Volume calculado: " + volume);
    }

    
    public class Playlist
    {
        public static List<Musica> playlist()
        {
            List<Musica> playlist = new ArrayList<>();
            
            playlist.add(new Musica("Car Sport", new File("src\\sons\\musicas\\carsport.wav")));
            playlist.add(new Musica("Chill Trap", new File("src\\sons\\musicas\\chilltrap.wav")));
            playlist.add(new Musica("Event Vibe", new File("src\\sons\\musicas\\eventvibe.wav")));
            playlist.add(new Musica("New York Minute", new File("src\\sons\\musicas\\newyorkminute.wav")));
            
            return playlist;
        }
    }
}
