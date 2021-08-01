package commands;

import receivers.Receiver;

public class EmailNotify implements Command {
    Receiver receiver;
    String emailText;

    public EmailNotify(Receiver receiver, String message) {
        this.receiver = receiver;
        this.emailText = message;
    }

    @Override
    public void execute() {
        receiver.printNotification(emailText);
    }
}
