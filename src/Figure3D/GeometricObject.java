package Figure3D;

abstract class GeometricObject {
     private String name;
     public GeometricObject(String name){
         this.name = name;
     }

    public String getName() {
        return name;
    }
    public abstract void volume();
}
