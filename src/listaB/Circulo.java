package listaB;

import java.util.Scanner;

public class Circulo implements FiguraGeo {


    double pi = 3.14;
    double diametro;
    double raio;
    double areaCirculo;


    @Override
    public void calcularArea() {
        System.out.print("Digite a medida do diâmetro do círculo");
        Scanner input = new Scanner(System.in);
        diametro = input.nextDouble();
        raio = diametro / 2;

        areaCirculo = pi * (raio * raio);

        System.out.println("Considerando que a área total " + areaCirculo);

    }
}