package com.github.DeadorDev.jrtb;

import com.github.DeadorDev.jrtb.command.Command;
import com.github.DeadorDev.jrtb.command.StopCommand;

import static com.github.DeadorDev.jrtb.command.CommandName.STOP;
import static com.github.DeadorDev.jrtb.command.StopCommand.STOP_MESSAGE;

public class StopCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return STOP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return STOP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StopCommand(sendBotMessageService);
    }
}
