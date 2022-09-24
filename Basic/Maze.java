//35

public class Maze {
  public static void main(String[] args) {
           System.out.println(count(3, 3));
           path("", 3, 3);
    //        System.out.println(pathRet("", 3, 3));
    
    //        System.out.println(pathRetDiagonal("", 3, 3)

}
static int count(int r, int c) {
  if (r == 1 || c == 1) {
      return 1;
  }
  int left = count(r-1, c);
  int right = count(r, c-1);
  return left + right;
}
static void path(String p, int r, int c) {
if (r == 1 && c == 1) {
    System.out.println(p);
    return;
}

if (r > 1 && c>1) {
  //for down i.e till it is more than 1 as soon as ==1 then stop and returns 
    path(p + 'D', r-1, c-1);
}

if (r > 1) {
    path(p + 'H', r-1, c);
}
if (c > 1) {
    path(p + 'V', r, c-1);
}
}
}
