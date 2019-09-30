public class hello {
    public static void main(String[] args) {
        Student s1 = new Student("bob1",18,"清华");
        Student s2 = new Student("bob2",18,"北大");
        Student s3 = new Student("bob3",18,"复旦");
        Worker w1 = new Worker("tom1",20,"水电");
        Worker w2 = new Worker("tom2",40,"钢厂");
        Person[] people = {s1,s2,s3,w1,w2};
        int scout = 0;
        int wcout = 0;
        for (Person item : people){
            if(item instanceof Student){
                scout++;
            }else if(item instanceof Worker){
                wcout++;
            }
        }
        System.out.printf("工人人数：%d，学生人数%d",wcout,scout);
    }
}
