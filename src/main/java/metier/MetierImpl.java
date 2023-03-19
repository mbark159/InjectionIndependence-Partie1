package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {
//    @Autowired
//    @Qualifier("DaoImplV1")
    private IDao dao;  // Couplage faible (basee sur les interfaces pas les classes)

    public MetierImpl(IDao dao){
        this.dao=dao;
    }
    @Override
    public double calcul() {
        double data=dao.getData();
        double res=data*11.3;
        return res;
    }

    /*
    * POUR L'INJECTION DES OBJETS DE TYPE IDAO
    * */

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
