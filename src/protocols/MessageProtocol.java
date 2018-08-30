package protocols;

import messages.Message;

public interface MessageProtocol {
    public boolean isSent(Message message);
    public boolean isRecieved(Message message);
}
