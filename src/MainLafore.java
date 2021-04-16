public class MainLafore {
    static public void main(String[] args){
        // работа с массивом
        ArrayInt arr = new ArrayInt(20,3,false,true);

        arr.showArray();
        //System.out.println(arr.IsDupl());
        arr.insert(123);
        arr.showArray();
        arr.delete(0);
        arr.showArray();

        char a = '\u1002';
        System.out.println(a);

    }
}
