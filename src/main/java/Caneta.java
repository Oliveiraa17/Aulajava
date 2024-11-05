public class Caneta {

    String modelo;
    String cor;
    float ponta; /* numero quebrado */
    int carga; /* numero inteiro */
    boolean tampada;

    void rabiscar(){

        if(tampada == true){
            System.out.println("Erro! A caneta está tampada!");
        }else{
            System.out.println("Pode rabiscar a vontade!");
        }

    }
    void tampar(){
        tampada = true;
    }

    void destampar(){
        tampada = false;
    }

    void estado(){
        System.out.println("Esta caneta é do modelo: " + modelo);
        System.out.println("Esta caneta tem a cor: " + cor);
        System.out.println("Esta caneta tem a ponta: " + ponta);
        System.out.println("Esta caneta está com a carga em: " + carga + "%");
        System.out.println("Esta caneta está tampada: " + tampada);

    }


}
