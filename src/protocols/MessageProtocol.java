package protocols;
import messages.Message;

public interface MessageProtocol 
{
	public boolean send(Message m);
	public boolean receive(Message m);
}
