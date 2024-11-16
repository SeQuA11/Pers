import java.util.Random;

public class Pers {
    private Random rnd = new Random();

    // конструктор класса (данная функция вызывается // при создании нового экземпляра класса
    public Pers(String user_command) {
        // Генерируем возраст от 15 до 50 лет
        Age = rnd.nextInt(15, 51);
        // и здоровье, от 10% до 100%
        Health = rnd.nextInt(10, 101);
        //
        Mana = rnd.nextInt(10, 101);

    }

    // беззнаковое целое число, содержащая возраст
    private int Age;
    // беззнаковое целое число, отражающее уровень здоровья
    private int Health;
    //
    private int Mana;
    //
    private boolean Pol;
    //
    private boolean remake;

    public boolean Remake(String yesno) {
        if (yesno == "Yes" || yesno == "Y" || yesno == "yes" || yesno == "y") {
            return false;
        }
        return remake;
    }
    //
    public String Species (int _species) {
        // объявляем переменную, в которой мы будем хранить строку
        String tmp_str = "";

        switch (_species) {
            case 1: {
                tmp_str = "Человек";
                break;
            }
            case 2: {
                tmp_str = "Зверолюд";
                break;
            }
            case 3: {
                tmp_str = "Демон";
                break;
            }
            case 4: {
                tmp_str = "Ангел";
                break;
            }
            case 5: {
                tmp_str = "Дух";
                break;
            }
        }
        System.out.println(tmp_str);
        return tmp_str;
    }

    public String Name (String name) {
        String str = name;
        return str;
    }


}
