public class ThingList {
  
    // fields
    Thing[] items;

    // Constructor
    public ThingList (int capacity) {
        items = new Thing[capacity+1];
        items[0] = new EndThing();
    }
  
    // Parameter: obj - object to add to this list
    // Postcondition: obj appended to the end of this list
    public void add (Object obj) {
        ensureCapacity();
	Thing t = new Thing(obj);
        for(int i = 0; i <items.length; i++){
            if (items[i].isLast()){
                items[i+1]= new EndThing();
                items[i]= t;
                return;
            }
        }
    }
    public boolean isEmpty(){
        return items[0].isLast();
    }


    public int size(){
        for (int i =0; i < items.length; i++){
            if(items[i].isLast()){
                return i;
            }
        }
        return 0;
    }



    public String toString(){
        if (isEmpty()){
            return "[]";
        }
        String str ="[";
        for (int i= 0; i <items.length; i++){
            if (items[i+1].isLast()){
                str += items[i] + "]";
                i= items.length;
            }else{
                str += items[i] + ", ";
            }
        }
        return str;
    }


    public Thing remove(){
        if (isEmpty()){
            throw new IllegalStateException();
        }
        Thing t = new Thing(new Object());
        for (int i= 0; i <items.length; i++){
            if (items[i+1].isLast()){
                t = items[i];
                items[i] = new EndThing();
                i= items.length;
            }
        }
        return t;
    }




    // Postcondition: capacity of ThingList has doubled if there is no
    //                more room to add elements
    private void ensureCapacity() {
        if (items[items.length-1] == null)
	    return;
	Thing[] temp = new Thing[items.length*2 -1];
        for (int i =0; i < items.length; i++)
	    temp[i] = items[i];
	items = temp;
    }
    
}
