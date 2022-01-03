package com.github.DeadorDev.jrtb;

import com.github.DeadorDev.jrtb.command.Command;
import com.github.DeadorDev.jrtb.command.HelpCommand;
import org.junit.jupiter.api.DisplayName;

import static com.github.DeadorDev.jrtb.command.CommandName.HELP;
import static com.github.DeadorDev.jrtb.command.HelpCommand.HELP_MESSAGE;

@DisplayName("Unit-level test for HelpCommand")
public class HelpCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return HELP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return HELP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new HelpCommand(sendBotMessageService);
    }
}
