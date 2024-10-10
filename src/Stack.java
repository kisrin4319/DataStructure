//배열로 스택 구현해보기
public class Stack {

    int[] st = new int[10];

    int cursor = 0;


    //1. CREATE (PUSH)
    public void push(int x) {
        if (cursor >= st.length) {
            System.out.println("Stack overflow");
        }
        st[cursor] = x;
        cursor++;
    }
    //2. DELETE (POP)
    public int pop() {
        if (cursor == 0) {
            System.out.println("Stack underflow");
        }
        int value = st[cursor];
        cursor--;
        return value;
    }

    public void List() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < cursor; i++) {
            str.append(st[i]).append(",");
        }
        System.out.println(str);
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
}
