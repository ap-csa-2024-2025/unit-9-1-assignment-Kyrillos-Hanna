public class SpecialtyCoffee extends Coffee {
    private String flavor;

    public SpecialtyCoffee(String flavor, String size, boolean isSkinny, int shots, String type ) {
        super(size, isSkinny, shots, type);
        this.flavor = flavor;
    }

    public SpecialtyCoffee(String size, String type, String flavor) {
        this(flavor, size, false, 1, type);
    }



    public SpecialtyCoffee() {
        flavor = "vanilla";
    }

    public String toString() {
        return (this.toString() + " with " + flavor);
    }
    
}