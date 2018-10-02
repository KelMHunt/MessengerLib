package phones;

import messages.Message;
import protocols.MessageProtocol;
import storage.Google;

public class Android extends Phone implements MessageProtocol
{

	public Android() 
	{
		super(new Google());
		// TODO Auto-generated constructor stub
	}
	public boolean send(Message m)
	{
		System.out.println("Sending "+m);
		return storage.save(m);
	}
	public boolean receive(Message m)
	{
		System.out.println("Received "+m);
		return storage.save(m);
	}

}
