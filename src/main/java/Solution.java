public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    private String calcModel;
    private int idNumber;
  
   
    
    public Solution(String model, int id) {
        //implement code here
        this.calcModel = model;
        this.idNumber = id;
    }

    public Solution(int id) {
        //implement code here
        calcModel = "TI-84";
        this.idNumber = id;
    }

    public String getCalcModel() {
        //implement code here
        return calcModel();
    }

    public void setCalcModel(String newModel) {
        //implement code here
       calcModel = newModel;
    }

    public int getIdNumber() {
        //implement code her
        return idNumber;
    }

    public void setIdNumber(int newId) {
        //implement code here
        idNumber = newId;
    }

    public void incrementId() {
        //implement code here
      idNumber++;
    }

    public double add(double num1, double num2) {
        //implement code here
     double ad  =  num1 + num2;
        return ad;
    }

    public double subtract(double num1, double num2) {
        //implement code here
        double sub =    num1 - num2;
        return sub;
    }

    public double multiply(double num1, double num2) {
        //implement code here
        double mult = num1 * num2;
        return mult;
    }

    public int quotient(int num1, int num2) {
        //implement code here

    int quot =  num1 / num2;
        return quot;
    }

    public int remainder(int num1, int num2) {
        //implement code here
     int rem = num1 % num2;
        return rem;
    }

    public String divisionResult(int num1, int num2) {
        //implement code here
        int div = num1/num2;
        int rem = num1%num2;
        return div +  "R" + rem;
    }

    public String coordinatePair(int x, int y) {
        //implement code here
        return "(" + x + ", " + y + ")";
    }

    public int average(int num1, int num2) {
        //implement code here
        int ad = num1 + num2;
        int div = ad/2;
        return div;
    }

    public String info() {
        //implement code here
        String inf = "This calculator is a mode "+ calcModel + "with id" + idNumber;
        return inf;
    }
}

