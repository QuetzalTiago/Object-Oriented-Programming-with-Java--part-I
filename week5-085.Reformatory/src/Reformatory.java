public class Reformatory {
    private int totalWeights;

    public int weight(Person person) {
        // return the weight of the person
        totalWeights++;
        return person.getWeight();
        
    }
    public void feed(Person person) {
        int weight=person.getWeight();
        person.setWeight(weight+1);
    }
    public int totalWeightsMeasured(){
        return totalWeights;
    }

}
