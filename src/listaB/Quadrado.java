package listaB;

import java.util.Scanner;

public class Quadrado implements FiguraGeo {

    double baseQuadrado;
    double alturaQuadrado;
    double areaQuadrado;


    @Override
    public void calcularArea() {
        System.out.print("Digite base do Quadrado");
        Scanner input = new Scanner(System.in);
        baseQuadrado = input.nextDouble();
        System.out.print("Digite altura do Quadrado");
        alturaQuadrado = input.nextDouble();

        areaQuadrado = baseQuadrado * alturaQuadrado;

        System.out.println("A área total Quadrado é " + areaQuadrado);

    }

}