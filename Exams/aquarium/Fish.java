package aquarium;

public class Fish {
    //•	name: String
    //•	color: String
    //•	fins: int
    private String name;
    private String color;
    private int fins;

    public Fish(String name, String color, int fins) {
        this.name = name;
        this.color = color;
        this.fins = fins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFins() {
        return fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }
    //String.format("Fish: %s%nColor: %s%nNumber of fins: %d",this.name,this.color,this.fins);
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Fish: %s",this.name));
        sb.append(System.lineSeparator());
        sb.append(String.format("Color: %s",this.color));
        sb.append(System.lineSeparator());
        sb.append(String.format("Number of fins: %d",this.fins));

        return sb.toString().trim();
    }
}
