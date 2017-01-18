class Sphere {
static final double PI = 3.14; // Class variable that has a fixed value
static int count = 0; // Class variable to count objects
// Instance variables
double radius; // Radius of a sphere
double xCenter; // 3D coordinates
double yCenter; // of the center
double zCenter; // of a sphere
// Class constructor
Sphere(double theRadius, double x, double y, double z) {
radius = theRadius; // Set the radius
// Set the coordinates of the center
xCenter = x;
yCenter = y;
zCenter = z;
++count; // Update object count
}
// Static method to report the number of objects created
static int getCount() {
return count; // Return current object count
}
// Instance method to calculate volume
double volume() {
return 4.0/3.0*PI*radius*radius*radius;
}
}


class CreateSpheres {
public static void main(String[] args) {
System.out.println("Number of objects = " + Sphere.getCount());
Sphere ball = new Sphere(4.0, 0.0, 0.0, 0.0); // Create a sphere
System.out.println("Number of objects = " + ball.getCount());
Sphere globe = new Sphere(12.0, 1.0, 1.0, 1.0); // Create a sphere
System.out.println("Number of objects = " + Sphere.getCount());
// Output the volume of each sphere
System.out.println("ball volume = " + ball.volume());
System.out.println("globe volume = " + globe.volume());
}
}
