package Rough;

/*
Want to represent a big integer using a custom class/object, so that we can do math operations with e.g. 100 digit integer number.
 */

public class BigInteger {
    long value;

    public BigInteger(String value) {
        this.value = Long.parseLong(value);
    }

    public BigInteger(long value) {
        this.value = value;
    }

    private BigInteger addValues(BigInteger value) {
        return new BigInteger(this.value + value.value);
    }

    public static void main(String[] args) {
        BigInteger a = new BigInteger("12");
        BigInteger b = new BigInteger(34);
        BigInteger c = a.addValues(b);

        System.out.println(c.value);
    }
}
