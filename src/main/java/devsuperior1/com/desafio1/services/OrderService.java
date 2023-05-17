package devsuperior1.com.desafio1.services;

import devsuperior1.com.desafio1.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;
    public double total(Order order){
        var desconto = order.getDiscount() * order.getBasic() / 100;
        return shippingService.shipment(order) - desconto;
    }
}
