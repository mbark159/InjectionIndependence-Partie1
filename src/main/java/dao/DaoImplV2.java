package dao;

import org.springframework.stereotype.Component;

//@Component("DaoImplV2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("------Version Web Service------");
        double data=55;
        return data;
    }
}
