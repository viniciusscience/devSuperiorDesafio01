package devsuperior1.com.desafio1.services;

import devsuperior1.com.desafio1.entity.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){
        double basic = order.getBasic();
        if (basic < 100.0) {
            order.setBasic(basic + 20.0);
        } else if(basic >= 100.0 && basic < 200.0){
            order.setBasic(basic +12.0);
        }
        // Else condition removed as it doesn't change anything
        return order.getBasic();
    }
    }

