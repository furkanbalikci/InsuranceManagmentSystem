package InsuranceOperations;

import java.time.LocalDateTime;
import java.util.Date;

public class ResidenceInsurance extends Insurance{
    public ResidenceInsurance(String insuranceType) {
        super("Konut sigortası", new Date(), new Date());
        calculate(insuranceType);
    }

    @Override
    public void calculate(String insuranceType) {
        double price=2999.99;
        if(insuranceType.equals("Individual"))
        {
            setPrice(price);
        }
        if(insuranceType.equals("Enterprise")){
            setPrice(price*0.9);
        }
    }
}
