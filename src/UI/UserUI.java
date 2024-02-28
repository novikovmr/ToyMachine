package UI;

public class UserUI {
    public static void getMessage() {
        System.out.println("\n~~~~~ГЛАВНОЕ МЕНЮ~~~~~");
        System.out.println("\n~~~~~Выберите нужный пункт~~~~~\n");
        System.out.println("1 - Посмотреть доступные игрушки");
        System.out.println("2 - Почитать о системе редкости и шансах выигрыша");
        System.out.println("3 - Посмотреть список выигранных игрушек");
        System.out.println("4 - ИСПЫТАТЬ СУДЬБУ");
        System.out.println("5 - Получить игрушки");
        System.out.println("6 - Завершение работы программы");

    }
    public static void aboutDropChance() {
        System.out.println("У каждой игрушки есть свой уровень редкости.\nCommon - самый высокий шанс выигрыша;\nRare - шанс выпадения 2/10;\nMythical - шанс выпадения 1/200;\nLegendary - шанс выпадения 1/50.\n");
    }
    
}

