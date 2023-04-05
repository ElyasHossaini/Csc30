package Mastery;


import java.io.*;


public class MySavings implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private double Savings;
    
    public MySavings() {
        Savings = 0.0;
    }
    
    public double getSavings() {
        return(Savings);
    }
    
    public void setSavings(double Save) {
        Savings = Savings + Save;
    }
    
    public void setSave(double S) {
        Savings = Savings - S;
    }
    
    public String toString() {
        String SSavings;
        SSavings = ("You have $" + Savings + " in your account");
        return(SSavings);
    }
    
    public void save(String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static MySavings load(String filename) {
        MySavings savings = null;
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            savings = (MySavings) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return savings;
    }



	}


