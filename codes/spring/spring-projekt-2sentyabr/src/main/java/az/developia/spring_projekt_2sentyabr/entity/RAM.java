package az.developia.spring_projekt_2sentyabr.entity;

import org.springframework.stereotype.Component;

@Component  
public class RAM {
    private int size;
    private String type;
    private int speed;

    public RAM() {
        this.size = 16;
        this.type = "DDR4";
        this.speed = 3200;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "RAM: size=" + size + "GB, type=" + type + ", speed=" + speed + "MHz";
    }
}
