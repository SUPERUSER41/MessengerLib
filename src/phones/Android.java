package phones;

import messages.Message;
import protocols.MessageProtocol;
import storage.Google;
import storage.StorageProvider;

public class Android extends Phone implements MessageProtocol {


    public Android() {
        super(new Google());
    }

    @Override
    public boolean isSent(Message message) {
        System.out.println("Sending " + message.toString());
        return storage.saved(message);
    }

    @Override
    public boolean isRecieved(Message message) {
        System.out.println("Recieved " + message.toString());
        return storage.saved(message);
    }
}
