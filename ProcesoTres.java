package clases;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class ProcesoTres extends Thread {
    @Override
    public void run(){    
     String sonido="C:/sonido/musica.wav";  
     InputStream in = null;
        try {
            in = new FileInputStream(sonido);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProcesoTres.class.getName()).log(Level.SEVERE, null, ex);
        }
     AudioStream audio = null;
        try {
            audio = new AudioStream (in);
        } catch (IOException ex) {
            Logger.getLogger(ProcesoTres.class.getName()).log(Level.SEVERE, null, ex);
        }
     AudioPlayer.player.start(audio);
    }
    }
    

