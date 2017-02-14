public class Rectangle {
    private float width;
    private float length;
    private float perimeter;
    private float area;
    
    
    public Rectangle(float nWidth, float nLength) {
       width = nWidth;
       length = nLength;
       perimeter = 2*(width+length);
       area = length*width;
          
        
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }
     
     

    @Override
    public String toString() {
        return "Length of Rectangle is: "+length+", Width of Rectangle is"+width+", Perimeter of Rectangle is "+perimeter+", Area of Rectangle is "+area;
    }


    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        Rectangle r1 = new Rectangle(51, 10);
        System.out.println(r);
        System.out.println(r1);
        if (r.area == r1.area) {
        System.out.println("Rectangles are Equal");
        }
        else {
        System.out.println("Rectangles are not Equal");
        }
        
    }
}
