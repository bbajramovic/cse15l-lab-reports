# Lab Report 1
## CD command
![Image](image1.png)

The working directory here was /home. There is no error in this output, there are simply no arguments for the system to "change directory" to. If a user was in another directory and used cd, they would be automatically returned to the home directory.



![Image](image2.png)

The working directory here is /home/lecture1. There is no error in this output. Here we changed the directory from /home to /home/lecture1.

![Image](image3.png)

I was able to cd to the messages directory to access a file. However, cd to a file is an error because a file is not a directory. My working directory here was /home/lecture1/messages
## LS command

![Image](image4.png)

With no arguments, ls simply lists out the names of the files and folders inside the current work directory, which is home. There is no error here.

![Image](image5.png)

This lists the files and folders inside the directory of lecture1. The working directory here is still /home and there are no errors.

![Image](image6.png)

I changed directory to lecture1, then to messages, to be able to access a file in that directory. Using ls on the file: en-us.txt produced the contents in that file which was just the file itself. There is no error here and the working directory is /home/lecture1/messages. The contents of the en-us.txt file are not printed, only the name is printed. When we change the path provided to the ls command, we would see different lists displayed. For example, using ls while in the home directory would produce an output of just direct files from home such as lecture1 and wavelet. If we cd into wavelet and run ls, we would see all direct files in the wavelet directory: Handler.class, NumberServer.java, Server.class, Server.java, NumberServer.class, README.md, ServerHttpHandler.class, URLHandler.class

## CAT command

![Image](image7.png)

This is not an error. Using cat with no arguments causes us to somewhat "exit" the terminal (user@sahara) and everytime we enter something now, our input is echoed back to us as output. The cat command needs to have two inputs to be able to concatenate and print the contents of one or more files given by the paths. I used the working directory of /home/lecture1.

![Image](image8.png)

This is basically an error message because to be able to use cat, we would be concatenating two files, not directories. So this is invalid input. My working directory here was /home. 

![Image](image9.png)

Here I used cat on a file, which printed out the contents of that file. There is no error here, and my working directory is /home/lecture1/messages.
