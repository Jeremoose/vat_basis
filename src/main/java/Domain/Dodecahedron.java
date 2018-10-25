package Domain;

public class Dodecahedron extends Shape {
    private double edge;

    public Dodecahedron(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return this.edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public String toString() {
        return this.getType() + " " + this.getEdge() + " (" + String.format("%.2f", this.calculateVolume()) + ")";
    }

    @Override
    public double calculateVolume() {
        // Volume dodecahedron
        // (15+ 7* sqrt5) * 4 * a^3
        return ((15 + (7 * Math.sqrt(5))) / 4) * Math.pow(this.edge, 3);
    }
}
