public class APLine{
private int a;
private int b;
private int c;

public double getSlope(){
return -a/(double)b;
}
  
public boolean isOnLine(int x, int y){
return ax + by + c ==0;
}

}
