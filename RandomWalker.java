// SHAURYA CHAWLA
// 10/04/2020
// LAB-4 ASSIGNMENT

import java.util.*;
public class RandomWalker{

int x=0,y=0,mov=0;
double pl=1,pr=1,pu=1,pd=1;
int d,e,f=2;

Random rand=new Random(System.currentTimeMillis()); //   Class to get Random numbers
public RandomWalker(){    // constructor
this.x=0;
this.y=0;
}

public int getX(){      // a method to get value of x
return this.x;
}

public int getY(){     // a method  to get value of y
return this.y;
}

public void move(){   // a method to do random walk

d=rand.nextInt(f); // random number generation 0 or 1
e=rand.nextInt(f); // random number generation 0 or 1 

// System.out.println(d+" e "+e);
if(d==e)                    //if both randoms are samne then no move
   {    System.out.println("no move");
  }
else{
 if(d==1){ //if d=1 means that it can move left or right
 if(this.pr>=this.pl)    //checking the Probability of right as compared to left
 {
    this.x=this.x+1;
    this.pr=this.pr/2;   //changing the Probability of right
  }
else if(this.pl>this.pr) //checking the Probability of left as compared to right
{
this.x=this.x-1;
this.pl=this.pl/2; // changing the Probability of left
}
}
else // if e=1 means that it can move up or down
{
if(this.pu>=this.pd){      //checking the Probability of up as compared to down
this.y=this.y+1;
this.pu=this.pu/2;        //changing the Probability of up
}
else if(this.pd>this.pu) //checking the Probability of down as compared to up
{
this.y=this.y-1;
this.pd=this.pd/2;     //changing the Probability of down
}
}
this.mov=this.mov+1;
}
}
public int getSteps(){
return this.mov;
}
}
