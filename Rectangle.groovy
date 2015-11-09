// Rectangle in groovy

Rectangle myRectangle = new Rectangle()
myRectangle.upLeft = new Point()
myRectangle.downRight = new Point()

println("Give the x of the first point: ")
String x1 = System.console().readLine()
myRectangle.upLeft.x = Double.parseDouble(x1)
println("Give the y of the first point: ")
String y1 = System.console().readLine()
myRectangle.upLeft.y = Double.parseDouble(y1)

println("Give the x of the second point: ")
String x2 = System.console().readLine()
myRectangle.downRight.x = Double.parseDouble(x2)
println("Give the y of the first point: ")
String y2 = System.console().readLine()
myRectangle.downRight.y = Double.parseDouble(y2)

double height = (myRectangle.upLeft.y - myRectangle.downRight.y)
double width = (myRectangle.downRight.x - myRectangle.upLeft.x)
double perimeter = 2*(width + height);
double area = width*height;

println("The perimeter is " + perimeter + " and the area is " + area + ".")

class Rectangle {
	Point upLeft
	Point downRight
}

class Point {
	double x
	double y
}



// have defined data types (do this first), now get co-ordinates from the user