package week8;

import java.util.ArrayList;

public class VideoStore {

    private ArrayList<Video> vStock = new ArrayList<>();

    public boolean addVideo(String title) {
        for (Video v : vStock) {
            if (v.getTitle().equals(title)) {
                System.out.println(title + " is already in stock.");
                return false;
            }
        }
        vStock.add(new Video(title));
        return true;
    }

    public Video getVideo(String title) {
        for (Video v : vStock) {
            if (v.getTitle().equals(title)) {
                return v;
            }
        }
        System.out.println("Sorry, cannot find the requested video in the catalogue");
        return null;
    }

    public boolean checkOutVideo(String title) {
        for (Video v : vStock) {
            if (v.getTitle().equals(title)) {
                return v.checkOut();
            }
        }
        System.out.println("Sorry, cannot find the requested video in the catalogue");
        return false;

    }

    public boolean returnVideo(Video video) {
        for (Video v : getCheckedOut()) {
            if (v.equals(video)) {
                return video.returnToStore();
            }
        }
        System.out.println("Sorry, this video did not come from this store");
        return false;
    }

    public void rateVideo(Video video, int rating) {
        video.addRating(rating);
    }

    public double getAverageRatingForVideo(Video video) {
        return video.getAverageRating();
    }

    public Video[] getCheckedOut() {
        ArrayList<Video> checkedOut = new ArrayList<>();
        for (Video v : vStock) {
            if (v.isCheckedOut()) {
                checkedOut.add(v);
            }
        }
        return checkedOut.toArray(new Video[checkedOut.size()]);
    }

    public Video mostPopular() {
        Video popular = new Video("");
        double highRating = 0;
        for (Video v : vStock) {
            if (v.getAverageRating() > highRating) {
                popular = v;
                highRating = v.getAverageRating();
            }
        }
        return popular;
    }

}
