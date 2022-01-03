package com.github.DeadorDev.jrtb;

import com.github.DeadorDev.jrtb.command.Command;
import com.github.DeadorDev.jrtb.command.StartCommand;

import static com.github.DeadorDev.jrtb.command.CommandName.START;
import static com.github.DeadorDev.jrtb.command.StartCommand.START_MESSAGE;

public class StartCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return START.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return START_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StartCommand(sendBotMessageService);
    }
}
