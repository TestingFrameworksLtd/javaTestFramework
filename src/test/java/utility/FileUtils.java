package utility;

/**
 * Created by vikas on 01/03/2017.
 */
public class FileUtils {
  
   public static String readFile(String path) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String sCurrentLine = null;
            while ((sCurrentLine = br.readLine()) != null) {
                sb.append(sCurrentLine);
            }
        } catch (IOException io) {
            throw new RuntimeException(io.getMessage());
        }
        return sb.toString();
    }
}
