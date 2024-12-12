public class Main {
    public static void main(String[] args) {

        String[] myStrings = {"zero", "one", "two", "three", "four", "five", "six", "seven"};

        /* MyArray.reverse()
        MyArray<String> strings = new MyArray<>();
        for(int i = 0; i < myStrings.length; i++)
            strings.insert(new Element(i, myStrings[i]));
        System.out.println(strings.toString());
        strings.reverse();
        System.out.println(strings.toString());
         */

        /*
        MyLinkedList<String> myList = new MyLinkedList<>();
        int i = 0;
        for(String string : myStrings) {
            myList.insert(new Link<String>(i, string));
            i++;
        }
        System.out.println(myList.toString() + " 1");
        myList.reverse();
        System.out.println(myList.toString() + " 2");
        */
        
        /*
        MyAVLTree<String> tree = new MyAVLTree<>();
        for(int i = 0; i < myStrings.length; i++)
            tree.insert(new TreeNode<String>(i, myStrings[i]));
        System.out.println(tree.depthOfMax());
        */

        MyDynamicSet<String> set = new MyDynamicSet<>();
        Element<String> a,b,c;
        a = new Element<String>(10, "ten");
        b = new Element<String>(9, "nine");
        c = new Element<String>(8, "eight");
        for(int i = 0; i < myStrings.length; i++)
            set.insert(new Element<String>(i, myStrings[i]));
        set.insert(a); set.insert(b); set.insert(c);
        System.out.println(set.maximum());
        System.out.println(set.minimum());
        System.out.println(set.search(3).satelliteData());
        System.out.println(set.toString());
        set.delete(c);
        System.out.println(set.toString());
    }
}
