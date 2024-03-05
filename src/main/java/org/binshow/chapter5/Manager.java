package org.binshow.chapter5;


/**
 * 经理类
 */
public class Manager extends Employee{

    private double bonus;
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }


    /**
     * 重写父类 Employee 获取薪水的方法
     * 经理的薪水 = salary + bonus
     * @return 薪水
     */
    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
