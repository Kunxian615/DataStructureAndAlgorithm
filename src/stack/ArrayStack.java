package stack;

public class ArrayStack {
    private int[] arr;
    //栈大小3
    private int count;
    //当前位置
    private int index=0;
    public ArrayStack(int size){
        if (size==0) {
            throw new IllegalArgumentException("stack大小不能为0");
        }
        //初始化高度
        arr=new int[size];
        count=size;
    }

    //插入数据
    public  void push(int i){
        if (index==count) {
            throw new ArrayIndexOutOfBoundsException();
        }
        arr[index++]=i;
    }

    //弹出数据
    public int pop(){
        if (index==0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        try{
            return arr[index-1];
        }finally {
            index--;
        }
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(10);
        arrayStack.push(5);
        arrayStack.push(4);
        arrayStack.push(3);
        arrayStack.push(2);
        arrayStack.push(1);

        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
    }
}
