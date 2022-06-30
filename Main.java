public class Main {

    public static void main(String[] args) {
	Teacher teacher1 = new Teacher("Domo","PHY","456645645");
	Teacher teacher2 = new Teacher("Mahmut Hoca","CHE","553486");
	Teacher teacher3 = new Teacher("Ali Yıldız","MAT","45783");

	Course physics = new Course("Pyhsics","101","PHY");
	physics.addTeacher(teacher1);
	Course math = new Course("Math","102","MAT");
	math.addTeacher(teacher3);

	Course chemistry = new Course("Chemistry","103","CHE");
	chemistry.addTeacher(teacher2);

	Student s1 = new Student("İnek Şaban","154","3",math,physics,chemistry);
	s1.addPercentage(20,80,50,50,60,40);
	s1.addBulkExamNotes(100,100,90,90,55,95);
	s1.printNote();
	s1.isPass();


	}
}
