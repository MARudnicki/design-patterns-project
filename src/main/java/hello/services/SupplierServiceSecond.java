package hello.services;

import hello.builder.Wrapper;
import hello.domain.Flight;

import java.util.List;

/**
 * Created by Maciej Rudnicki on 29/12/2016.
 */
public class SupplierServiceSecond implements SupplierService{

    private static SupplierServiceSecond instance;

    private SupplierServiceSecond() {
    }

    public static SupplierServiceFirst getInstance(){
        throw new RuntimeException("SuplierServiceSecond is still in build...");
    }

    @Override
    public List<Flight> getFlights(Wrapper wrapper) {
        return null;
    }
}
