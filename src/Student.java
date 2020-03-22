public class Student {

    public static int studentCount;
    public static int sumOfRatings;
    private String name;
    private int rating;

    // TODO implement Student class according to the instructions provided in the README.md file


    public Student(String name) {
        this.name = name;
        studentCount++;
        //TODO initialize name.
    }

    public Student() {
        studentCount++;// - ?
    }

    public static double getAvgRating() throws ArithmeticException {
        double avrRating = 0;
        if (studentCount > 0) {
            avrRating = (double) sumOfRatings / studentCount;
        }
        return avrRating;
        // TODO return average rating of all students
    }

    public static void removeStudent(Student student) {
        sumOfRatings = sumOfRatings - student.rating;
        studentCount--;// TODO remove student
    }

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setName("John");
        student1.setRating(75);

        Student student2 = new Student("Harry");
        student2.setRating(81);

        Student student3 = new Student();
        student3.setName("Tom");
        student3.setRating(92);

        System.out.println("The average rating of the students is " + getAvgRating() + ".");

        student2.changeRating(99);

        System.out.println("The new average rating of the students is " + getAvgRating() + ".");
    }

    public String getName() {
        return name;   // - passed
    }

    public void setName(String name) {
        this.name = name;  // TODO set student's
    }

    public int getRating() {
        return rating; // - passed
    }

    public void setRating(int rating) {
        this.rating = rating;
        sumOfRatings += rating;// TODO initialize rating;

    }

    public boolean betterStudent(Student student) {
        // TODO return the result of comparing this.student's rating with the student's rating
        return (this.rating > student.rating);
  }

  public void changeRating(int rating) {
      sumOfRatings -= this.rating;
      this.rating = rating;
      sumOfRatings += rating;// TODO change this student's rating and average rating of all students
  }

  @Override
  public String toString() {
    // TODO return String with name and rating of this student
      return ("The student's name is " + this.name + ", and his/her rating is " + this.rating + ".");
  }
}
