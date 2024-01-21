package com.blog;

public class MainUtil {
    public static void main(String[] args) {







        MainUtil mainUtil = new MainUtil();
        new MainUtil().test().test2();//object created with its address we are calling test


//        List<Integer>data= Arrays.asList(10,70,80,20,30,5,100);
//        List<Integer>newdata= data.stream().filter(X->X>20).collect(Collectors.toList());
//        System.out.println(newdata);
//        List<String>data= Arrays.asList("michel","sunny","mohan","chanky");
//        List<String>newdata= data.stream().filter(X->X.startsWith("m")).collect(Collectors.toList());
//        System.out.println(newdata);
//        List <String>data=Arrays.asList("sunny","mohan","hari","shyam");
//        List<String>newdata=data.stream().filter(X->X.endsWith("n")).collect(Collectors.toList());
//        System.out.println(newdata);
//        List <String>data=Arrays.asList("sunny","mohan","hari","shyam","mohan");
//        List<String>newdata=data.stream().filter(X->X.equals("mohan")).collect(Collectors.toList());
//        System.out.println(newdata.size());
//List<Integer>data= Arrays.asList(10,2,4,8);
//List<Integer>newdata=data.stream().map(n->n+n).collect(Collectors.toList());
//System.out.println(newdata);
//        List<Integer>data= Arrays.asList(10,2,4,8);
//        List<Integer>newdata=data.stream().sorted().collect(Collectors.toList());
//         System.out.println(newdata);
//        List<String>data=Arrays.asList("shyam","zain","rohan","chris");
//        List<String>newdata=data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newdata);
//        List<Integer>data=Arrays.asList(11,22,77,11,90,99,90,56);
////        List<Integer>newdata=data.stream().distinct().collect(Collectors.toList());
////        System.out.println(newdata);
//        Supplier<String> mySuppllier=()->"Spplied values";
//        String s=mySuppllier.get();
//        System.out.println(s);
//        Supplier<MainUtil> mySuppllier=()->new MainUtil();
//        MainUtil s=mySuppllier.get();
//        System.out.println(s);
//        Consumer<String>myConsumer=s-> System.out.println("Consumed:"+s);
//        myConsumer.accept("hello");

        PostPractice post1 = new PostPractice();
        post1.setId(1);
        post1.setTitle("aaa");
        post1.setContent("mmmmm");

        PostPractice post2 = new PostPractice();
        post2.setId(1);
        post2.setTitle("ooo");
        post2.setContent("yyy");

        PostPractice post3 = new PostPractice();
        post3.setId(1);
        post3.setTitle("ooooooooo");
        post3.setContent("ggggggg");

//List<PostPractice> posts=Arrays.asList(post1,post2,post3);
//posts.stream().map(p->mapToDto(p))
    }

    PostDtoPractice mapToDto(PostPractice postPractice) {
        PostDtoPractice dto = new PostDtoPractice();
        return dto;
    }

    public MainUtil test() {
        return new MainUtil();
    }

    public void test2() {
        System.out.println(200);
    }
}
