package com.lordralex.ralexbot.api.users;

/**
 *
 * @author Joshua
 */
public class BotUser extends User {

    public BotUser() {
        super(bot.getNick());
    }

    public static BotUser getBotUser() {
        return new BotUser();
    }

    public void setNick(String newNick) {
        bot.changeNick(newNick);
    }

    public void kick(String nick, String channel) {
        if (bot.getUserBot().isIrcop()) {
            bot.kick(bot.getChannel(channel), bot.getUser(nick));
        } else {
            bot.sendMessage("chanserv", "kick " + channel + " " + nick);
        }
    }

    public void kick(String nick, String channel, String reason) {
        if (reason == null || reason.isEmpty()) {
            kick(nick, channel);
            return;
        }
        if (bot.getChannel(channel).isOp(bot.getUserBot())) {
            bot.kick(bot.getChannel(channel), bot.getUser(nick), reason);
        } else {
            this.sendMessage("chanserv", "kick " + channel + " " + nick + " " + reason);
        }
    }

    public void joinChannel(String channel) {
        bot.joinChannel(channel);
    }

    public void leaveChannel(String channel) {
        bot.partChannel(bot.getChannel(channel));
    }

    public void sendMessage(String target, String message) {
        bot.sendMessage(target, message);
    }

    public void sendNotice(String target, String message) {
        bot.sendNotice(target, message);
    }
}
