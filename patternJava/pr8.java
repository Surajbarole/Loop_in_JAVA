
// 1234
// 5678
// 9012
// 3456
// 7890

class Main {
  public static void main(String[] args) {
    int x=0;
    int number=1;
    for(int i=1;i<=20;i++){
        System.out.print(i%10);
        x++;
      if(x==4){
        x=0;
      System.out.println();
    }
  }
}
}