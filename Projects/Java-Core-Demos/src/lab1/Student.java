package lab1;

public class Student {
    private int studentId;
    private String studentName;
    private String city;
    private int marks1;
    private int marks2;
    private int marks3;
    private float feePerMonth;
    private boolean isEligibleForScholarship;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public void setFeePerMonth(float feePerMonth) {
        this.feePerMonth = feePerMonth;
    }

    public void setIsEligibleForScholarship(boolean isEligibleForScholarship) {
        this.isEligibleForScholarship = isEligibleForScholarship;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCity() {
        return city;
    }

    public int getMarks1() {
        return marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public float getFeePerMonth() {
        return feePerMonth;
    }

    public boolean getIsEligibleForScholarship() {
        return isEligibleForScholarship;
    }


    public float getAnnualFee() {
        return feePerMonth * 12;
    }

    public int getTotalMarks() {
        return marks1 + marks2 + marks3;
    }

    public float getAverage() {
        return getTotalMarks() / 3.0f;
    }

    public String getResult() {
        if (marks1 > 60 && marks2 > 60 && marks3 > 60) {
            return "pass";
        } else {
            return "fail";
        }
    }


    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setStudentId(308);
        s1.setStudentName("Kiranmai");
        s1.setCity("Anantapur");
        s1.setMarks1(80);
        s1.setMarks2(75);
        s1.setMarks3(85);
        s1.setFeePerMonth(9900f);
        s1.setIsEligibleForScholarship(true);

        Student s2 = new Student();
        s2.setStudentId(318);
        s2.setStudentName("Nandana");
        s2.setCity("Bengaluru");
        s2.setMarks1(85);
        s2.setMarks2(62);
        s2.setMarks3(51);
        s2.setFeePerMonth(9200f);
        s2.setIsEligibleForScholarship(false);

        Student s3 = new Student();
        s3.setStudentId(359);
        s3.setStudentName("Hansika");
        s3.setCity("Hyderabad");
        s3.setMarks1(70);
        s3.setMarks2(84);
        s3.setMarks3(87);
        s3.setFeePerMonth(9500f);
        s3.setIsEligibleForScholarship(true);

        Student[] students = {s1, s2, s3};

        Student topStudent = students[0];
        for (Student s : students) {
            if (s.getTotalMarks() > topStudent.getTotalMarks()) {
                topStudent = s;
            }
        }
        System.out.println("Topper:" + topStudent.getStudentName());

        Student leastFeeStudent = students[0];
        for (Student s : students) {
            if (s.getFeePerMonth() < leastFeeStudent.getFeePerMonth()) {
                leastFeeStudent = s;
            }
        }
        System.out.println("least fee paying student:" + leastFeeStudent.getStudentName() + " pays" + leastFeeStudent.getFeePerMonth() + "  per month");

        System.out.println("Student Details");
        for (Student s : students) {
            System.out.println("Name:" + s.getStudentName());
            System.out.println("Total Marks:" + s.getTotalMarks());
            System.out.println("Average Marks:" + s.getAverage());
            System.out.println("Result:" + s.getResult());
            System.out.println("Eligibility:" + s.getIsEligibleForScholarship());
        }
    }
}

