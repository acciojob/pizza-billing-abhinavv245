package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraTopping;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isTakeAwayAdded;
    private boolean isBillgenerated;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isCheeseAdded=false;
        this.isToppingsAdded=false;
        this.isTakeAwayAdded=false;
        this.isBillgenerated=false;
        this.bill="";

      if(isVeg){
          this.price=300;
         this.bill+=("Base Price Of The Pizza: 300\n");
         this.extraTopping=70;


      }else{
          this.price=400;
          this.bill+=("Base Price Of The Pizza: 400\n");
          this.extraTopping=120;
      }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {

        if (!isCheeseAdded) {
            this.price = this.price + 80;
            this.isCheeseAdded=true;
        }
    }

    public void addExtraToppings() {

       if(!isToppingsAdded){
           this.price+=this.extraTopping;
           this.isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
       if(!isTakeAwayAdded){
           this.price+=20;
           this.isTakeAwayAdded=true;
       }
    }

    public String getBill() {
        if (!isBillgenerated) {
            if (isCheeseAdded) {
                this.bill += "Extra Cheese Added: 80\n";
            }
            if (isToppingsAdded) {
                this.bill += "Extra Toppings Added: " + this.extraTopping + "\n";
            }
            if (isTakeAwayAdded) {
                this.bill += "Paperbag Added: 20\n";

            }
            this.bill+="Total Price: "+this.price+"\n";
           this.isBillgenerated=true;
        }
        return this.bill;
    }
}
