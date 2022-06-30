public class Student {
    String name;
    String number;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double average;
    boolean isPass;

    Student(String name, String number, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.number = number;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addPercentage(int pNote1, int pVerbalNote1, int pNote2, int pVerbalNote2, int pNote3, int pVerbalNote3) {
        if (pNote1 + pVerbalNote1 > 100 || pNote2 + pVerbalNote2 > 100 || pNote3 + pVerbalNote3 > 100) {
            System.out.println("The total of the percentages can't be over 100");
        }
        else {
            c1.pNote = pNote1;
            c1.pVerbalNote = pVerbalNote1;
            c2.pNote = pNote2;
            c2.pVerbalNote = pVerbalNote2;
            c3.pNote = pNote3;
            c3.pVerbalNote = pVerbalNote3;
        }
    }


    void addBulkExamNotes(int note1,int verbalNote1, int note2,int verbalNote2,int note3,int verbalNote3){
        if(note1>=0 && note1<=100)
            c1.note = note1;
        if(verbalNote1>=0 && verbalNote1<=100)
            c1.verbalNote = verbalNote1;
        c1.averageNote = (c1.note*c1.pNote + c1.verbalNote*c1.pVerbalNote)/100.0;
        if(note2>=0 && note2<=100)
            c2.note = note2;
        if(verbalNote2>=0 && verbalNote2<=100)
            c2.verbalNote = verbalNote2;
        c2.averageNote = (c2.note*c1.pNote + c2.verbalNote*c2.pVerbalNote)/100.0;
        if(note3>=0 && note3<=100)
            c3.note = note3;
        if(verbalNote3>=0 && verbalNote3<=100)
            c3.verbalNote = verbalNote3;
        c3.averageNote = (c3.note*c3.pNote + c3.verbalNote*c3.pVerbalNote)/100.0;
    }
    void isPass() {
        this.average = ((c1.averageNote + c2.averageNote + c3.averageNote) / 3.0);
        System.out.println("------------------");
        if (this.average >= 55) {
            System.out.println("Passed the class with " + this.average + " note");
            this.isPass = true;
        } else {
            System.out.println("You failed the class with " + this.average + " note");

            this.isPass = false;
        }
        System.out.println("------------------");
    }
    void printNote(){
        System.out.println(c1.name + " : " + c1.averageNote);
        System.out.println(c2.name + " : " + c2.averageNote);
        System.out.println(c3.name + " : " + c3.averageNote);
    }
}
