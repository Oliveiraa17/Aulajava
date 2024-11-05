public class TesteCaneta {

    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();

        caneta1.modelo = "esferografico";
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.carga = 90;
       /* caneta1. tampada = false; */


        caneta1.tampar();
        caneta1.estado();
        caneta1.rabiscar();

        System.out.println("--------------------------------------------------------------------------------------------");


        Caneta caneta2 = new Caneta();

        caneta2.modelo = "hidrografica";
        caneta2.cor = "Vermelha";
        caneta2.ponta = 0.7f;
        caneta2.carga = 20;
        /* caneta1. tampada = false; */


        caneta2.tampar();
        caneta2.estado();
        caneta2.rabiscar();
    }

}
