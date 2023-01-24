package homeworks.homework8;

public class DynamicArray {
    private int[] array = new int[10];
    private int size;


    public void add(int value) {

        if (size == array.length) {

            extend();
        }

        array[size] = value;
        size++;
    }

    public int getByIndex(int index) {

        if (index >= 0 && index < size) {
            return array[index];
        } else {
            return -1;
        }
    }

    private void extend() {
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];

        }
        array = newArray;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();

    }

    //ջնջել մասիվի index-երորդ էլեմենտը
//եթե չկա նման ինդեքսով էլեմենտ, տպել, որ չկա նման էլեմենտ
    public void deleteByIndex(int index) {
        if (index > size || index < 0) {
            System.out.println("Wrong index");
            return;

        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;

    }


    //տրված value-ն դնելու ենք տրված index-ով էլեմենտի տեղը։
//Հին արժեքը կկորի
//եթե նման ինդեքսով էլեմենտ չկա, գրում ենք որ չկա։
    public void set(int index, int value) {
        if (index >= size || index < 0) {
            System.out.println("Wrong index");
            return;

        }
        array[index] = value;


    }


    //ավելացնել տրված value-ն տրված ինդեքսում, իսկ էղած էլեմենտները մի հատ աջ տանել։
//Եթե չկա նման ինդեքս, տպել որ չկա
    public void add(int index, int value) {

        if (index < 0 || index > size) {
            System.out.println("Wrong index");
            return;


        }

        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = value;
        size++;


    }


    //Վերադարձնել true եթե տրված value-ն կա մեր մասիվի մեջ, եթե ոչ false
    public boolean exists(int value) {
        boolean exist = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                exist = true;
                break;
            }
        }
        return exist;
    }


    //Վերադարձնել տրված value-ի ինդեքսը, եթե շատ կա տվյալ թվից, վերադարձնել առաջին ինդեքսը։
//եթե չկա, -1
    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

}



