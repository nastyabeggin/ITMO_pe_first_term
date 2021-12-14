public abstract class Person implements Talkable{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String talk(String phrase) {
        return this.getName() + " говорит: '" + phrase + "'";
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Этого сказочного персонажа зовут " + this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person man = (Person) o;
        return hashCode() == man.hashCode();
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

}
interface Talkable {
    String talk(String phrase);
}