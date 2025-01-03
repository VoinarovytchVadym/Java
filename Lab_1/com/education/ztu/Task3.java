package com.education.ztu;

/**
 * task_3
 */
public class Task3 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Немає аргументів для відображення.");
            return;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < args.length; i++) {
            result.append(args[i]);

            if (i < args.length - 1) {
                result.append(" ");
            }
        }

        System.out.println(result);
    }
}

class MainCaller {
    public static void main(String[] args) {
        Task3.main(new String[]{"2", "3", "5", "8"});
    }
}