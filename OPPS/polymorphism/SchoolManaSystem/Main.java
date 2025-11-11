class User {
    void dashboard() {
        System.out.println("Generic User dashboard");
    }
}

class Student extends User {
    void dashboard() {
        System.out.println("Studnet dashboard with assignments");
    }
}

class Teacher extends User {
    void dashboard() {
        System.out.println("Teacher dashboard with full control");
    }
}

public class Main {
    public static void main(String[] args) {
        User user = new Teacher();
        user.dashboard();
    }
}
