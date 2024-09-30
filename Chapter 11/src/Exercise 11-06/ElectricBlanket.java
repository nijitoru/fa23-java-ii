public class ElectricBlanket extends Blanket
{
    private int settings;
    private boolean hasAutoShutoff;
    private final int MAX_SETTINGS = 5;
    private double shutoffPremium;
    private final double S_PRICE = 5.75;
    public ElectricBlanket()
    {
        super();
        this.settings = 1;
        this.hasAutoShutoff = false;
    }
    public int getSettings()
    {
        return this.settings;
    }
    public boolean getHasAutoShutoff()
    {
        return this.hasAutoShutoff;
    }
    public void setSettings(int s)
    {
        if(s < 1 || s > 5)
            this.settings = 1;
        else
            this.settings = s;
    }
    public void setHasAutoShutoff(boolean h)
    {
        if(h){
            this.price += 5.75;
            this.hasAutoShutoff = h;
        } else {
            this.hasAutoShutoff = h;
        }
    }
    public String toString()
    {
        return String.format("%sSetting: %s \tAuto Shutoff: %s\n", super.toString(), settings, hasAutoShutoff);
    }
} 

