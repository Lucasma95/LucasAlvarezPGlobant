


package test;
import clases.*;
import org.junit.Test;

public class CTest {

//----------------------------------------talk by C ------------------------------------------
    @Test
    public void talkC() {


        C c = new C();


            c.talk();



    }



    //------------------------------------------talk by D ------------------------------------

    @Test
    public void talkD(){

        D d = new D();

            d.talk();


    }

    //------------------------------------------scream by D ------------------------------------


    @Test
    public void gritarD(){
        D d = new D();


            d.scream();


    }


}