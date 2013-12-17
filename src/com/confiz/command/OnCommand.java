package com.confiz.command;

public class OnCommand implements Command {

	private ConsumerElectronics ce;

	public OnCommand(ConsumerElectronics ce) {
		this.ce = ce;
	}

	public void execute() {
		ce.on();
	}
}
