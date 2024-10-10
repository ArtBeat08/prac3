import java.util.Scanner;

public class FormatExample {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);


                System.out.print("Введіть ціле число: ");
                int intValue = scanner.nextInt();

                System.out.print("Введіть число з плаваючою точкою: ");
                double floatValue = scanner.nextDouble();

                System.out.print("Введіть строку: ");
                String strValue = scanner.next();

                System.out.print("Введіть логічне значення (true/false): ");
                boolean boolValue = scanner.nextBoolean();


                System.out.printf("1. Ціле число у десятковій системі: %d%n", intValue);


                System.out.printf("2. Число з плаваючою точкою (2 знаки після коми): %.2f%n", floatValue);


                System.out.printf("3. Число з плаваючою точкою (4 знаки після коми, ширина 10): %10.4f%n", floatValue);


                System.out.printf("4. Строка з мінімальною шириною 15: %15s%n", strValue);


                System.out.printf("5. Строка з вирівнюванням по лівому краю: %-15s%n", strValue);


                System.out.printf("6. Логічне значення: %b%n", boolValue);


                System.out.printf("7. Ціле число у шістнадцятковій системі: %x%n", intValue);


                System.out.printf("8. Ціле число у вісімковій системі: %o%n", intValue);


                System.out.printf("9. Число з плаваючою точкою (1 знак після коми): %.1f%n", floatValue);


                System.out.printf("10. Строка обрізана до 5 символів: %10.5s%n", strValue);

                scanner.close();
        }
}
