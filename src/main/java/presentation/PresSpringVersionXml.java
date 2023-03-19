package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringVersionXml {
    public static void main(String[] args) {
        ApplicationContext sprinContext=new ClassPathXmlApplicationContext("config.xml");
        IMetier metier=(IMetier)sprinContext.getBean(IMetier.class);
        System.out.println("Res= "+metier.calcul());


    }
}
