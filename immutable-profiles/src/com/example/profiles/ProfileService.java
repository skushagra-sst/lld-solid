package com.example.profiles;

import java.util.Objects;

/**
 * Assembles profiles with scattered, inconsistent validation.
 */
public class ProfileService {

    // returns a fully built profile but mutates it afterwards (bug-friendly)
    public UserProfile createMinimal(String id, String email) {
        Validation.requireNonBlank(id, "id");
        Validation.requireNonBlank(email, "email");
        Validation.requireEmail(email);
        return new UserProfile.Builder()
                .id(id)
                .email(email)
                .build();
    }

    public UserProfile updateDisplayName(UserProfile existing, String displayName) {
        return new UserProfile.Builder()
                .id(existing.getId())
                .email(existing.getEmail())
                .phone(existing.getPhone())
                .displayName(displayName)
                .address(existing.getAddress())
                .marketingOptIn(existing.isMarketingOptIn())
                .twitter(existing.getTwitter())
                .github(existing.getGithub())
                .build();
    }
}
