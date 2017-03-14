package week8;

import java.util.ArrayList;
import java.util.HashSet;

public class Video {

    private String title;
    private boolean checkedOut;
    private ArrayList<Integer> ratings = new ArrayList<>();

    public Video(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public boolean addRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            ratings.add(rating);
            return true;
        } else {
            System.out.println(rating + " should be between 1 and 5.");
            return false;
        }
    }

    public double getAverageRating() {
        if (ratings.size() == 0) {
            return 0;
        } else {
            double rAvg = 0;
            for (int r : ratings) {
                rAvg += r / (double) ratings.size();
            }
            return  rAvg;
        }
    }

    public boolean checkOut() {
        if (checkedOut) {
            System.out.println(this + " is already checked out.");
            return false;
        } else {
            checkedOut = true;
            return true;
        }
    }

    public boolean returnToStore() {
        if (checkedOut) {
            checkedOut = false;
            return true;
        } else {
            System.out.println(this + " is not checked out.");
            return false;
        }
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public String toString() {
        return String.format("Video[title=\"%s\", checkedOut=%s]", getTitle(), isCheckedOut());
    }

}
