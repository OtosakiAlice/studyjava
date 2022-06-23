import java.io.*;
public class DumpFile{
    public static void main(String[] args){
        String line;
        if (args.length < 1) {
            System.err.println("Err; java DumpFile ファイル名");
            System.exit(1);
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(Exception e) {
            System.err.println(e.toString());
        }
    }
}
