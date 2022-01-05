package com.github.DeadorDev.jrtb.command;

import com.github.DeadorDev.jrtb.repository.entity.TelegramUser;
import com.github.DeadorDev.jrtb.service.SendBotMessageService;
import com.github.DeadorDev.jrtb.service.TelegramUserService;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * Start {@link Command}.
 */
public class StartCommand implements Command {
    private final TelegramUserService telegramUserService;
    private final SendBotMessageService sendBotMessageService;

    public final static String START_MESSAGE = "Привет. Я JavaRush Telegram Bot. Я помогу тебе быть в курсе последних " +
            "статей тех авторов, котрые тебе интересны. Я еще маленький и только учусь.";

    public StartCommand(SendBotMessageService sendBotMessageService, TelegramUserService telegramUserService) {
        this.sendBotMessageService = sendBotMessageService;
        this.telegramUserService = telegramUserService;

    }

    @Override
    public void execute(Update update) {
        String chatId = update.getMessage().getChatId().toString();
        telegramUserService.findByChatId(chatId).ifPresentOrElse(user -> {
                    user.setActive(true);
                    telegramUserService.save(user);
                }, () -> {
                    TelegramUser telegramUser = new TelegramUser();
                    telegramUser.setActive(true);
                    telegramUser.setChat_id(chatId);
                    telegramUserService.save(telegramUser);
                }
        );
        sendBotMessageService.sendMessage(chatId, START_MESSAGE);
    }
}
