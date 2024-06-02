# Random-Walker
This is my Random Walker project, done in Java language. I built this when I was in my freshman year, in CSUS. It was a part of CSC-20 class( Programming Concepts and Methodology II).


Write a class named RandomWalker following the good programming practices seen in class (test, document, conventional formatting, etc). I will give you a main program that creates and manipulates RandomWalkerobjects, but it won't work correctly unless you have written RandomWalker.
A RandomWalker object should keep track of its (x, y) location. All walkers should start at the coordinates (0, 0) when created. When a walker is asked to move, it should randomly move exactly one unit either left, right, up or down (ie, adds +/- 1 to either its x or y value, but not both). Each of these four possible moves should occur with equal probability. When done repeatedly, the resulting behavior is known as a "random walk". (See an example at http://upload.wikimedia.org/wikipedia/commons/f/f3/Random_walk_2500_animated.svg (Links to an external site.))
Each RandomWalker object should have the following public methods. You may add whatever private fields or methods you feel are necessary to implement these methods:
move() : Instructs this random walker to update its coordinates by randomly making one of the 4 possible moves (up, down, left, or right).
getX() : Returns this random walker's current x-coordinate.
getY() : Returns this random walker's current y-coordinate.
getSteps() : Returns the number of steps this random walker has taken (ie, the number of time move was called).
You don't write any loops in your RandomWalker code. The program I give you will call your methods repeatedly to get its walk done.
Random walks have interesting mathematical properties. For example, given infinitely many steps, a random walker approaches 100% chance of reaching any particular (x, y) coordinate. To learn more about random walks, visit http://mathworld.wolfram.com/RandomWalk.html (Links to an external site.) .
To complete the lab do the following:
1.	Write each method.
2.	Write brief javadoc documentation for each public method and for the class as a whole.
3.	Write a main program in a class java that exercises all of the methods in RandomWalker and demonstrates that they are working.
4.	Once you've done 1, 2 and 3, copy the following files into the same directory as your RandomWalker.java and run TestRandomWalker.java. You should see a random walk!
TestRandomWalker.java  and Drawing Panel.java 
I'll want to verify that:
~ You wrote a Main.java for testing RandomWalker.
~ Your code looks correct and well formatted.
~ You have written javadoc for all public members of RandomWalker and it compiles without warning.
~ TestRandomWalker runs correctly.
 

