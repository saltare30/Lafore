
// Объект массив
public class ArrayInt {
    int [] array = null;
    int high;

    ArrayInt(int size, int count, boolean dup, boolean sort){
        high = count;
        array = new int[size];
        for (int k = 0; k<count;k++){
            array[k] = (int) (Math.random()*1000);
        }
    }

    void insert(int value){
        array[high] = value;
        high++;
    }

    void delete(int pos){
        for(int i=pos;i<high;i++){
            array[i] = array[i+1];
        }
        high--;
    }



    // проверка массива на наличие дублей
    boolean IsDupl(){
        for (int a = 0; a<high-1;a++)
            for (int b = a+1; b<high;b++)
                if (array[a] == array[b])
                    return true;
        return false;
    }

    // Вывести массив в консоль
    void showArray(){
        for (int i=0; i<high;i++) System.out.print(array[i] + " ");
        System.out.println("Вершина: " + high);
    }







}
