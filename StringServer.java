import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    int num = 0;
 String[] array = new String[100];
  int count = 1;

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            if (url.getPath().contains("/add-message")) {
                String[] parameters = url.getQuery().split("=");
                String str = String.format(count) + "."+ parameters[1] + "\n";
                count++;
                array.add(str); //add this to array
                return String.format("%s ", array); 
                }
            }
            return "404 Not Found!"; //illegal start of type error
        }
}


class NumberServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
      
