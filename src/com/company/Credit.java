package com.company;


public class Credit {
    private int id;
    private int sum;
    private String period;
    private int interestRate;
    private Credit[] credits;

    public Credit(int id, int sum, String period, int interestRate, Credit[] credits) {
        this.id = id;
        this.sum = sum;
        this.period = period;
        this.interestRate = interestRate;
        this.credits = credits;
    }

    public Credit(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public Credit[] getCredits() {
        return credits;
    }

    public void setCredits(Credit[] credits) {
        this.credits = credits;
    }

    public int countCredits(){
        int count = 0;
        for (int i = 0; i < credits.length; i++) {
            count++;
        }
        return count;
    }

    public int sumCredits(){
        int sum = 0;
        for (int i = 0; i < credits.length; i++) {
            sum = sum + credits[i].getSum();
        }
        return sum;
    }

    public float avrSumCredits(){
        float avr = sumCredits()/countCredits();
        return avr;
    }


    @Override
    public String toString() {
        return "----------------------------\nID: " + getId() + "\nСумма: " + getSum() + "\nПериод: " + getPeriod() + "\nПроцентная ставка: " + getInterestRate();
    }
}
