package InsuranceOperations;

import java.util.Calendar;
import java.util.Date;

public class HealthInsurance extends Insurance{


    public HealthInsurance(String insuranceType) {
        super("Sağlık sigortası", new Date(), new Date());
        calculate(insuranceType);
    }

    @Override
    public void calculate(String insuranceType) {
        double price=999.99;
        if(insuranceType.equals("Individual"))
        {
            setPrice(price);
        }
        if(insuranceType.equals("Enterprise")){
            setPrice(price*0.9);
        }
    }

}
