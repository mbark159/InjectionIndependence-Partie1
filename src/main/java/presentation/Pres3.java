package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres3 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // DaoImplV2 dao=new DaoImplV2();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Saisir le nom de la classe DAO: ");
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao= (IDao) cDao.getConstructor().newInstance(); // => equvalent de new DaoImpl()

        // MetierImpl metier=new MetierImpl();
        System.out.print("Saisir le nom de la classe METIER: ");
        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier= (IMetier) cMetier.getConstructor().newInstance();

        // metier.setDao(dao); <== Injection de dependances STATIQUE
        // Injection de dependances
        Method setDao=cMetier.getDeclaredMethod("setDao",IDao.class);
        setDao.invoke(metier,dao); // <== Injection de dependances DYNAMIQUE


        System.out.println("Res= "+metier.calcul());

    }
}
