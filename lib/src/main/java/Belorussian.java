public class Belorussian extends Human{

    public static void main(String[] args) {
        Belorussian belorussian = new Belorussian();
        German german = new German();
        belorussian.speak_language();
        german.speak_language();
    }
    @Override
    void speak_language() {
        System.out.println("Speak B language");
    }
}



class German extends Human{

    @Override
    void speak_language() {
        System.out.println("Speak German language");
    }
}
abstract class Human{
    abstract void speak_language();

}