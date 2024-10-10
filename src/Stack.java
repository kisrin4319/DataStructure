//배열로 스택 구현해보기
public class Stack {

    int[] st = new int[10];

    int cursor = 0;


    //1. CREATE (PUSH)
    public void push(int x) {
        if (cursor >= st.length) {
            System.out.println("Stack overflow");
        }
        st[cursor++] = x;
    }
    //2. DELETE (POP)
    public void pop() {
        if (cursor == 0) {
            System.out.println("Stack underflow");
        }
        st[cursor--] = 0;
    }

    public int size() {
        return cursor;
    }

    public int peek() {
        if (cursor == 0) {
            return 0;
        }
        return st[cursor-1];
    }

    public boolean isEmpty() {
        return cursor == 0;
    }
}
