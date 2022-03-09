------------task 1 ------------


-----a----

object demo extends App {

  val nums = List(1,2,3,4)
  val chars = List('a','b','c')
  val colors = List("black","white")

      for (
        i <- nums;
        j <- chars;
        k <- colors)

          println(s"($i-$j-$k)")
  }
  
  -------b---------
  
  object demo extends App {

    val nums = List(1,2,3,4)
    val chars = List('a','b','c')
    val colors = List("black","white")
    val Quote:String = "\""

    val outputList = nums.map(nodeN => chars.map(nodeC => colors.map(node => (Quote+nodeN + "-"+ nodeC +"-" + node+Quote) )));
    val new1 = outputList flatMap { x => x }
    val new2 = new1 flatMap { x => x }
    println(new2)

  }
  
  ------------Task 2 ---------
  
  a)

pre_order(node TreeNode, output *string[]){
	
	if (node != null){
		output.append(node.value);
		
		if (node.left != null){
			pre_order(node.left);
		}
		
		if (node.right != null){
			pre_order(node.right);
		}
	}
}

b)

in_order(node TreeNode, output *string[]){
	if (node != null){
		if (node.left != null){
			in_order(node.left);
		}
		
		output.append(node.value);
		
		if (node.right != null){
			in_order(node.right);
		}
	}
}

c)

post_order(node TreeNode, output *string[]){
	if (node != null){
		if (node.left != null){
			post_order(node.left);
		}
		
		if (node.right != null){
			post_order(node.right);
		}
		
		output.append(node.value);
	}
}

d)

main(){
	breadth_first(tree, output *string[]);
}

breadth_first(tree TreeNode, output *string[]){
	depth = 0;
	output.append(tree.value);
	limit = false;
	while( limit == false ){
		limit = true;
		
		
		limit = limit || depth_run(tree.left, depth, string[]);
		limit = limit || depth_run(tree.right, depth, string[]);
		
		depth = depth + 1;
	}
	
}

depth_run(node TreeNode, depth int, output *string[]){
	if depth == 0{
		output.append(node.value);
		if (node.left != NULL) || (node.right != NULL){
			return false;
		}
		
		return true;
	}
	
	result = true;
	
	if (node.left !=NULL){
		result = result || depth_run(node.left, depth - 1, output);
	}
	
	if (node.right !=NULL){
		result = result || depth_run(node.right, depth - 1, output);
	}
	
	return result;
}


