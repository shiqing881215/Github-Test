import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.UnknownHostException;


public class Transfer implements Serializable {
	public static void main(String[] args) {
		Transfer t = new Transfer();
		Socket socket = null;
        try {
            socket = new Socket("127.0.0.1",4444);
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(t);
            
            out.close();
            socket.close();
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host.");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection.");
            System.exit(1);
        }
	}
}
