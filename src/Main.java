public class Main {

    public static void main(String[] args) {

        Professor eric = new Professor();
        Zelador zeca = new Zelador();
        Pedagogo maluco = new Pedagogo();


        System.out.println(eric.calcularSalario(10,10));
        System.out.println(zeca.calcularSalario(8, 8));
        System.out.println(maluco.calcularSalario(4,50));
    }

}
