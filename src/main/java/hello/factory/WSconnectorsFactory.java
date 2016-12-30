package hello.factory;

import org.springframework.stereotype.Component;
import hello.services.SupplierService;
import hello.services.SupplierServiceFirst;
import hello.services.SupplierServiceSecond;

/**
 * Created by Maciej Rudnicki on 29/12/2016.
 */

@Component
public class WSconnectorsFactory {

    public SupplierService getSupplierService(String name){

        switch (name){
            case "first" : return SupplierServiceFirst.getInstance();

            case "second" : return SupplierServiceSecond.getInstance();

            default: throw new RuntimeException(String.join(" ","There's no",name,"supplier"));

        }
    }

}
