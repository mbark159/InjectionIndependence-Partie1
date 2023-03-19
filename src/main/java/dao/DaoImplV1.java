package dao;

import org.springframework.stereotype.Component;

//@Component("DaoImplV1")
public class DaoImplV1 implements IDao{
    @Override
    public double getData() {
        System.out.println("------Version Base de Donnee------");
        double data=33;
        return data;
    }
}
