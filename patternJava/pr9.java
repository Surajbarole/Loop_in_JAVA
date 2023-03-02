
// **Problem 9 :** 
// Print Prime number in a given range.




class Main {
  public static void main(String[] args) {
    int start=3;
    int end=20;
    int count=0;
    for(int i=start;i<=end;i++){
        if(end%i==0){
        count++;
    }
    }
    if(count==2){
        System.out.println("Yes");
    }else {
        System.out.println("No");
    }
    }
  }
