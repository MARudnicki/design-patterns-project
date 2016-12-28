package services;

import domain.Flight;
import ws.Supplier1WS;
import ws.Supplier2WS;

import java.util.Collections;
import java.util.List;

/**
 * Created by Maciej Rudnicki on 28/12/2016.
 */
public class SupplierService {

    private static SupplierService instance;

    private static Supplier1WS supplier1WS;

    private static Supplier2WS supplier2WS;

    private SupplierService() {
        SupplierService.supplier1WS = new Supplier1WS();
        SupplierService.supplier2WS = new Supplier2WS();
    }

    public static SupplierService getInstance(){
        if(instance == null){
            instance = new SupplierService();
        }
        return instance;
    }

    public List<Flight> getFlights(){

        return Collections.singletonList(new Flight());
    }
}
