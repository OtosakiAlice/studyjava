import java.io.*;
public class StdInTest{
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        try {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(Exception e) {
            System.err.println(e.toString());
        }
    }
}
