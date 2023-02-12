public class Temperatures
{
    double Temperature;

    Temperatures(double temperature)
    {
        Temperatures=temperature;
    }

    public double CelsiusToKelvin()
    {
        return Temperature + 273.15;
    }

    public double CelsiusToFarenheit(){
        return (Temperature * 1.8000) + 32;
    }

    public double FarenheitToCelsius()
    {
        return (Temperature - 32) / 1.8000;
    }

    public double KelvinToCelsius()
    {
        return Temperature - 273.15;
    }

    public double FarenheitToKelvin()
    {
        return  (5/9) * (Temperature + 459.67);
    }

    public double KelvinToFarenheit()
    {
        return ((5/9) * Temperature) - 459.67;
    }

    public static void main(String[] args) {
        Temperatures t1 = new Temperatures(25)
        Temperatures t2 = new Temperatures(100)
        Temperatures t3 = new Temperatures(0)
    }
}