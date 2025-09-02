package br.com.mariojp.solid.ocp;
import java.util.HashMap;
import java.util.Map;

public class DiscountCalculator {
    private final Map<CustomerType, Discont> policies = new HashMap<>();
    private final Discont defaultPolicy = new PartnerPolicy(); // Partner é default

    public DiscountCalculator() {
        policies.put(CustomerType.REGULAR, new RegularPolicy());
        policies.put(CustomerType.PREMIUM, new PremiumPolicy());
        // Partner não precisa ser adicionado no mapa, será usado como default
    }

    public double apply(double amount, CustomerType type) {
        Discont policy = policies.getOrDefault(type, defaultPolicy);
        return policy.apply(amount);
    }

    
    
    
}
