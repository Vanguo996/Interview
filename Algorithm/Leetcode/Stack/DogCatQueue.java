package Leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author vanguo996
 * 实现一个猫狗队列
 */


public class DogCatQueue {

    public static class Pet {
        private String type;

        public Pet(String type) {
            this.type = type;
        }

        public String getPetType() {
            return this.type;
        }
    }

    public static class Dog extends Pet {
        public Dog() {
            super("dog");
        }
    }

    public static class Cat extends Pet {
        public Cat() {
            super("cat");
        }
    }

    //新建一个类，给对象封装一个时间戳,这里盖上时间戳的过程就是封装的过程
    public static class PetType {
        private Pet pet;
        long count;

        public PetType(Pet pet, long count) {
            this.pet = pet;
            this.count = count;
        }

        public long getCount() {
            return count;
        }

        public Pet getPet() {
            return pet;
        }


    }

    public static class CatDogQueue {
        //设计时注意问题，不能狗队列只放DOG,猫队列只放CAT，会存在更新问题
        private Queue<PetType> dog;
        private Queue<PetType> cat;
        private long count;

        public CatDogQueue() {

            dog = new LinkedList<>();
            cat = new LinkedList<>();
            count = 0;

        }

        public void add(Pet pet) {
            if(pet.getPetType().equals("dog")) {
                //把盖上时间戳的对象放到队列中
                dog.add(new PetType(pet, count++));
            }  else if(pet.getPetType().equals("cat")){

                cat.add(new PetType(pet, count++));

            } else {
                throw new RuntimeException("error");
            }

        }

        //把宠物对象弹出
        public Pet pollAll() {
            //只要两个队列不为空
            if(!dog.isEmpty() && !cat.isEmpty()){
                //拿到时间戳做比较
                if(dog.peek().getCount() > cat.peek().getCount()) {
                    //必须返回pet对象，不是时间戳封装后的对象，
                    return cat.poll().getPet();
                } else {
                    return dog.poll().getPet();
                }

            } else if(!dog.isEmpty()){
                return dog.poll().getPet();
            } else if(!cat.isEmpty()) {
                return cat.poll().getPet();
            } else {
                throw new RuntimeException("empty error");
            }

        }

        public Dog pollDog() {
            if(!dog.isEmpty()){
                return (Dog) dog.poll().getPet();
            } else {
                throw new RuntimeException("error");
            }

        }

        public Cat pollCat() {
            if(!cat.isEmpty()) {
                return (Cat) cat.poll().getPet();
            } else {
                throw new RuntimeException("error");
            }
        }

    }




}
