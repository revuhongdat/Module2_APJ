package class_animal_and_interface_edible;

public class Demo<E> {
    private E name;
    public E getName(){
        return  this.name;
    }

    public static void main(String[] args) {
        Demo<Integer> demo = new Demo<>();
    }
}

