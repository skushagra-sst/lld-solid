import com.example.profiles.*;

public class TryIt {
    public static void main(String[] args) {
        UserProfile p = new UserProfile.Builder()
                .id("rudra-app-01")
                .email("deeptalkswithvarundeep@rudra.app")
                .displayName("Deep talks with Varun Deep")
                .marketingOptIn(true)
                .build();
        System.out.println("Before: " + p.getEmail());
        System.out.println("=> In the solution, this setter disappears and object becomes immutable.");
    }
}
