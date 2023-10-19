import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class StringHandler {
  int length = args.length; //error
  int num = 0;
  int args[] = new int[100]
  public String handleRequest(URI url){
    if (url.getPath().equalds("/")){
      return String.format("?d", num); //printing the digit before each string output
      num += 1;
    }
    if (url.getPath().equals("/add-message")){
      String[] parameters = url.getQuery().split("=");
      args.add("%s\n"); //????
       
      for(int i = 0; i , length; length += 1){
        System.out.print(args[i]);
      }
