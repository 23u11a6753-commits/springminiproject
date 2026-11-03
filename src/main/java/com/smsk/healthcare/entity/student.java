package com.smsk.healthcare.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class student
{

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 @NonNull
 private String name;
 @Nonnull
 private int age;

}
