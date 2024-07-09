package animal;

public class Human extends Animal implements Thinkable{

    private String hobby;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Human() {
    }

    public Human(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }



    @Override
    public void think() {
        super.say();

        System.out.println("私は、"+hobby+"について考えています。");
    }

}