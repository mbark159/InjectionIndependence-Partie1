package presentation;

import dao.DaoImplV1;
import dao.DaoImplV2;
import dao.IDao;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
       // DaoImplV1 dao=new DaoImplV1();
        IDao dao=new DaoImplV2();     /// =>new: signifie Instanciation statique : couplage Fort
        MetierImpl metier=new MetierImpl(dao);// injection via constructeur

        //metier.setDao(dao); // Injection des dependances
        System.out.println("Res= "+metier.calcul());
    }
}
