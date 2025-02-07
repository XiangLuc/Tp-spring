package tp1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import tp1.Collaborateur;
import tp1.DemandeConge;
import tp1.DemandeCongeSansModificateurs;
import tp1.Periode;

public class Main {
    public static void main(String[] args) {

        // Test pour le TP 1 :

        // Ancienne manière déprécier :
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));

        DemandeConge demandeConge = (DemandeConge) beanFactory.getBean("demandeConge");

        System.out.println("Demande conge 1 : " + demandeConge);

        DemandeConge demandeConge2 = (DemandeConge) beanFactory.getBean("demandeConge");

        System.out.println("Demande conge 2 : " + demandeConge2);

        DemandeCongeSansModificateurs demandeCongeSansModif = (DemandeCongeSansModificateurs) beanFactory.getBean("demandeCongeSansModificateurs");

        System.out.println("Demande conge sans modif : " + demandeCongeSansModif);

        /*
        //Nouvelle manière :
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Collaborateur collaborateur = (Collaborateur) applicationContext.getBean("c");
        Periode periode = (Periode) applicationContext.getBean("p");
        DemandeConge demandeConge = (DemandeConge) applicationContext.getBean("demandeConge");

        System.out.println(collaborateur);
        System.out.println(periode);
        System.out.println(demandeConge);
         */
    }
}

/*
    Portée des Beans :
    Dans la classe de test, récupérer une seconde fois le Bean « demandeConge »
    (variable « demandeConge2 ») et l'afficher sur la sortie standard.

    Que constate t-on ?

    On constate qu'on a la meme instance pour les deux objets.
    Car les beans par défaut sont en singleton.
----------------------------------------------------------------------------------------------------------------
    Question :
    Que faut-il ajouter à la définition des Beans pour qu'ils soient instanciés à
    chaque demande ?

    Il faut modifié le scope de mon bean par "prototype" pour créer une nouvelle instance à chaque fois.

----------------------------------------------------------------------------------------------------------------

    Question :
    Que se passe t'il si on inverse les références au niveau des « constructor-arg » ?

    Le fichier indique une erreur car le référencement correspond pas aux arguments du constructeur.

    Néanmoins si on retire les index, et qu'on inverse les références ça va marcher.
*/