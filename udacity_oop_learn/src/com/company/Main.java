package com.company;

 class Main {

    public static void main(String[] args)  {
        if(args.length==0) {
            System.out.println("Please specify arguments");
        }
        else {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            System.out.println(num1 + num2);
        }
    }
}


