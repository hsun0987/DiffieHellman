public class Main {
    public static void main(String[] args) {
        DiffieHellman alice = new DiffieHellman();
        DiffieHellman bob = new DiffieHellman();

        //비밀키
        System.out.println("[Alice] PrivateKey: " + alice.getX());
        System.out.println("[Bob] PrivateKey: " + bob.getX());

        //공개키
        System.out.println("[Alice] PublicKey: " + alice.getY());
        System.out.println("[Bob] PublicKey: " + bob.getY());

        //키공유
        bob.setPeerPublicKey(alice.getY());
        alice.setPeerPublicKey(bob.getY());

        System.out.println("[Alice] Key: " + alice.getKey());
        System.out.println("[Bob] Key: " + bob.getKey());

        System.out.println(alice);
    }
}
