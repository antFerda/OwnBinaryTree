package main.mutable;

public class MutableNode implements INode {

    private final int value;
    private INode left;
    private INode right;


    public MutableNode(int value) {
        this.value = value;
    }

    @Override
    public INode add(Integer value) { //all this statements made for transparency and more clear explanation
        if(value == this.value) return this;
        if(value < this.value) {
            if(left == null)
               left = new MutableNode(value);
            else
                left.add(value);
            return this;
        }

        if(value > this.value) {
            if(right == null)
                right = new MutableNode(value);
            else
                right.add(value);
            return this;
        }

        return this;
    }

    @Override
    public void print() {
        if(left != null) left.print();
        System.out.println(this.value);
        if(right != null) right.print();
    }

    @Override
    public int count() {
        int result = 1;
        if(left != null) result += left.count();
        if(right != null) result += right.count();
        return result;
    }
}
