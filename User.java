public class User {
    public static void main(String[] args) {
        Files fl1 = new Files(20);
        Files fl2 = new Files(18);
        Files fl3 = new Files(10);
        Path path = new Path();
        Path path_ = new Path();

        path.add(fl3);
        path.add(fl2);
        path_.add(fl1);
        System.out.println(path.fileSystem() + path_.fileSystem());
       // System.out.println();



    }
}
