package org.example;

public class Main {
    public static void main(String[] args) {
        String[] quotes = {
                "You snooze, you lose",
                "When the going gets tough, the tough get going"
        };

        try {
            for (int i = 0; i <= quotes.length; i++) {
                System.out.println(quotes[i]);

            }
        }
        catch (Exception e){
            System.out.println("Bad stuff happened!!!");
            e.printStackTrace();
        }
    }
}