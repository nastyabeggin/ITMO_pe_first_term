/*  Всем нашлась возле шара работа, а Незнайка только ходил вокруг да посвистывал.
Он старался держаться от шара подальше, поглядывал на него издали и приговаривал:
— Лопнет пузырь! Вот сейчас, сейчас лопнет! Уф!
Но шар не лопался, а с каждой минутой становился всё больше и больше. Скоро он раздулся такой большой,
 что малышам приходилось взбираться на ореховый куст, который рос посреди двора, чтобы обмазывать шар сверху и по бокам.
Работа по надуванию шара продолжалась два дня и прекратилась тогда, когда шар стал величиной с дом.
 После этого Знайка завязал верёвочкой резиновую трубку, которая была снизу, чтобы из шара не выходил воздух, и сказал:
— Теперь шар будет сохнуть, а мы с вами примемся за другую работу.
Он привязал шар верёвкой к ореховому кусту, чтобы не унесло ветром, после чего поделил малышей на два отряда.
Одному отряду он велел собирать шелковичные коконы, чтобы размотать их и наделать шёлковых нитей.
Из этих нитей он велел им сплести огромную сетку.
Другому отряду Знайка велел сделать большую корзину из тонкой берёзовой коры.
Пока Знайка со своими товарищами занимался этой работой,
все жители Цветочного города приходили и смотрели на огромнейший шар, который был привязан к ореховому кусту. Каждому хотелось потрогать шар руками, а некоторые даже пытались его приподнять.
— Шар лёгкий, — говорили они, — его свободно можно поднять кверху одной рукой.
— Лёгкий-то он лёгкий, но, по-моему, он не полетит, — сказал малыш, по имени Топик.
— Почему не полетит? — спросили остальные.
— Как же он полетит? Если бы он мог летать, то взвивался бы кверху, а он просто лежит на земле. Значит, хоть он и лёгкий, а всё-таки тяжёлый, — ответил Топик.
Коротышки задумались.
— Гм! Гм! — говорили они. — Шар лёгкий, а всё-таки тяжёлый. Это верно. Как же он полетит?*/
/* Description of nested classes
pipe is a local inner class inside ball
pods is non-static nested class inside net
thread is static nested class inside net
finally, there is anonymous class residents in main
*/

public class Main {
    public static void main(String[] args) {

        Ball ball = new Ball();

        Residents residents = new Residents("Все");
        residents.come();
        try {
            residents.touch(ball);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Привязан ли шар? " + ball.is_tied);
        }
        System.out.println(residents.getName() + residents.describe());

        LittleBrainiac brainiac = new LittleBrainiac("Знайка");
        Squad squad = new Squad("занятой отряд");
        try {
            brainiac.order(squad, OrderType.РАЗМАТЫВАТЬ);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(squad.describe());
        }
        try {
            brainiac.order(squad, OrderType.СПЛЕСТИ);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(squad.describe());
        }

        System.out.println(brainiac.talk(brainiac.phrases_of_brainiac[0]));
        System.out.println(residents.talk(residents.phrases_of_residents[0]));
        Rope rope = new Rope();
        Bush bush = new Bush();
        ball.tied(rope, bush);
        System.out.println(ball.describe());

        Net net = new Net();
        System.out.println(net.describe());
        System.out.println(net.describe_thread());
        System.out.println(net.describe_pods());

        Residents residents_1 = new Residents("Коротышки"){
            @Override
            public String describe(){

                return this.getName() + " задумались";
            }
        };

        Residents residents_2 = new Residents("Жители Цветочного города"){
            @Override
            public String describe(){

                return this.getName() + " приходили и смотрели на шар";
            }
        };
        System.out.println(residents_1.describe());
        System.out.println(residents_2.describe());
        /* Ball ball = new Ball();

        Residents residents = new Residents("Все");
        residents.come();
        residents.touch(ball);
        System.out.println(residents.getName() + residents.describe()); *\ \\пример с необработанным исключением


        /*LittleBrainiac brainiac = new LittleBrainiac("Знайка");
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

        Thread thread = new Thread();
        Thread.Pods pods = new thread.Pods();

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
        System.out.println(new_one.toString()); */
    }
}
