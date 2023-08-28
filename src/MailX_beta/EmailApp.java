package MailX_beta;
public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("John","Smith");
//        Email em2 = new Email("Ashutosh","Kumar");
        em1.showInfo();
//        em2.showInfo();
        System.out.println(em1.showInfo());
//        System.out.println(Email.divide());
//        System.out.println(em2.showInfo());
    }
}