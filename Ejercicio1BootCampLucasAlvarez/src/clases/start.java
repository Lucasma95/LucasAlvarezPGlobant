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

        ArrayList<A> list = new ArrayList<A>();

        //agrego los objetos a el ArrayList

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        //Creo un "Iterator" lo recorro y Ejecuto el metodo "whoiam" de cada objeto

        Iterator<A> it = list.iterator();

        while(it.hasNext()){
            A obj = it.next();
            System.out.println(obj.whoiam());
         }




    }




}
