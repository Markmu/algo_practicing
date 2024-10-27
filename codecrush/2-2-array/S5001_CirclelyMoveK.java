import java.util.Objects;

public class S5001_CirclelyMoveK {

  public String rotate(String s, int k) {
    if (Objects.isNull(s) || s.length() == 0) {
      return s;
    }

    int len = s.length();
    int move = k % len;

    return s.substring(len - move, len) + s.substring(0, len - move);

  }

  public static void main(String[] args) {
    S5001_CirclelyMoveK solution = new S5001_CirclelyMoveK();
    String rotatedStr = solution.rotate("abcdefg", 3);

    System.out.println(rotatedStr);
    System.out.println("efgabcd".equals(rotatedStr));
  }


}
