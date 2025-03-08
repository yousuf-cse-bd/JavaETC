package JavaETC;

///Make a multiplication table using string array.

public class MultiplicationTable {
    private int userInputNumber;
    private static final int SIZE = 11;
    String[] stringResult;
    public MultiplicationTable(){
        userInputNumber = 0;
    }
    public MultiplicationTable(final int userInputNumber){
        this();
        setUserInputNumber(userInputNumber);
    }
    public void setUserInputNumber(int userInputNumber) {
        this.userInputNumber = userInputNumber;
    }
    public int getUserInputNumber() {
        return userInputNumber;
    }
    public void doProductTable(){
        stringResult = new String[SIZE];
        int index = 0;
        long result;
        for(int i = 0; i < SIZE; i++){
            result = (long) i * userInputNumber;
            stringResult[index] = userInputNumber+" x "+i+" = "+result;
            index++;
        }
    }
    public String[] getStringResult(){
        return stringResult;
    }

    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.setUserInputNumber(9);
        multiplicationTable.doProductTable();
        String[] stringResult = multiplicationTable.getStringResult();
        for(String x : stringResult){
            System.out.println(x);
        }
    }
}