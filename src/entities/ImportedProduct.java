package entities;

public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct(Double price, String name, Double customsFee) {
        super(price, name);
        this.customsFee = customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public Double totalPrice(){
        return price + customsFee;
    }

    @Override
    public String priceTag() {
        return getName()
                + " $ "
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $ "
                + String.format("%.2f", customsFee)
                + ")";
    }
}
