import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class StringHandler {
  int length = args.length;
  int num = 0;
  List<String> args;
  String path;
  public String handleRequest(URI url) {
    if (url.getPath().equals("/")){
      return String.format("%d", num); //printing the digit before each string output
      num += 1;
      if (url.getPath().equals("/add-message")){
        if(query.startsWith("s=")) {
          String[] parameters = url.getQuery().split("=");
          String path = String.join("\n", args) + "\n";
          Files.write(Paths.get(this.path), path.getBytes());
          //for(int i = 1; i < length; length += 1) {
          System.out.println(args);
          }
        }
      else 
        return "use /add-message with a query parameter s\n";
      }
    }
  }

  
