 public static boolean find(Node node, int data) {
    // write your code here
    // Node dummy = head;
      if(node.data == data){
        return true;
      }

      for(Node child : node.children){
        boolean fic = find(child ,data);
        if(fic){
          return true;
        }
      } 

      
      return false;
  }
