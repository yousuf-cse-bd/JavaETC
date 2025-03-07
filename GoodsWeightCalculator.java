package JavaETC;

//Goods weight and price calculator.

public class GoodsWeightCalculator {
    private static final int MON_CONSTANT = 40;
    private double totalWeight;
    private double marketWeightAsMon;
    private double pricePerMon;
    //Using delegating constructors
    public GoodsWeightCalculator(){
        totalWeight = 0;
        marketWeightAsMon = 0;
        pricePerMon = 0;
    }

    public GoodsWeightCalculator(double totalWeight){
        this();
        setTotalWeight(totalWeight);
    }
    public GoodsWeightCalculator(double totalWeight, double marketWeightAsMon){
        this(totalWeight);
        setMarketWeightAsMon(marketWeightAsMon);
    }
    public GoodsWeightCalculator(double totalWeight, double marketWeightAsMon, double pricePerMon){
        this(totalWeight, marketWeightAsMon);
        setPricePerMon(pricePerMon);
    }
    //Setter methods
    public void setMarketWeightAsMon(double marketWeightAsMon) {
        this.marketWeightAsMon = marketWeightAsMon;
    }
    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }
    public void setPricePerMon(double pricePerMon) {
        this.pricePerMon = pricePerMon;
    }
    //Getter methods
    public double getMarketWeightAsMon() {
        return marketWeightAsMon;
    }
    public double getPricePerMon() {
        return pricePerMon;
    }
    public double getTotalWeight() {
        return totalWeight;
    }

    public double calculateMaturedWeight(){
        return (totalWeight / marketWeightAsMon) * MON_CONSTANT;
    }

    public double calculateCostPrice(double weightMatured){
        return Math.round((weightMatured * pricePerMon) / MON_CONSTANT);
    }

    public static void main(String[] args) {
        GoodsWeightCalculator goodsWeightCalculator;
        goodsWeightCalculator = new GoodsWeightCalculator(45, 45, 100.6);
        double weightMatured = goodsWeightCalculator.calculateMaturedWeight();
        System.out.println(goodsWeightCalculator.calculateCostPrice(weightMatured));
    }

    public static String makeWeightMonAndKGs(double weight){
        if(weight == MON_CONSTANT){
            return "এক মণ";
        }
        else if(weight > MON_CONSTANT){
            int monUnit = (int) (weight / MON_CONSTANT);
            weight = weight % MON_CONSTANT;
            return monUnit+" মণ & "+String.format("%.2f", weight)+" কেজি";
        }
        else {
            return String.format("%.2f", weight)+" কেজি";
        }
    }
}

