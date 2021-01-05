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

  public Node getNext(){
    return next;
  }

  public void setNext(Node n){
    next = n;
  }

  public Node getPrev(){
    return prev;
  }

  public void setPrev(Node n){
    prev = n;
  }

  public static void main(String[] args) {
    Node a = new Node("HII");
    System.out.println(a.getNext());
  }
}
