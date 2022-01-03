package com.github.DeadorDev.jrtb;

import com.github.DeadorDev.jrtb.command.Command;
import com.github.DeadorDev.jrtb.command.UnknownCommand;

import static com.github.DeadorDev.jrtb.command.UnknownCommand.UNKNOWN_MESSAGE;

public class UnknownCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return "/UNKNOWN";
    }

    @Override
    String getCommandMessage() {
        return UNKNOWN_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new UnknownCommand(sendBotMessageService);
    }
}
