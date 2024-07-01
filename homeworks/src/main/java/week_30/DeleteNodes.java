package week_30;

/**
 * You are given the head of a linked list and two integers m and n. Traverse the linked list and remove some
 * nodes in the following way:
 * • Start with the head as the current node.
 * • Keep the first m nodes starting with the current node.
 * • Remove the next n nodes.
 * • Keep repeating steps 2 and 3 until you reach the end of the list.
 * Return the head of the modified list after removing the mentioned nodes.
 */

public class DeleteNodes {
    Node head;
    public static Node deleteNodes(Node head , int m, int n){
        Node current= head;
        while (current!=null) {
            for (int i = 0; i < m && current != null; i++) {
                current = current.next;
            }
            Node temp = current;
            for (int i = 0; i < n && temp != null; i++) {
                temp = temp.next;
            }
            current.next = temp;
            current = temp;
        }
return head;
    }

         void printNodes() {
            Node current = head;
            while (current != null) {
                if (current.next == null) {
                    System.out.println(current.val + "=> null");
                } else {
                    System.out.print(current.val + "=> ");
                }
                current = current.next;
            }
        }


        public static Node deleteNodes1(Node head, int m, int n){
        Node current= head;
        while(current != null){
            for(int i=0; i < m && current != null; i++){
                current =current.next;
            }

            Node temp= current;
            for (int i=0; i < n && temp != null; i++){
                temp.next= temp;
            }
            current.next= temp;
            current = temp;
        }
        return  head;
        }
    }


 /*   public static void main(String[] args) {
        printNodes();
      deleteNodes(new Node(1), 2,3);
      printNodes();

    }
}*/
