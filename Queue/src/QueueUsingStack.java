public class QueueUsingStack {

    Stack s1;
    Stack s2;

    //enqueue
    public void enqueue(int x) {
        if (s1.isEmpty() || s2.isEmpty()) {
            s1.push(x);
            System.out.println("The element is pushed in s1 :" + x);
        }
        else {
            return;
        }
    }

    //dequeue
    public void dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.popInt());
            }
            System.out.println("The element dequeue is: " + s2.popInt());
        } else if (s1.isEmpty()) {
            while (!s2.isEmpty()) {
                s1.push(s2.popInt());
            }
            System.out.println("The element dequeue is: " + s1.popInt());
        } else {
            System.out.println("Both the stacks s1 and s2 are empty hence, the elements can't be dequeue");
        }
    }
}
