package Builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setName("Aniket")
                .setAge(24)
                .setAttendance(95)
                .setPsp(89)
                .setBatch("April23")
                .build();

    }
}
