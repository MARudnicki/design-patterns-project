package hello.services;

import hello.builder.Wrapper;
import hello.domain.Flight;

import java.util.List;

/**
 * Created by Maciej Rudnicki on 29/12/2016.
 */
public interface SupplierService {

    List<Flight> getFlights(Wrapper wrapper);
}
