package Builder;

public class Student {
    private String name;
    private int age;
    private String batch;
    private  float psp;
    private  float attendance;

    private Student(String name, int age, String batch, float psp, float attendance) {
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.psp = psp;
        this.attendance = attendance;
    }

    private Student(Builder builder) {
        if (builder.getAge() > 150 || builder.getAge() < 0) {
            throw new IllegalArgumentException("Invalid Age");
        }
        if (builder.getPsp() < 0 || builder.getPsp() > 100) {
            throw new IllegalArgumentException("Invalid PSP");
        }
        if (builder.getAttendance() < 0 || builder.getAttendance() > 100) {
            throw new IllegalArgumentException("Invalid Attendance");
        }
        if (builder.getName() == null || builder.getName().isEmpty()) {
            throw new IllegalArgumentException("Invalid Name");
        }
        this.name =  builder.getName();
        this.age =  builder.getAge();
        this.batch =  builder.getBatch();
        this.psp =  builder.getPsp();
        this.attendance =  builder.getAttendance();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBatch() {
        return batch;
    }

    public float getPsp() {
        return psp;
    }

    public float getAttendance() {
        return attendance;
    }

    // Inner Class
    static class Builder {
        private String name;
        private int age;
        private String batch;
        private float psp;
        private float attendance;

        public Student build() {
            return new Student(this);
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public float getPsp() {
            return psp;
        }

        public Builder setPsp(float psp) {
            this.psp = psp;
            return this;
        }

        public float getAttendance() {
            return attendance;
        }

        public Builder setAttendance(float attendance) {
            this.attendance = attendance;
            return this;
        }
    }
}
