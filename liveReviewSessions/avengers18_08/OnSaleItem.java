package avengers18_08;

public class OnSaleItem  extends Item{

    private double discountPercent;

    // inherits from Item Class
    /*
     * private instance variable, used for discount percentage
     */

    /*
     * public constructor for OnSaleItem
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     * @param discount
     *
     * - Calls Super class constructor by passing name,quantity,catalogNumber,price
     * - it will assign the price after deducting(minus) discount from the price
     * - assigns discount
     */
    public OnSaleItem (String name, int quantity, int catalogNumber, double price, double discountPercent ){
        super(name,quantity,catalogNumber,(price-discountPercent*price));
        this.discountPercent = discountPercent;
    }
    /*
     * getter for discount
     * @return
     */
    public double getDiscountPercent(){
        return discountPercent;
    }
    /*
     * setter for discount
     * @param discount
     */
    public void setDiscountPercent(double discountPercent){
        this.discountPercent = discountPercent;
    }

    /*
     * overrides toString from Item:
     *
     * @returns Object description in this format:
     *      * "OnSaleItem{discount=20.0%, name=ItemName, price=100.45}"
     *
     */

    @Override
    public String toString() {
        return "OnSaleItem{" +
                "discountPercent=" + discountPercent +
                '}';
    }
}
