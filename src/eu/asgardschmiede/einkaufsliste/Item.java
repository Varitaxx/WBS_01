package eu.asgardschmiede.einkaufsliste;

public class Item {

   private String name;

    private String category;

    private int amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if(category!= null) {
            this.category = category;
        }
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if(amount >= 0) {
            this.amount = amount;
        }
    }

    String showDetails() {
        return name + ", " + category + ", Anzahl: " + amount;
    }

    int preisSteigerung(){
        return amount *= 3;
    }

}
