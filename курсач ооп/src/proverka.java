public class proverka {
    public static void main(String[] args){
        zveri cat = new Cat(true, "Трехшерстная", 4, "Мяукает", "Аккуратно");
        System.out.println("У кошки есть волосеной покров ? " + cat.isVolosi());
        System.out.println("Какого цвета эта кошка? " + cat.getColor());
        System.out.println("Сколько лап у кошки? " + cat.getLapki());
        System.out.println("Какой звук издает кошка? " + cat.getZvyki());
        System.out.println("Как передвигается кошка? " + cat.getHodit());

        System.out.println();

        zveri mays = new Mays(true, "Серая", 4,  "Пищит", "Бесшумно");
        System.out.println("Есть ли волосеной покров у мышки? " + mays.isVolosi());
        System.out.println("Какого цвета мышка? " + mays.getColor());
        System.out.println("Сколько лап у мышки? " + mays.getLapki());
        System.out.println("Какой звук издает мышка? " + mays.getZvyki());
        System.out.println("Как передвигается мышки? " + mays.getHodit());

        System.out.println();

        zveri dog = new Dog(true, "Коричневая", 4,  "Гавкает", "Бегает");
        System.out.println("Есть ли волосеной покров у мышки? " + mays.isVolosi());
        System.out.println("Какого цвета мышка? " + dog.getColor());
        System.out.println("Сколько лап у мышки? " + dog.getLapki());
        System.out.println("Какой звук издает мышка? " + dog.getZvyki());
        System.out.println("Как передвигается мышки? " + dog.getHodit());
    }

    //писать здесь
}
