public class Teacher {
    String name;
    String branch;
    String mpno;

    Teacher(String name, String branch, String mpno){
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }

    void print(){
        System.out.println("Adı : " + name);
        System.out.println("Dersi : " + branch);
        System.out.println("Telefon numarası : " + mpno);

    }
}
