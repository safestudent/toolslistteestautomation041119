package co.uk.safebear.dog.hostel;

public abstract class Dog {

    private int age;
    private String breed;
    private boolean isNeutered;
    private double weight;

    public void setDogsWeight(double _weight){
        this.weight = _weight;
    }

    public double isObese(){

        if (this.weight > 50 ) {
            return this.weight;
        }

        return 0;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int _age){
        if(_age > 0){
            this.age = _age;
        }

        System.out.println("Can't have negative ages!");

    }

    public void bark(){
        System.out.println("bark");
    }

    public void neuter(){
        isNeutered = true;
        System.out.println("yelp");
    }

}
