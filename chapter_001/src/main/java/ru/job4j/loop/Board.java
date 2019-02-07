package ru.job4j.loop;

public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        for(int i = 1; i <= height; i++) {
            for(int j=1; j <= width; j++) {
                if((i + j) % 2 == 0) {
                    screen.append("X");
                }
                else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
    return screen.toString();
    }
}
