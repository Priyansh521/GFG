class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        Node turtle = head;
        Node hare = head;
        while(hare != null && hare.next!= null){
            turtle = turtle.next;
            hare = hare.next.next;
            if(turtle == hare){
                return true;
            }
        }
        return false;
    }
}
