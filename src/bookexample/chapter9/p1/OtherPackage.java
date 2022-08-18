package bookexample.chapter9.p1;

public class OtherPackage {
    OtherPackage() {
        Protection p = new Protection();
        System.out.println("кoнcтpyктop из другого пакета");
        System.out.println("n_pub = " + p.n_pub);
    }
}
