package listaB;

    import java.util.Scanner;

public class Retangulo implements FiguraGeo {

    double alluraRetangulo;
    double baseRetabgulo;
    double areaRetangulo;



    @Override
    public void calcularArea() {
        System.out.print("Digite base do retângulo");
        Scanner input = new Scanner(System.in);
        baseRetabgulo = input.nextDouble();
        System.out.print("Digite altura do retângulo");
        alluraRetangulo = input.nextDouble();

        areaRetangulo = baseRetabgulo * alluraRetangulo;

        System.out.println("A área total Retângulo é "+areaRetangulo);
    }
}