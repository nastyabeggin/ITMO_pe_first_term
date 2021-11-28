/*  Он привязал шар веревкой к ореховому кусту, чтобы не унесло ветром, после чего поделил малышей на два отряда.
    Одному отряду он велел собирать шелковичные коконы, чтобы размотать их и наделать шелковых нитей.
    Из этих нитей он велел им сплести огромную сетку.
    Другому отряду Знайка велел сделать большую корзину из тонкой березовой коры.
    Пока Знайка со своими товарищами занимался этой работой,
    все жители Цветочного города приходили и смотрели на огромнейший шар,
    который был привязан к ореховому кусту.
    Каждому хотелось потрогать шар руками, а некоторые даже пытались его приподнять. */

public class Main {
    public static void main(String[] args){
        //при л и нареч поля классов
        //глаголы методы этих классов
        //
        LittleBrainiac brainiac = new LittleBrainiac("Знайка");
        Rope rope = new Rope();
        Bush bush = new Bush();
        Ball ball = new Ball();
        brainiac.bind(rope, bush, ball);
        System.out.println(brainiac.describe() + ' ' + ball.describe());
        Wind wind = new Wind();
        wind.blow(ball.is_tied);
        System.out.println(wind.describe());
        Babies babies = new Babies();
        Squad squad1 = new Squad("1");
        Squad squad2 = new Squad("2");
        brainiac.separate(babies, squad1, squad2);

        System.out.println(brainiac.describe() + ' ' + babies.describe());

        Pods pods = new Pods();
        Thread thread = new Thread();
        Net net = new Net();
        System.out.println(squad1.getName() + " Отряд");
        brainiac.order(squad1, OrderType.СОБИРАТЬ);
        System.out.println(brainiac.describe() + ' ' + pods.describe() + squad1.describe() + " " +  pods.describe());
        brainiac.order(squad1, OrderType.РАЗМАТЫВАТЬ);
        System.out.println(brainiac.describe() + ' ' + pods.describe() + squad1.describe() + " " + pods.describe());
        brainiac.order(squad1, OrderType.СДЕЛАТЬ);
        System.out.println(brainiac.describe() + ' ' + thread.describe() + squad1.describe() + ' ' + thread.describe());
        brainiac.order(squad1, OrderType.СПЛЕСТИ);
        System.out.println(brainiac.describe() + ' ' + net.describe() + squad1.describe() + ' ' + net.describe());

        Basket basket = new Basket();
        Crust crust = new Crust();
        System.out.println(squad2.getName() + " Отряд");
        brainiac.order(squad2, OrderType.СДЕЛАТЬ);
        System.out.println(brainiac.describe() + ' ' + basket.describe() + " из " +  crust.describe());
        System.out.println(squad2.describe() + basket.describe() + " из " +  crust.describe());

        brainiac.refresh();
        brainiac.work();
        System.out.println(brainiac.describe());

        Residents residents = new Residents("Все");
        residents.come();
        residents.watch(ball);
        System.out.println(residents.getName() + residents.describe());

        Residents residents_2 = new Residents("Каждому");
        residents_2.touch(ball);
        System.out.println(residents_2.getName() + residents_2.describe());


        Residents residents_3 = new Residents("Некоторые");
        residents_3.triedToLift(ball);
        System.out.println(residents_3.getName() + residents_3.describe());

        LittleBrainiac new_one = new LittleBrainiac("Вася");
        LittleBrainiac sec_new_one = new LittleBrainiac("Вася");
        System.out.println(new_one.hashCode());
        System.out.println(sec_new_one.hashCode());

        System.out.println(new_one.equals(sec_new_one));
        System.out.println(new_one.toString());
    }
}
