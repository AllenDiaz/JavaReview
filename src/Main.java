public class Main {
    public static void main(String[] args) {

        /* 
         * overloaded constructor = Allow a class to have multiple constructor
         *                          with different paramete lists.
         *                          Enable objects to be initialized in various ways.
         */

        User user1 = new User("Spongebob") ;
        User user2 = new User("allen", "allen.developer@gmail.com");

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);
    }
}
