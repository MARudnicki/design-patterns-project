package hello.services;

import hello.builder.Wrapper;
import hello.domain.Flight;

import java.util.Collections;
import java.util.List;

/**
 * Created by Maciej Rudnicki on 28/12/2016.
 */
public class SupplierServiceFirst implements SupplierService {

    private static SupplierServiceFirst instance;

    private SupplierServiceFirst() {
    }

    public static SupplierServiceFirst getInstance(){
        if(instance == null){
            instance = new SupplierServiceFirst();
        }
        return instance;
    }

    @Override
    public List<Flight> getFlights(Wrapper wrapper) {
        Flight flight = new Flight();
        flight.setName("super flight");

        return Collections.singletonList(flight);
    }
}
