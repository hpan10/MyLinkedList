public class Node{
  private String data;
  private Node next, prev;

  public Node(String value){
    data = value;
  }

  public String getData(){
    return data;
  }

  public void setData(String value){
    data = value;
  }

  public String getNext(){
    return next.getData();
  }

  public void setNext(Node n){
    next = n;
  }

  public String getPrev(){
    return prev.getData();
  }

  public void setPrev(Node n){
    prev = n;
  }
}
