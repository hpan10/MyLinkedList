public class MyLinkedList{
  private int size;
  private Node start, end;

  public MyLinkedList(){
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String value){
    if (size == 0){
      start = new Node(value);
      end = start;
    }
    else {
      end.setNext(new Node(value));
      end = end.getNext();
    }
    size++;
    return true;
  }

  public void add(int index, String value){
    if (index < 0 || index > size){
      throw new IndexOutOfBoundsException("Your index must be within 0 and " + size + "!");
    }
    if (index == 0){
      if (size == 0) add(value);
      else {
        start.setPrev(new Node(value));
        start = start.getPrev();
        size++;
      }
    }
    else if (index == size) add(value);
    else {
      Node current = start;
      int i = 1;
      while (i != index){
        current = current.getNext();
        i++;
      }
      current.getNext().setPrev(new Node(value));
      current.setNext(current.getNext().getPrev());
      size++;
    }
  }

  public String get(int index){
    if (size == 0) return "This list is empty!";
    if (index < 0 || index >= size){
      throw new IndexOutOfBoundsException("Your index must be within 0 and " + (size - 1) + "!");
    }
    Node current = start;
    int i = 0;
    while (i != index){
      current = current.getNext();
      i++;
    }
    return current.getData();
  }

  public String set(int index, String value){
    if (size == 0) return "This list is empty!";
    if (index < 0 || index >= size){
      throw new IndexOutOfBoundsException("Your index must be within 0 and " + (size - 1) + "!");
    }
    Node current = start;
    int i = 0;
    while (i != index){
      current = current.getNext();
      i++;
    }
    String temp = current.getData();
    current.setData(value);
    return temp;
  }

  public String toString(){
    Node current = start;
    String list = "[";
    if (current != null){
      while (current != end){
        list += current.getData() + ", ";
        current = current.getNext();
      }
      list += current.getData();
    }
    list += "]";
    return list;
  }

  public String toStringReversed(){
    Node current = end;
    String list = "[";
    if (current != null){
      while (current != start){
        list += current.getData() + ", ";
        current = current.getPrev();
      }
      list += current.getData();
    }
    list += "]";
    return list;
  }

}
