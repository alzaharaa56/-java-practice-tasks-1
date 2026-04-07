public class Task17 {
    public boolean inOrder(int a, int b, int c, boolean bok) {
if (bok) {
return c > b;
}
return b > a && c > b;
}
}

