import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class Handler{
  in num = 0;
  int newArg[] = new int[100]
  public String handleRequest(URI url) {
    if (url.getPath().equals("/")){
      return String.format(%d", num); //printing the digit before each string output
      num += 1;
    }
    if (url.getPath().equals("/add-message")){
      String[] parameters = url.getQuery().split("=");
      //how to add string parameters into args
      for(int i = 0; i < args.length; length +=1) { //printing out contents of each string in array
        System.out.println(args[i]);
      }
    }
  }
}
      
