
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }
        if (cents < 0) {
            euros--;
        cents = Math.abs(cents);     
        }
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    public Money plus(Money added){
    Money newMoney = new Money(this.euros+added.euros,this.cents+added.cents);
    return newMoney;
    }
    public boolean less(Money compared){
    Money actualMoney = new Money(this.euros,this.cents);    
    if ((actualMoney.euros<compared.euros)&(actualMoney.cents<compared.cents)){
        return true;}
    else if ((actualMoney.euros==compared.euros)&(actualMoney.cents<compared.cents)){
        return true;}
    else if ((actualMoney.euros<compared.euros)&(actualMoney.cents==compared.cents)){
        return true;}
    else if ((actualMoney.euros<compared.euros)&(actualMoney.cents>compared.cents)){
        return true;}
    return false;
    }
    public Money minus(Money decremented){
    Money actualMoney = new Money (this.euros,this.cents);
    Money zeroMoney = new Money (0,0);
    Money minusMoney  = new Money (this.euros-decremented.euros,this.cents-decremented.cents);
    if (actualMoney.cents<decremented.cents){
    minusMoney  = new Money (this.euros-decremented.euros,100-decremented.cents);
    minusMoney  = new Money (minusMoney.euros-1,minusMoney.cents);}
    if (minusMoney.euros<=zeroMoney.euros){
        return zeroMoney;}
    return minusMoney;
    }

}
