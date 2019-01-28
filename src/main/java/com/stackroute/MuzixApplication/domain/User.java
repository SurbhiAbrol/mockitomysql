package com.stackroute.MuzixApplication.domain;


import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import org.springframework.data.mongodb.core.mapping.Document;


import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id

   private int trackId;
    @ApiModelProperty(notes="name of track")
    private String trackName;
    @ApiModelProperty(notes = "comments on track")
   private String comments;


    public User(String trackName, String comments) {
        this.trackName = trackName;
        this.comments = comments;
    }
}
