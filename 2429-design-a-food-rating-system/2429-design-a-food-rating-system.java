import java.util.*;

class FoodRatings {
    // Maps each food to its cuisine
    private Map<String, String> foodToCuisine;
    // Maps each food to its rating
    private Map<String, Integer> foodToRating;
    // Maps each cuisine to a TreeSet of food names sorted by rating and lexicographical order
    private Map<String, TreeSet<String>> cuisineToFoods;
    // Custom comparator for TreeSet
    private Comparator<String> foodComparator;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodToCuisine = new HashMap<>();
        foodToRating = new HashMap<>();
        cuisineToFoods = new HashMap<>();

        foodComparator = (a, b) -> {
            int compareRatings = foodToRating.get(b) - foodToRating.get(a); // descending
            if (compareRatings != 0)
                return compareRatings;
            return a.compareTo(b); // lexicographically
        };

        for (int i = 0; i < foods.length; i++) {
            foodToCuisine.put(foods[i], cuisines[i]);
            foodToRating.put(foods[i], ratings[i]);
        }

        for (String cuisine : cuisines)
            cuisineToFoods.put(cuisine, new TreeSet<>(foodComparator));

        for (String food : foods)
            cuisineToFoods.get(foodToCuisine.get(food)).add(food);
    }

    public void changeRating(String food, int newRating) {
        String cuisine = foodToCuisine.get(food);
        TreeSet<String> set = cuisineToFoods.get(cuisine);
        set.remove(food); // Remove old rating
        foodToRating.put(food, newRating);
        set.add(food); // Insert with new rating
    }

    public String highestRated(String cuisine) {
        return cuisineToFoods.get(cuisine).first();
    }
}