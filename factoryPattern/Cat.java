package factorypattern;

public class Cat {
	 private Integer noOfLives;

	    public Integer getNoOfLives() {
	        return noOfLives;
	    }

	    public void setNoOfLives(Integer noOfLives) {
	        this.noOfLives = noOfLives;
	    }

	    public String makeSound() {
	        return "Meow, meow!";
	    }

	    public String play() {
	        return "Catching/pursuing moving objects!";
	    }
	}

