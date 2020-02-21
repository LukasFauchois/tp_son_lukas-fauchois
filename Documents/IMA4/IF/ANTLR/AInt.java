public class AInt extends AExpr{
  int e;

  public AInt(int i){
    this.e=i;
  }

  int eval(){
    return (e);
  }
}
