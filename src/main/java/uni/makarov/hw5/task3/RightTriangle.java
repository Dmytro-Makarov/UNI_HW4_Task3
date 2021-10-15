package uni.makarov.hw5.task3;

public class RightTriangle extends Triangle{
    RightTriangle(double sideA,double sideB,double angle){
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
    }

    @Override
    double calcArea() {
        if(angle==90) {
            return sideA * sideB / 2.0;
        } else{
            return sideA*sideB*Math.sin(Math.toRadians(angle))/2.0;
        }
    }

    @Override
    double calcPerimeter() {
        double perimeter = sideA + sideB + Math.sqrt(sideB*sideB + sideA*sideA - 2.0*sideA*sideB*Math.cos(Math.toRadians(angle)));
        return perimeter;
    }


}
