public class Rock
{
    int sampleNumber;
    String description;
    double weight;

    public Rock(int sampleNumber, double weight){
        this.sampleNumber = sampleNumber;
        this.description = "Unclassified";
        this.weight = weight;
    }
    public int getSampleNumber(){
        return sampleNumber;
    }
    public String getDescription(){
        return description;
    }
    public double getWeight(){
        return weight;
    }
}
