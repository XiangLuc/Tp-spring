package tp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tp1.DemandeConge;
import tp1.DemandeCongeSansModificateurs;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        DemandeConge demandeConge = (DemandeConge) applicationContext.getBean("demandeConge");
        DemandeCongeSansModificateurs demandeCongeSansModificateurs = (DemandeCongeSansModificateurs) applicationContext.getBean("demandeCongeSansModificateurs");

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

----------------------------------------------------------------------------------------------------------------

    Question

    Déclarer dans le fichier de configuration Spring un autre collaborateur c2 et
    lancer la classe de test.

    Que se passe t'il ?
    Une exception se déclenche, car on ne sait pas quel bean de Collaborateur est choisi.
    En gros, il y a une ambiguïté.


----------------------------------------------------------------------------------------------------------------

    Question

    Quelle annotation faut il utiliser pour lever l’ambigüité ?

    On doit utiliser l'annotation @Qualifier("nom_id_bean").

*/
