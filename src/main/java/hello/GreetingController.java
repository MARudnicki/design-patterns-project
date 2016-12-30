package hello;

import hello.builder.Wrapper;
import hello.domain.Flight;
import hello.factory.WSconnectorsFactory;
import hello.fasade.NotificationFasade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class GreetingController {

    @Autowired
    public GreetingController(WSconnectorsFactory factory, NotificationFasade notificationFasade) {
        this.factory = factory;
        this.notificationFasade = notificationFasade;
    }

    private WSconnectorsFactory factory;

    private NotificationFasade notificationFasade;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        return "greeting " + name;
    }

    @RequestMapping("/flights")
    public List<Flight> getFlights(
            @RequestParam(value = "dest", required = false, defaultValue = "destination") String destinationCode,
            @RequestParam(value = "dept", required = false, defaultValue = "departure") String departureCode,
            @RequestParam(value = "date", required = false, defaultValue = "12121912") @DateTimeFormat(pattern = "ddMMyyy") Date date,
            @RequestParam(value = "max", required = false, defaultValue = "1") Integer max,
            @RequestParam(value = "supplier", required = false, defaultValue = "first") String supplier
    ) {

        System.out.println(destinationCode);
        System.out.println(departureCode);
        System.out.println(date);
        System.out.println(max);
        System.out.println(supplier);

        Wrapper wrapper = new Wrapper.Builder()
                .departure(departureCode)
                .destination(destinationCode)
                .time(date)
                .max(max)
                .build();

        notificationFasade.sendNotification(wrapper);

        return factory
                .getSupplierService(supplier)
                .getFlights(wrapper);
    }


}
