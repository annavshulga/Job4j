package ru.job4j.condition;

/**
 * Глупый бот
 * @author AShulga
 * @version 0.1
 * @since 31.01.2019
 */
public class DummyBot {
    /**
     * Три варианта ответа.
     * @param question Вопрос.
     * @return Ответ.
     */
   public String answer(String question) {
       String result = "Этот вопрос ставит меня в тупик. Задайте другой вопрос.";
       if(question.equals("Привет, Бот!"))
           result = "Привет, Умник.";
        else if(question.equals("Пока."))
           result = "До скорой встречи.";
       return result;
       }
}