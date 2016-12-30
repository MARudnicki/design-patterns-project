package hello.builder;

import java.util.Date;

/**
 * Created by Maciej Rudnicki on 29/12/2016.
 */
public class Wrapper {

    private String destination;

    private String departure;

    private Date time;

    private Integer max;

    public Wrapper(Builder builder) {
        this.destination = builder.destination;
        this.departure = builder.departure;
        this.time = builder.time;
        this.max = builder.max;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public Date getTime() {
        return time;
    }

    public Integer getMax() {
        return max;
    }

    public static class Builder{
        private String destination;

        private String departure;

        private Date time;

        private Integer max;

        public Builder destination(String destination){
            this.destination = destination;
            return this;
        }
        public Builder departure(String departure){
            this.departure = departure;
            return this;
        }
        public Builder time(Date date){
            this.time = date;
            return this;
        }
        public Builder max(Integer max){
            this.max = max;
            return this;
        }
        public Wrapper build(){
            return new Wrapper(this);
        }

    }
}
