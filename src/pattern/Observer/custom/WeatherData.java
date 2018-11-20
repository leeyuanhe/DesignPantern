package pattern.Observer.custom;

import java.util.ArrayList;

public class WeatherData implements Subject {


    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;



    public WeatherData(){
        observers = new ArrayList();
    }





    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer o = (Observer) observers.get(i);
            o.update(temperature,humidity,pressure);
        }
    }


    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
