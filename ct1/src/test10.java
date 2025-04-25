public class test10 {
    public static void main(String[] args) {
        new P2.p2().pub();
        new P2.p2().pro();

        P1.p1 p = new P2.p2();
        p.pro();
        p.pub();

    }
}