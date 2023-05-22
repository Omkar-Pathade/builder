package org.example;

public class Student {
    private String name;
    private Long id;
    private String schoolName;
    private String schoolAddress;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    private Student(StudentBuilder builder) {
        this.schoolName = builder.schoolName;
        this.name = builder.name;
        this.id = builder.id;
        this.schoolAddress = builder.schoolAddress;
    }

    public static class StudentBuilder {
        private String name;
        private Long id;
        private String schoolName;
        private String schoolAddress;

        public StudentBuilder(String name, Long id) {
            this.name = name;
            this.id = id;
        }

        public StudentBuilder setSchoolAddress(String schoolAddress) {
            this.schoolAddress = schoolAddress;
            return this;
        }

        public StudentBuilder setSchoolName(String schoolName) {
            this.schoolName = schoolName;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Name: "+name
                +"\nCollegeName: "+ schoolName
                +"\nSchool Address: "+schoolAddress
                +"\nId: "+id;
    }
}
