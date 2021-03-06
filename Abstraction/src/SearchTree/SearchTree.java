package SearchTree;

public class SearchTree implements NodeList{

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null) {
            //The list was empty, so this item becomes the head
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = currentItem.compareTo(newItem);
            if(comparison < 0){
                //new item is greater, move right if possible
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else{
                    //there is no next, so insert at end of list
                    currentItem.setNext(newItem);
                    return true;
                }

            }else if(comparison > 0){
                //newItem is less, insert before
                if(currentItem.previous() != null){
                    currentItem = currentItem.previous();

                }else{
                    //the node with previous is the root
                    currentItem.setPrevious(newItem);
                    return true;
                }

            }else{
                //equal
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem removableItem) {
        if (removableItem != null) {
            System.out.println("Deleting item: " + removableItem.getValue());
        }

        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = currentItem.compareTo(removableItem);
            if(comparison <0){
                parentItem = currentItem;
                currentItem = currentItem.next();
            }else if(comparison > 0){
                parentItem = currentItem;
                currentItem = currentItem.previous();
            }else{
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
       return false;
    }

    private void performRemoval(ListItem item, ListItem parent){
        //remove item from the three
        if(item.next() == null){
            //no right tree, so make parent point to left tree (wich may be null)
            if(parent.next() == item){
                //item is right child of its parent
                parent.setNext(item.previous());
            }else if(parent.previous() == item){
                //item is left child of its parent
                parent.setPrevious(item.previous());
            }else{
                //parent must be item, which means we were looking at the root of the tree
                this.root = item.previous();
            }
        }else if(item.previous() == null){
            //no left tree, so make parent point to right tree (which may be null)
            if(parent.next() == item){
                //item is right child of its parent
                parent.setNext(item.next());
            }else if(parent.previous()==item){
                //item is left child of its parent
                parent.setPrevious(item.next());
            }else{
                //again, we are deleting the root
                this.root = item.next();
            }
        }else{
            //neither left nor right are null, deletion is now a lot trickier
            //From the right sub-tree, find the smallest value
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while(current.previous() != null){
                leftmostParent = current;
                current = current.previous();
            }
            //now put the smallest value into our node to be deleted
            item.setValue(current.getValue());
            //and delete the smallest
            if(leftmostParent == item){
                //there was no leftmost node, so current points to the smallest
                //node (the one that must now be deleted
                item.setNext(current.next());
            }else{
                //set the smallest node's parent to point to
                //the smallest node's right child (which may be null)
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        //recursive method
        if(root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
