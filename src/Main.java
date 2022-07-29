public class Main {
    public static void main(String[] args) {
        // Задание 1
        int i = 1;
        while(i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.print("\n");
       for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
       
        // Задание 2
        int friday = 3;
       for(; friday <= 31; friday = friday + 7) {
           System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
           }
        // Задание 3

        int start = 2022-200;
        int finish = 2022+100;
        for(int year = 0; year <= finish; year = year + 79) {
            if(year >= start) {
                System.out.println(year);
            }
        }
        for(int year = start; year <=finish;year++) {
            if(year % 79==0) {
                System.out.println(year);
            }
        }

    }

    }