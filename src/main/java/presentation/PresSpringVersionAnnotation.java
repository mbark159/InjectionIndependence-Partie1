package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class PresSpringVersionAnnotation {
    public static void main(String[] args) {
        ApplicationContext springAnnotationContext=new AnnotationConfigApplicationContext("dao","metier");
        IMetier metier=springAnnotationContext.getBean(IMetier.class);
        System.out.println("Res= "+metier.calcul());
    }
}
