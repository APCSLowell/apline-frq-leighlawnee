public class APLine{
private int a;
private int b;
private int c;

APLine(int x, int y, int z){
a = x;
b = y;
c = z;
}

public double getSlope(){
return -a/(double)b;
}
  
public boolean isOnLine(int x, int y){
return (a*x + b*y + c) ==0;
}

}
