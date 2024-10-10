public class Main {
    public static void main(String[] args) {

        Stack st = new Stack();
        st.push(1);
        st.push(3);
        st.push(2);
        st.push(6);

        st.List();

        st.pop();

        st.List();
        System.out.printf("stack size : %d\n", st.size());

    }
}
