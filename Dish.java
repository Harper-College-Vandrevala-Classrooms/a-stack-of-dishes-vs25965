class Dish {
    public String description;
  
    Dish(String description) {
      this.description = description;
    }

    @Override
    public String toString() {
        return description; // Returns the description of the dish
    }
  }