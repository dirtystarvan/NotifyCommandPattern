package commands;

import receivers.Receiver;

public class SmsNotify implements Command {
    Receiver receiver;
    String smsText;

    public SmsNotify(Receiver receiver, String message) {
        this.receiver = receiver;
        this.smsText = message;
    }

    @Override
    public void execute() {
        receiver.printNotification(smsText);
    }
}
