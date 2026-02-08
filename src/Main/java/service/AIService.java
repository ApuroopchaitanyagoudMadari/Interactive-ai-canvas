package service;

import model.Student;

public class AIService {

    // Simple AI simulation for demonstration
    public String answerQuestion(String question) {
        // Very basic simulated AI responses
        question = question.toLowerCase();
        if(question.contains("course")) {
            return "I recommend focusing on your incomplete courses first.";
        } else if(question.contains("progress")) {
            return "Keep up the work! Try to complete at least 50% of each course.";
        } else if(question.contains("help")) {
            return "I can help you choose courses, track progress, and answer questions.";
        } else {
            return "Sorry, I don't understand your question. Try asking about courses or progress.";
        }
    }

    // Recommend next course based on student's progress
    public String recommendNextCourse(Student student) {
        // Iterate through courses and find the one with lowest progress
        String recommended = null;
        int lowestProgress = 101; // start higher than 100%
        for(String course : student.getCourses()) {
            int p = student.getProgress().get(course);
            if(p < lowestProgress) {
                lowestProgress = p;
                recommended = course;
            }
        }
        if(recommended != null) {
            return "Based on your progress, I recommend focusing on: " + recommended;
        } else {
            return "You are doing great! All courses seem completed.";
        }
    }
}
