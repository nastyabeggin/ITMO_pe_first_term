public class Babies implements Describable{ // малыши
    public boolean are_separated = false;
    Squad squad1 = null;
    Squad squad2 = null;

    @Override
    public String describe() {
        String for_return = "";
        if (are_separated) for_return = "Малыши поделены на" + squad1.describe() + squad2.describe();
        else for_return = "Малыши вместе";
        return for_return;
    }
}
