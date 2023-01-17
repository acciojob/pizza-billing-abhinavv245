package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
   StringBuilder str= new StringBuilder();
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
      if(isVeg){
          this.price=300;
          str.append("Base Price Of The Pizza: 300\n");

      }else{
          this.price=400;
          str.append("Base Price Of The Pizza: 400\n");
      }
    }

    public int getPrice(){
        return this.price;
    }
private boolean Cadded=false;
    public void addExtraCheese() {

        if (!Cadded) {
            this.price = this.price + 80;
            str.append("Extra Cheese Added: 80\n");
            Cadded=true;
        }
    }
   private boolean Tadded=false;
    public void addExtraToppings() {

        if(!Tadded) {
            if (isVeg) {
                this.price = this.price + 70;
                str.append("Extra Toppings Added: 70\n");
                Tadded=true;
            } else {
                this.price = this.price + 120;
                str.append("Extra Toppings Added: 120\n");
                Tadded=true;
            }
        }
    }

    public void addTakeaway(){
        this.price =this.price +20;
        str.append("Paperbag Added: 20\n");
    }

    public String getBill(){
        str.append("Total Price: "+String.valueOf(getPrice()+"\n"));
  this.bill= String.valueOf(str);
        return this.bill ;
    }
}
