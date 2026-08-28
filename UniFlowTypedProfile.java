public class UniFlowTypedProfile {
    public static void main(String[] args) {
        final int MAX_SEMESTERS = 8;
        final double MIN_ATTENDANCE_PERCENT = 75.0;

        String studentId = "U26A001";
        String studentName = "Asha Rao";
        String department = "CSE";
        int semester = 1;
        double attendancePercent = 82.5;
        char sectionCode = 'A';
        boolean feePaid = true;
        long applicationNumber = 2026000001L;

        System.out.println("=== UniFlow Typed Profile ===");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student name: " + studentName);
        System.out.println("Department: " + department);
        System.out.println("Semester: " + semester);
        System.out.println("Attendance percent: " + attendancePercent);
        System.out.println("Section code: " + sectionCode);
        System.out.println("Fee paid: " + feePaid);
        System.out.println("Application number: " + applicationNumber);
        System.out.println("Maximum semesters: " + MAX_SEMESTERS);
        System.out.println("Minimum attendance percent: " + MIN_ATTENDANCE_PERCENT);
    }
}