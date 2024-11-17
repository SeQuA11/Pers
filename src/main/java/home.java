import java.util.Scanner;


public class home {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var user_command = "";
        Pers pers = new Pers(user_command);
        boolean bool = true;

        System.out.println("                  СОЗДАЙТЕ СВОЕГО ПЕРСОНАЖА.\n" +
                "У вашего персонажа будет 6 характеристик, которые можно изменить.\n" +
                "Первые три задаются вами, а сотальные три устанвливаются рандомно.\n" +
                "1. Имя\n2. Раса\n3. Пол\n4. Возраст\n5. НР\n6. Мана\n" +
                "\n////////////////////////////////////////////////////////////\n" +
                "\nСписок команд:\n" +
                "help: перечень команд.\n" +
                "create_pers: команда для создания персонажа.\n" +
                "remove: команда для изменения одной из характеристик.\n" +
                "Har_pers: перечень характеристик персонажа\n" +
                "exit: команда для выхода.");
        System.out.println("////////////////////////////////////////////////////////////");


        while (bool) {
            String[] mass = new String[6]; // Пока Infinity равно true
            // Приглашение ввести команду
            System.out.println("Введите команду: ");
            user_command = in.nextLine();

            // Обработка команды с помощью оператора ветвления
            switch (user_command) {
                // Если user_command содержит строку help
                case "help": {
                    System.out.println("Список команд: ");
                    System.out.println("////////////////////////////////////////////////////////////");
                    System.out.println("create_pers: команда для создания персонажа.");
                    System.out.println("remove: команда для изменения одной из характеристик.");
                    System.out.println("Har_pers: перечень характеристик персонажа");
                    System.out.println("exit: команда для выхода.");
                    System.out.println("////////////////////////////////////////////////////////////");
                    break;
                }

                case "create_pers": {
                    // Создаём новый объект в памяти, в качестве параметра и передаём имя персонажа
                    System.out.print("Введите имя создаваемого персонажа: ");
                    user_command = in.nextLine();
                    mass[0] = pers.Name(user_command);

                    System.out.print("Введите расу персонажа из перченя: \n1. Человек.\n2. Зверолюд.\n3. Демон.\n4. Ангел.\n5. Дух.");
                    user_command = in.nextLine();
                    mass[1] = pers.Species(Integer.parseInt(user_command));

                    System.out.print("Введите пол персонажа(W/M): ");
                    user_command = in.nextLine();
                    mass[2] = pers.Pol(user_command);

                    System.out.print("Возраст сгенерирован: ");
                    mass[3] = String.valueOf(pers.Age());

                    System.out.print("Уровень НР сгенерирован: ");
                    mass[4] = String.valueOf(pers.HP());

                    System.out.print("Уровень маны сгенерирован: ");
                    mass[5] = String.valueOf(pers.Mana());

                    // Сообщаем о создании
                    System.out.println("Человек успешно создан :) ");
                    break;
                }

                case "Har_pers": {
                    System.out.print("Характеристики персонажа: \n");
                    for (String j : mass) {
                        System.out.print(j + "\n");
                    }
                    break;
                }

                case "remove": {
                    String command = in.nextLine();
                    switch (command) {
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
                            break;
                        }
                        case "3": {
                            System.out.print("Введите пол персонажа(W/M): ");
                            user_command = in.nextLine();
                            mass[2] = pers.Pol(user_command);
                            break;
                        }
                        case "4": {
                            System.out.print("Возраст сгенерирован: ");
                            mass[3] = String.valueOf(pers.Age());
                            break;
                        }
                        case "5": {
                            System.out.print("Уровень НР сгенерирован: ");
                            mass[4] = String.valueOf(pers.HP());
                            break;
                        }
                        case "6": {
                            System.out.print("Уровень маны сгенерирован: ");
                            mass[5] = String.valueOf(pers.Mana());
                            break;
                        }
                    }
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
