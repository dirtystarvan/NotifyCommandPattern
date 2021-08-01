package senders;

import commands.Command;

import java.util.List;

public class AbstractSender implements Sender {
	Command command;
	List<Command> commands;

	public AbstractSender(Command command) {
		this.command = command;
	}

	public AbstractSender(List<Command> commands) {
		this.commands = commands;
	}

	@Override
	public void sendNotification() {
		command.execute();
	}

	@Override
	public void sendBroadcast() {
		for (Command command: commands)
			command.execute();
	}
}
