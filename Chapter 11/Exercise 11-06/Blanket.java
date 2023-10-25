public class Blanket
{
    protected String size;
    protected String color;
    protected String material;
    protected double price;
    protected double sizePremium;
    protected double materialPremium;
    private final String SIZE1 = "Twin";
    private final String SIZE2 = "Double";
    private final String SIZE3 = "Queen";
    private final String SIZE4 = "King";
    protected final double BASE_PRICE = 30;
    private final double S_PRICE2 = 10;
    private final double S_PRICE3 = 25;
    private final double S_PRICE4 = 40;
    private final String MAT1 = "cotton";
    private final String MAT2 = "wool";
    private final String MAT3 = "cashmere";
    private final double M_PRICE2 = 20;
    private final double M_PRICE3 = 45;
    public Blanket()
    {
        setDefaults();
    }
    private void setDefaults()
    {
        this.size = SIZE1;
        this.color = "white";
        this.material = MAT1;
        this.price = BASE_PRICE;
    }
    public String getSize()
    {
        return this.size;
    }
    public String getColor()
    {
        return this.color;
    }
    public String getMaterial()
    {
        return this.material;
    }
    public void setSize(String s)
    {
        this.size = SIZE1;
        this.price = BASE_PRICE;
        if(s.equals(SIZE2)){
            this.size = s;
            this.price += S_PRICE2;
        } else if(s.equals(SIZE3)){
            this.size = s;
            this.price += S_PRICE3;
        } else if(s.equals(SIZE4)){
            this.size = s;
            this.price += S_PRICE4;
        }
    }
    public void setMaterial(String m)
    {
        this.material = MAT1;
        this.price = BASE_PRICE;
        if(m.equals(MAT2)){
            this.material = MAT2;
            this.price += M_PRICE2;
        } else if(m.equals(MAT3)){
            this.material = MAT3;
            this.price += M_PRICE3;
        }
    }
    public String toString()
    {
        return String.format("Blanket size: %s \tColor: %s  \nMaterial: %s \tPrice: $%.2f\n", size, color, material, price);
    }
}
