package com.company;

 class ByteShortInt {

    public static void main(String[] args) {
        byte MyByteValue = 10;
        short MyShortValue = 20;
        int MyIntNumber = 30;
        long MyTotalLong = 50000 + 10* (MyByteValue + MyShortValue + MyIntNumber);
        System.out.println("MyTotalLong = " + MyTotalLong);

        short MyLastShort = (short) ((MyTotalLong/2) *(MyIntNumber + MyByteValue));
        System.out.println("MyLastShort = " + MyLastShort);
    }
}
