package orz.xuchao.javapatterns.prototype;

import java.io.IOException;

public interface Prototype{
    public Prototype clone();
    public String getName();
    public void setName(String name);
    
    public Enclosure getEnclosure();
    public void setEnclosure(Enclosure enclosure);
    public  Object deepClone() throws IOException, ClassNotFoundException;
}
