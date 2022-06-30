public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;
    int pNote;
    int pVerbalNote;
    double averageNote = 0;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote=0;

    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else
            System.out.println("You cannot assign this teacher to the course.");
    }
    void printTeacher(){
        this.teacher.print();
    }



}
