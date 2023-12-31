import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
        String[] array = new String[100];
        int count = 0;
        String abc = "";
    public String handleRequest(URI url) {
        
        if (url.getPath().equals("/")) {
            return "input a path!";
        }
        else if (url.getPath().equals("/add-message")) {
            String[] parameters = url.getQuery().split("=");
            array[count] = String.format("%d", count) + "."+ parameters[1] + "\n";
             
             //for( int i = 0; i <= count; i++ ){
            abc = abc + array[count]; 
            //}
            count++;
            return abc;
        }
        else {
            return "404 Not Found!";
        }
    }
}


class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}

      
