package com.example.activitytracker.activitytracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;

    @Column(columnDefinition = "varchar(255) default 'pending'")
    private String status;

   @CreationTimestamp
    private LocalDateTime CreatedAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

     @Column(nullable = true)
    private LocalDateTime CompletedAt;

    @ManyToOne
    @JoinColumn(name ="user_id", referencedColumnName = "id")
     private User user;












}
