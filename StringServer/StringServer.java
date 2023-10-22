import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    int num = 0;
    String[] array = new String[100];
    String abc = "";
    int count = 0;


    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return "input a path!";
        }
        else if (url.getPath().equals("/add-message")) {
            String[] parameters = url.getQuery().split("=");
            String str = String.format("%d", count) + "."+ parameters[1] + "\n";
            count++;
            array[count]= str; 

            for( int i = 0; i < (count + 1 ); i++ ){
                abc= abc + array[i]; 
            }
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

      
