public class LeaveApp {
    // Logic: Validate if leave days requested are positive and within balance
    public static boolean validateLeave(int balance, int requested) {
        if (requested <= 0) return false; 
        return balance >= requested;
    }

    public static void main(String[] args) {
        System.out.println("Leave Management System Active!");
    }
}