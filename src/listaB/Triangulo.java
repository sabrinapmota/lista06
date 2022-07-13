package listaB;
import java.util.Scanner;
public class Triangulo implements FiguraGeo {

    double alturaTriangulo;
    double baseTriangulo;
    double areaTriangulo;

    @Override
    public void calcularArea() {
        System.out.print("Digite base do triângulo");
        Scanner input = new Scanner(System.in);
        baseTriangulo = input.nextDouble();
        System.out.print("Digite altura do triângulo ");
        alturaTriangulo = input.nextDouble();

        areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;

        System.out.println("A area Triângulo é "+areaTriangulo);
    }
}