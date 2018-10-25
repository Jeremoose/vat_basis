package Domain;

public class Torus extends Shape {
    private double majRadius;
    private double minRadius;

    public Torus(double majRadius, double minRadius) {
        this.majRadius = majRadius;
        this.minRadius = minRadius;
    }

    public double getMajRadius() {
        return this.majRadius;
    }

    public double getMinRadius() {
        return this.minRadius;
    }

    public void setMajRadius(double majRadius) {
        this.majRadius = majRadius;
    }

    public void setMinRadius(double minRadius) {
        this.minRadius = minRadius;
    }

    public String toString() {
        return this.getType() + " " + this.getMajRadius() + " " + this.getMinRadius() + " (" + String.format("%.2f", this.calculateVolume()) + ")";
    }

    @Override
    public double calculateVolume() {
        // volume torus
        // (pi*r^2)(2*pi*R)
        return (Math.PI * Math.pow(this.minRadius, 2)) * (2 * Math.PI * this.majRadius);
    }
}
