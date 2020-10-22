package deqo.mdem.mysimplestack;

public class Stack implements ISimpleStack{
    private final static int NB_MAX = 20;
    private Item[] buffer;
    private int nbItems;

    public Stack(){
        buffer = new Item[NB_MAX];
        nbItems = 0;
    }

    @Override
    public boolean isEmpty() {
        return nbItems==0;
    }

    @Override
    public int getSize() {
        return nbItems;
    }

    @Override
    public void push(Item item) {
        if(nbItems<NB_MAX){
            buffer[nbItems] = item;
            nbItems++;
        }
        System.out.println("Item ajouté!");
    }

    @Override
    public Item peek() throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException();
        } else {
            return buffer[nbItems-1];
        }
    }

    @Override
    public Item pop() throws EmptyStackException {
        Item item;
        if(isEmpty()){
            throw new EmptyStackException();
        } else {
            item = buffer[nbItems-1];
            nbItems--;
            System.out.println("Element pop");
            return item;
        }
    }
}
