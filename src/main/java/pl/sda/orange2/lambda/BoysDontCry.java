package pl.sda.orange2.lambda;

//to jest interfejs funkcyjny poniewaz ma jedna abstrakcyjna metodę
@FunctionalInterface
public interface BoysDontCry {
    void silnoreki();

    default void cry() {

    }
}
