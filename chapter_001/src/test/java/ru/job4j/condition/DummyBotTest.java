package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for DummyBot
 * @author AShulga
 * @version 0.1
 * @since 31.01.2019
 */
public class DummyBotTest {
    @Test
    public void whenGreetBot() {
        DummyBot bot = new DummyBot();
        assertThat("Привет, Умник.", is(bot.answer("Привет, Бот!")));
    }
    @Test
    public void whenGoodbyeBot() {
        DummyBot bot = new DummyBot();
        assertThat("До скорой встречи.", is(bot.answer("Пока.")));
    }
    @Test
    public void whenAnyOtherQuestToBot() {
        DummyBot bot = new DummyBot();
        assertThat("Этот вопрос ставит меня в тупик. Задайте другой вопрос.", is(bot.answer("0")));
    }
}

