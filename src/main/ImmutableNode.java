package main;

public class ImmutableNode implements INode {


    private final int value;
    private final INode left;
    private final INode right;

    public ImmutableNode(int value, INode left, INode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    @Override
    public INode add(final Integer value) {
        if(this.value == value) return this;
        if(value < this.value) {
            if(left == null)
                return new ImmutableNode(this.value, new ImmutableNode(value, null, null), right);
            return new ImmutableNode(this.value, left.add(value), right);
        }

        if(right == null)
            return new ImmutableNode(this.value, null, new ImmutableNode(value, null, null));
        return new ImmutableNode(this.value, left, right.add(value));
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
