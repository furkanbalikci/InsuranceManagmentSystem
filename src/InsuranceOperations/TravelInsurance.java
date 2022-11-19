package InsuranceOperations;

import java.util.Date;

public class TravelInsurance extends Insurance{
    public TravelInsurance(String insuranceType) {
        super("Seyahat sigortası", new Date(), new Date());
        calculate(insuranceType);
    }

    @Override
    public void calculate(String insuranceType) {
        double price=699.99;
        if(insuranceType.equals("Individual"))
        {
            setPrice(price);
        }
        if(insuranceType.equals("Enterprise")){
            setPrice(price*0.9);
        }
    }
}
