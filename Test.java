class Test
{
    public static void main(String[] args) {
        int a=20,b=55,c;
        c=a+b;
        System.out.println("Result "+c);

        Sub s=new Sub();
        s.sub(30, 5);

        Div d=new Div();
        d.div(30, 0);
    }

} 