package clases;

public class D implements A , B{

    public D() {
    }

    @Override
    public void hablar() {

            System.out.println("Soy D y estoy hablando");
    }



    @Override
    public void gritar() {

            System.out.println("SOY D Y ESTOY GRITANDO!!!");

    }
}



