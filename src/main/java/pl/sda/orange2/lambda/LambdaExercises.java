package pl.sda.orange2.lambda;

public class LambdaExercises {
    public static void main(String[] args) {

        // metoda sing() nie zadziała gdyż w interfejsie nie jest zainicjalizowana ta metoda a obiekt jest tego interfejsu
        BoysDontCry boy = new ChlopakiNiePlacza();
        boy.silnoreki();
        //boy.sing(); <---- to nie zadziałą
        // zadziała jedynie przez rzutowanie
        ((ChlopakiNiePlacza) boy).sing();

        ChlopakiNiePlacza boy2 = new ChlopakiNiePlacza();
        boy2.sing();

        // klasa anonimowa
        BoysDontCry anonymousClassReference = new BoysDontCry() {
            @Override
            public void silnoreki() {
                System.out.println("Anonimoy silnoreki");
            }
        };
        anonymousClassReference.silnoreki();

        // () parenthesis - arguments list
        // -> arguments, body separator
        // {} parenthesis - method body
        BoysDontCry firstLambda = () -> System.out.println("lambda silnoreki");
        firstLambda.silnoreki();

        BoysDontCry secondLambda = () -> {
            System.out.println("one");
            System.out.println("second");
        };

        System.out.println("--------------------");
        System.out.println("Coffe time");

        CoffeeMaker myCoffeeMaker = (int water, String coffeType) -> "my coffee";
        CoffeeMaker myCoffeeMaker2 = (int water, String coffeType) -> {
            return "my coffee";
        };
        CoffeeMaker myCoffeeMaker3 = (int water, String coffeType) -> {
            System.out.println("Coffee brewing...");
            return "my coffee";
        };

        CoffeeMaker shortVersion = (water, coffeeType) -> "my coffee";

        myCoffeeMaker3.prepare(3, "Black");
        shortVersion.prepare(5, "White");

    }
}
