package com.tts.TechTalentTwitter.model;

import java.util.List;

//import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TweetDisplay {
    private User user;
    private String message;
    private String date;
    private List<Tag> tags;

    // Use the code below if your lombok is not working:
    // public User getUser() {
    // return user;
    // }

    // public void setUser(User user) {
    // this.user = user;
    // }

    // public String getMessage() {
    // return message;
    // }

    // public void setMessage(String message) {
    // this.message = message;
    // }

    // public String getDate() {
    // return date;
    // }

    // public void setDate(String date) {
    // this.date = date;
    // }

    // public List<Tag> getTags() {
    // return tags;
    // }

    // public void setTags(List<Tag> tags) {
    // this.tags = tags;
    // }

    // @Override
    // public String toString() {
    // return "TweetDisplay [date=" + date + ", message=" + message + ", tags=" +
    // tags + ", user=" + user + "]";
    // }

}
