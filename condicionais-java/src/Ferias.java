public class Ferias {
    public static void main(String[] args) {

        switchSemana(3);
        ifFerias("dezembro");
        elseIfFerias("agosto");

    }

    public static void ifFerias(String mes) {
        if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
            System.out.println("Férias!");
        } else {
            System.out.println("Trabalho!");
        }
    }

    public static void elseIfFerias(String mes) {
        if (mes == "julho") {
            System.out.println("Férias!");
        } else if (mes == "dezembro") {
            System.out.println("Férias!");
        } else if (mes == "janeiro") {
            System.out.println("Férias!");
        } else {
            System.out.println("Trabalho!");
        }
    }

    public static void switchSemana(int dia) {

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido!");
                break;

        }
    }
}
