public class proverka {
    public static void main(String[] args){
        zveri cat = new Cat(true, "Трехшерстный", 4);
        System.out.println("У кошки есть волосеной покров ? " + cat.isVolosi());
        System.out.println("Какого цвета эта кошка? " + cat.getColor());
        System.out.println("Сколько лап у кошки? " + cat.getLapki());

        System.out.println();

        zveri mays = new Mays(true, "Серый", 4);
        System.out.println("Есть ли волосеной покров у мышки? " + mays.isVolosi());
        System.out.println("Какого цвета мышка? " + mays.getColor());
        System.out.println("Сколько лап у мышки? " + mays.getLapki());
    }

    //gbcfnm здесь писать
}
