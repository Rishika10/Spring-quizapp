package com.project.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "question") // Ensures it maps to your 'Question' table
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Matches Postgres 'SERIAL'
    private int id;

    private String questionTitle; // Hibernate maps this to question_title automatically

    private String option1;
    private String option2;
    private String option3;
    private String option4;

    private String rightAnswer; // Hibernate maps this to right_answer automatically

    private String difficultyLevel; // Hibernate maps this to difficulty_level

    private String category; // Added this to match your SQL 'category' column


}
