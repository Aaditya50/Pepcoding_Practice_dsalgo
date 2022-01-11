  public static void linearize(Node node){
    // write your code here
    for(Node child: node.children){
        linearize(child);
    }


    while(node.children.size() > 1){
        Node lc = node.children.remove(node.children.size()-1);
        Node sl = node.children.get(node.children.size()-1);
        Node slt = getTail(sl);
        slt.children.add(lc);
    }
  }

  private static Node getTail(Node node){
      while(node.children.size() == 1){
          node = node.children.get(0);
      }
      return node;
  }
