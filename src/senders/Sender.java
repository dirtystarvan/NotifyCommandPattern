package senders;

public interface Sender {
	void sendNotification();

	default void sendBroadcast() {

	}
}
