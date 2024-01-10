public abstract class GeometricFigure2
{
    protected int height;
    protected int width;
    protected String figure;

    public  GeometricFigure2(int h, int w, String f)
    {
        this.height = h;
        this.width = w;
        this. figure = f;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public String getFigure()
    {
        return figure;
    }

    public abstract double figureArea(int h, int w);
    public abstract void displaySides();
}
