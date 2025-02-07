package tp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tp1.Collaborateur;
import tp1.DemandeConge;
import tp1.DemandeCongeSansModificateurs;
import tp1.Periode;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Collaborateur collaborateur = (Collaborateur) applicationContext.getBean("c");
        Periode periode = (Periode) applicationContext.getBean("p");
        DemandeConge demandeConge = (DemandeConge) applicationContext.getBean("demandeConge");
        DemandeCongeSansModificateurs demandeCongeSansModificateurs = (DemandeCongeSansModificateurs) applicationContext.getBean("demandeCongeSansModificateurs");

        System.out.println(collaborateur);
        System.out.println(periode);
        System.out.println(demandeConge);
        System.out.println(demandeCongeSansModificateurs);

    }
}

/*
    Questions

    Que se passe t'il lorsque l'injection des collaborateurs dans « DemandeConge »
    est faite « byName » ?

    Les valeurs sont null lors du test.

    Que faudrait-il changer pour pouvoir utiliser ce type d'injection?

    Pour utiliser ce type d'injection il faut que les variables de la classe DemandeConge.java ait les meme noms
    que les id des beans de Periode et Collaborateur soit p et c.


*/
