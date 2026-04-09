import java.util.List;

public class FabriqueChambre {
    public static Chambre creerChambreDouble(String code) {
        return new Chambre(
            code,
            2,
            TypeChambre.DOUBLE,
            List.of(
                new Lit("L1"),
                new Lit("L2")
            )
        );
    }

    public static Chambre creerChambreStandard(String code) {
        return new Chambre(
            code,
            4,
            TypeChambre.STANDARD,
            List.of(
                new Lit("A"),
                new Lit("B"),
                new Lit("C"),
                new Lit("D")
            )
        );
    }
}
