import java.util.Scanner;


public class home {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var user_command = "";
        Pers pers = new Pers(user_command);
        boolean bool = true;

        System.out.println("iowedio");


        while (bool) {  // Пока Infinity равно true
            String[] mass = new String[6];


            // Приглашение ввести команду
            System.out.println("Введите команду: ");
            user_command = in.nextLine();

            // Обработка команды с помощью оператора ветвления
            switch (user_command) {
                // Если user_command содержит строку help
                case "help": {
                    System.out.println("Список команд: ");
                    System.out.println("--------------");
                    System.out.println();
                    System.out.println("create_man: команда создаёт человека, (экземпляр класса Man)");
                    System.out.println("kill_man: команда убивает человека");
                    System.out.println("talk: команда заставляет человека говорить (если создан экземпляр класса)");
                    System.out.println("go: команда заставляет человека идти (если создан экземпляр класса)");
                    System.out.println("isalive: команда проверяет, жив ли человек (если создан экземпляр класса)");
                    System.out.println();
                    System.out.println("------------------");
                    System.out.println("------------------");
                    break;
                }

                case "create_pers": {
                    int remake = 1;
                    switch (remake) {
                        case 1: {
                            // Создаём новый объект в памяти, в качестве параметра и передаём имя человека
                            System.out.println("Введите имя создаваемого человека: ");
                            user_command = in.nextLine();
                            mass[0] = pers.Name(user_command);


                            System.out.println("Введите имя создаваемого человека: ");
                            user_command = in.nextLine();
                            mass[1] = pers.Species(Integer.parseInt(user_command));
                        }

                        case 2: {
                            user_command = in.nextLine();
                            switch (user_command) {
                                case "1": {
                                    // Создаём новый объект в памяти, в качестве параметра и передаём имя человека
                                    System.out.println("Введите имя создаваемого человека: ");
                                    user_command = in.nextLine();
                                    mass[0] = pers.Name(user_command);
                                    break;
                                }
                                case "2": {
                                    System.out.println("Введите имя создаваемого человека: ");
                                    user_command = in.nextLine();
                                    mass[1] = pers.Species(Integer.parseInt(user_command));
                                }
                            }
                        }
                    }


                    System.out.println("Введите : ");
                    user_command = in.nextLine();
                    if (user_command == "Y") {
                        remake = 1;
                    } else {
                        remake += 1;
                    }


                    // Сообщаем о создании
                    System.out.println("Человек успешно создан :) ");
                    break;
                }

                case "remove_Pers": {
                    System.out.println("Персонажа нет");

                    break;
                }

                case "exit": {
                    bool = false;
                    // Цикл завершается, и программа завершит своё выполнение
                    break;
                }

                // Если команду не удалось определить
                default: {
                    System.out.println("Ваша команда не определена, пожалуйста, повторите снова");
                    System.out.println("Для вывода списка команд введите команду help");
                    System.out.println("Для завершения программы введите команду exit");
                    break;
                }
            }
        }
    }
}
