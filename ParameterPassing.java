import java.util.*; 
class Test{
    public static void reassign(int[] list){
        list = new int[]{1, 3};
    }

    public static void alter(int[] list){
        list[1] = 2;
    }

    public static void main(String[] args){
        int[] list = new int[]{0, 1};
        reassign(list);
        alter(list);

        for(int i = 0; i < list.length; i++)
        {
            System.out.println(list[i]);
        }
    }
}

class Example { 
	int x = 10; 
    public static void main(String[] args) 
	{ 
        Example obj;// = new Example(); 
        System.out.println(obj.x);
        return;
	} 
} 


