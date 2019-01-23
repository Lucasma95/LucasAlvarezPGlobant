


package test;
import clases.*;
import org.junit.Test;

public class CTest {

//----------------------------------------hablar por C ------------------------------------------
    @Test
    public void hablarC() {


        C c = new C();
        try {
            c.hablar();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }



    //------------------------------------------hablar por D ------------------------------------

    @Test
    public void hablarD(){

        D d = new D();

        try {
            d.hablar();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //------------------------------------------gritar por D ------------------------------------


    @Test
    public void gritarD(){
        D d = new D();

        try {
            d.gritar();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}