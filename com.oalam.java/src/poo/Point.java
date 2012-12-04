package poo;

public class Point {

    static int nbPointCreated = 0;
    
    static void func(){
        nbPointCreated++;
    }
    
    
    // champs ou field
    private int x = 0;
    private int y = 0;

    public Point() {
        nbPointCreated++;
    }

    public Point(int i, int i0) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void finalize() {
        nbPointCreated--;
        System.out.println("destruction = ");
    }

    public static void main(String[] args) {
        System.out.println("count = " + Point.nbPointCreated);
        
        Point.func();
        
        Point p = new Point();

        Point p2 = new Point();

      //  Math.acos(nbPointCreated)
        
        p2 = null;
        //System.gc();
        System.out.println("count = " + Point.nbPointCreated);

    }

    public void setX(int x) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void setY(int y) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    String getX() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    String getY() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
