public class Main {
    public static void main(String[] args) {

        Stack st = new Stack();
        st.push(1);
        st.push(3);
        st.push(2);

        System.out.printf("stack peek : %d\n", st.peek());

        st.push(6);

        st.pop();

        System.out.printf("stack size : %d\n", st.size());

        st.List();


    }
}
