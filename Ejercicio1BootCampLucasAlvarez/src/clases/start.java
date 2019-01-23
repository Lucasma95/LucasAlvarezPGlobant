package clases;


import java.util.ArrayList;
import java.util.Iterator;

public class start {

    public static void main (String args[]){

        //Creo los objetos

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        //creo el ArrayList

        ArrayList<A> lista = new ArrayList<A>();

        //agrego los objetos a el ArrayList

        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);

        //Creo un "Iterator" lo recorro y Ejecuto el metodo "whoiam" de cada objeto

        Iterator<A> it = lista.iterator();

        while(it.hasNext()){
            A obj = it.next();
            System.out.println(obj.whoiam());
         }




    }




}
