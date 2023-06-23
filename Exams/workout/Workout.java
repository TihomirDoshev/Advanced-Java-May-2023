package workout;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Workout {
    //•	type: String
    //•	exerciseCount: int
    private List<Exercise> exercises;
    private String type;
    private int exerciseCount;

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        this.exercises = new ArrayList<>();

    }
    public void addExercise(Exercise exercise){
        if (this.exercises.size() < this.exerciseCount){
            this.exercises.add(exercise);
        }
    }
    public boolean removeExercise(String name, String muscle){
        for (Exercise element : this.exercises) {
            if (element.getName().equals(name) && element.getMuscle().equals(muscle)){
                this.exercises.remove(element);
                return true;
            }

        }
        return false;
    }
    public Exercise getExercise(String name, String muscle){
        for (Exercise element : this.exercises) {
            if (element.getName().equals(name) && element.getMuscle().equals(muscle)){
                return element;
            }

        }
        return null;

    }
    public Exercise getMostBurnedCaloriesExercise(){
        return this.exercises.stream().max(Comparator.comparing(Exercise::getBurnedCalories)).orElse(null);

    }
    public int getExerciseCount(){
        return this.exercises.size();
    }
    public String 	getStatistics(){
        //o	"Workout type: {workout type}
        //Exercise: {Exercise1}
        //Exercise: {Exercise2}
        //(…)"
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Workout type: %s",this.type));
        sb.append(System.lineSeparator());
        for (Exercise element : this.exercises) {
            sb.append(element);
            sb.append(System.lineSeparator());


        }
        return sb.toString().trim();

    }
}
