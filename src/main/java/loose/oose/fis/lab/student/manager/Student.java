package loose.oose.fis.lab.student.manager;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double meanGrade;

    public Student(String firstName, String lastName, int age, double meanGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.meanGrade = meanGrade;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", meanGrade=" + meanGrade +
                '}';
    }

    public boolean equals(Object object) {
        if (!(object instanceof Student)) return false;
        if (!super.equals(object)) return false;
        Student student = (Student) object;
        return age == student.age && java.lang.Double.compare(meanGrade, student.meanGrade) == 0 && java.util.Objects.equals(firstName, student.firstName) && java.util.Objects.equals(lastName, student.lastName);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), firstName, lastName, age, meanGrade);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
          return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMeanGrade() {
        return meanGrade;
    }

    public void setMeanGrade(double meanGrade) {
        this.meanGrade = meanGrade;
    }
}