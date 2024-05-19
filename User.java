public class User {

    public static void main(String[] args) {

        PrxyShell proxyShell = new PrxyShell();
        proxyShell.run("Anything", "user");
        proxyShell.run("rm -rf", "user");
        proxyShell.run("rm -rf", "admin");

    }
}
