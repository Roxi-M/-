public class Rooms implements Comparable {
    private int clas;
    private String name;
    private int num;
    private int age;
    private String sex;
    public Rooms(int i, String yaoyao){

    }
    public Rooms(int clas,String name,int num,int age,String sex){
        this.clas=clas;
        this.name=name;
        this.num=num;
        this.age=age;
        this.sex=sex;
    }
    public int getClas() {
        return clas;
    }
    public String getName(){
        return name;
    }

    public int getNum() {
        return num;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

}
