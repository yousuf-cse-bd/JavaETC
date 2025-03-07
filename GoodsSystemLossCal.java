package JavaETC;

import java.util.Scanner;

//Calculate for goods system loss.

public class GoodsSystemLossCal {

    private double totalWeight;
    private double lossWeight;
    private double costPerMon;

    public GoodsSystemLossCal(){
        totalWeight = 0;
        lossWeight = 0;
        costPerMon = 0;
    }
    public GoodsSystemLossCal(double totalWeight){
        this();
        setTotalWeight(totalWeight);
    }
    public GoodsSystemLossCal(double totalWeight, double lossWeight){
        this(totalWeight);
        setLossWeight(lossWeight);
    }

    public GoodsSystemLossCal(double totalWeight, double lossWeight, double costPerMon){
        this(totalWeight, lossWeight);
        setCostPerMon(costPerMon);
    }

    public void setCostPerMon(double costPerMon) {
        this.costPerMon = costPerMon;
    }

    public void setLossWeight(double lossWeight) {
        this.lossWeight = lossWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public double getCostPerMon() {
        return costPerMon;
    }

    public double getLossWeight() {
        return lossWeight;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public  double weightLossCalculate(){
        return (totalWeight * lossWeight)/40.0;
    }
    public double obtainWeightCalculate(){
        return totalWeight - weightLossCalculate(); //Here redundancy and dependency occurred
    }

    public double payAbleCosting(){
        return Math.round((totalWeight * costPerMon)/40.0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalWeight = 41.99;
        double lossWeight = 1;
        double costPerMon = 50;
        GoodsSystemLossCal goodsSystemLossCal = new GoodsSystemLossCal(totalWeight, lossWeight, costPerMon);

        totalWeight = goodsSystemLossCal.obtainWeightCalculate();
        lossWeight = goodsSystemLossCal.weightLossCalculate();
        costPerMon = goodsSystemLossCal.payAbleCosting();

        System.out.println(totalWeight);
        System.out.println(lossWeight);
        System.out.println(costPerMon);

        System.out.println(makeWeightMonAndKGs(totalWeight));
        System.out.println("আমি তোমাকে ভালোবাসি."); //for Unicode

        scanner.close();
    }

    static String makeWeightMonAndKGs(double weight){
        if(weight >= 40){
            long mon = (long) weight / 40;
            weight = weight % 40;
            return mon+" মণ & "+String.format("%.2f", weight)+"কেজি";
        }
        return String.format("%.2f", weight)+"কেজি";
    }
}
