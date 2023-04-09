import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
public class App {

    public static void main(String[] args) {
        String[] imagenesUrls = {"https://i.pinimg.com/originals/58/66/74/58667422006989cb3a79710e4db301a6.gif",
         "https://i.redd.it/gjuaf8c01wo71.jpg", 
         "https://tv-fanatic-res.cloudinary.com/iu/s--6uWfwuVq--/t_xlarge_p/cs_srgb,f_auto,fl_strip_profile.lossy,q_auto:420/v1601574078/louise-bobs-burgers-season-11-episode-2.jpg", 
         "https://steamuserimages-a.akamaihd.net/ugc/1750191221387538639/1CD3688433A6B99D9A1731D4A1F85B0507654A72/?imw=512&&ima=fit&impolicy=Letterbox&imcolor=%23000000&letterbox=false", 
         "https://admin.planetyze.com/media/15287"};
        
        long TiempoInicio = System.currentTimeMillis();
        
        try {
            for(String imagenesUrl : imagenesUrls) {
                URL url = new URL(imagenesUrl);
                ImageIO.write(ImageIO.read(url), "jpg", new File("imagen" + System.currentTimeMillis() + ".jpg"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        long TiempoFin = System.currentTimeMillis();
        long TiempoTotal = TiempoFin - TiempoInicio;
        System.out.println("Tiempo total de ejecución: " + TiempoTotal/1000 + " segundos.");
    }


    }

