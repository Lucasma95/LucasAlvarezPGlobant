package clases;

public class D implements A , B{

    public D() {
    }

    @Override
    public void talk() {

            System.out.println("Soy D y estoy hablando");
    }



    @Override
    public void scream() {

            System.out.println("SOY D Y ESTOY GRITANDO!!!");

    }
}



