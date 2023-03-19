package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("DaoImplV3")
public class DaoImplV3 implements IDao {
    @Override
    public double getData() {
        System.out.println("------Version Capteur------");
        double data=88;
        return data;
    }
}
