package com.example.profiles;

/**
 * Mutable and confusing. Multiple constructors + setters.
 */
public class UserProfile {
    private String id;
    private String email;
    private String phone;
    private String displayName;
    private String address;
    private boolean marketingOptIn;
    private String twitter;
    private String github;

    private UserProfile(Builder b) {
        this.id = b.id;
        this.email = b.email;
        this.phone = b.phone;
        this.displayName = b.displayName;
        this.address = b.address;
        this.marketingOptIn = b.marketingOptIn;
        this.twitter = b.twitter;
        this.github = b.github;
    }

    // getters
    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getAddress() {
        return address;
    }

    public boolean isMarketingOptIn() {
        return marketingOptIn;
    }

    public String getTwitter() {
        return twitter;
    }

    public String getGithub() {
        return github;
    }

    public static class Builder {
        private String id;
        private String email;
        private String phone;
        private String displayName;
        private String address;
        private boolean marketingOptIn;
        private String twitter;
        private String github;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder marketingOptIn(boolean marketingOptIn) {
            this.marketingOptIn = marketingOptIn;
            return this;
        }

        public Builder twitter(String twitter) {
            this.twitter = twitter;
            return this;
        }

        public Builder github(String github) {
            this.github = github;
            return this;
        }

        public UserProfile build() {
            UserProfile profile = new UserProfile(this);
            return profile;
        }
    }
}
