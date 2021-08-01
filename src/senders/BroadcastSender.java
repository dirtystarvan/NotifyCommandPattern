package senders;

import commands.Command;

import java.util.List;

public class BroadcastSender extends AbstractSender {
	public BroadcastSender(List<Command> commands) {
		super(commands);
	}
}
