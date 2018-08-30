package phones;

import messages.Message;
import protocols.MessageProtocol;
import storage.ICloud;
import storage.StorageProvider;

import java.util.List;

public final class IPhone extends Phone implements MessageProtocol {

    public IPhone() {
        super(new ICloud());
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
