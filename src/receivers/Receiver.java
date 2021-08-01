package receivers;

public interface Receiver {
	default void printNotification(String message) {
		System.out.println(this.getClass().getName() + ": " + message);
	}
}
