class IntegerWC {
    public static void main(String[] args) {
        Integer age = 10;
        System.out.println(age);
        Integer weight = Integer.parseInt("5456");
        System.out.println(weight);
        Integer price = Integer.valueOf(87);
        System.out.println(price);
        Integer count = Integer.bitCount(563);
        System.out.println(count);
        Integer max = Integer.MAX_VALUE;
        System.out.println(max);
        Integer min = Integer.MIN_VALUE;
        System.out.println(min);
        Integer comp = Integer.compare(4,5);
        System.out.println(comp);
        Integer maxval = Integer.max(8,6);
        System.out.println(maxval);
        Integer minval = Integer.min(8,6);
        System.out.println(minval);
        Integer sum = Integer.sum(2,22);
        System.out.println(sum);
        Integer hash = Integer.hashCode(43);
        System.out.println(hash);
    }
}