package exercises;

import java.util.UUID;

public class RandomString {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String randomString = UUID.randomUUID().toString();
            System.out.println(randomString);
        }
    }
}
