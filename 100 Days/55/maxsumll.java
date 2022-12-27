import java.util.Scanner;

class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { 
        this.val = val; 
    }
    ListNode(int val, ListNode next){
        this.val = val; this.next = next;
    }
}
public class maxsumll{
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        while(head!=null){
            ListNode next = head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
    public ListNode findMid(ListNode head){
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public int pairSum(ListNode head) {
        ListNode temp = findMid(head);
        ListNode rev = reverseList(temp);
        int sum = 0, max = -Integer.MAX_VALUE;
        while(rev != null){
            sum = head.val + rev.val;
            // System.out.println(sum);
            if(max < sum){
                max = sum;
            }
            head = head.next;
            rev = rev.next;
        }
        return max;
    }
        // while(temp != null){
        //     temp = temp.next;
        //     n++;
        // }
        public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
    }
}