import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner variant = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int intvar = 4;
        int n;
        while (true) {
            System.out.println("Выберите вариант работы: ");
            System.out.println("1) Задание 1");
            System.out.println("2) Задание 2");
            System.out.println("3) Задание 3");
            System.out.println("0) Завершить работу");
            if (variant.hasNextInt()) {
                intvar = variant.nextInt();
                switch (intvar) {
                    case 1:

                        if (sc.hasNextInt()) {
                            n = sc.nextInt();
                            if (n > 7)
                                System.out.println("Привет");
                        } else {
                            System.out.println("Ошибка ввода");
                        }
                        break;
                    case 2:
                        String str = "";
                        System.out.println("Ввеите пожалуйста имя");
                        str = sc.next();
                        if (str.equals("Вячеслав")) {
                            System.out.println("Привет, " + str);
                        } else {
                            System.out.println("Нет такого имени");
                        }
                        break;
                    case 3:
                        System.out.println("Идет ввод массива");
                        for (int i = 0; i < arr.length; i++) {
                            if (sc.hasNextInt()) {
                                arr[i] = sc.nextInt();
                            } else {
                                System.out.println("Ошибка ввода");
                                return;
                            }
                        }
                        System.out.println("Идет вывод массива");
                        for (int i = 0; i < arr.length; i++) {
                            if (arr[i] % 3 == 0) {
                                System.out.println("arr[" + i + "] = " + arr[i]);
                            }
                        }


                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Ошибка ввода");
                        break;
                }
            } else {
                System.out.println("Ошибка ввода");
            }

        }

    }
}
