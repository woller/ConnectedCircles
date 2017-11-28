package MyFirstGraph;

public class Vertex
{
    private String name;
    private int x;
    private int y;

    public Vertex(String name, int x, int y)
    {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object o)
    {
        return name.equals(((Vertex) o).name) && x == ((Vertex) o).x && y == ((Vertex) o).y;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return name;
    }
}
