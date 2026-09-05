public class CarsAssemble {

    double successRate;
    final double MIN_PRODUCTION = 221;

    public void calculateSucessRate(int speed){
        if (1 <= speed && speed <= 4){
            successRate = 1;
        }else if (5 <= speed && speed <= 8){
            successRate = 0.90;
        }else if (speed == 9){
            successRate = 0.80;
        }else if (speed == 10){
            successRate = 0.77;
        }
    }
    
    public double productionRatePerHour(int speed) {
        calculateSucessRate(speed);
        return successRate * (MIN_PRODUCTION * speed);
    }

    public int workingItemsPerMinute(int speed) {
        int productionPerMin = (int) productionRatePerHour(speed) / 60;
        return productionPerMin;
    }
}
