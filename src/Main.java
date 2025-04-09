public class Main {
    public static void main(String[] args) {

    /* 
     * static makes a variable or method belong to class 
     * rather than a specific object commonly used for utility methods
     * or shared resources
     */
        Friend friend1 = new Friend("Allen");   
        Friend friend2 = new Friend("Patrick");   
        
        System.out.println(Friend.numOfFriends);

    }
}
