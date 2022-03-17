package school.lesson4.catsanddogs;

// не смотря на то, что все поведение прописано в этом классе, я класс делаю абстрактным, чтобы запретить возможность создания объекта животное

public abstract class Animal {
    private static int counter;
    private String name;
    private boolean swimable = true;
    private int runRestriction;
    private int swimmingRestriction;

    public Animal(String name, int runRestriction, int swimmingRestriction) {
        counter++;
        this.name = name;
        if (this.getClass() == Cat.class) {
            swimable = false;
        }
        if (runRestriction > 0) {
            this.runRestriction = runRestriction;
        } else {
            System.out.println("Run restriction from cannot be negative, " + getName() + "  run restriction = 0");
            this.runRestriction = 0;
        }
        if (swimable) {
            if (swimmingRestriction > 0) {
                this.swimmingRestriction = swimmingRestriction;
            } else {
                System.out.println("Swimming restriction from cannot be negative, " + getName() + "  swimming restriction = 0");
                this.swimmingRestriction = 0;
            }
        } else {
            System.out.println("Cats can't swim, " + getName() + " swimming restriction = 0");
        }
    }

    public String getName() {
        return name;
    }

    public int getRunRestriction() {
        return runRestriction;
    }

    public void setRunRestriction(int runRestriction) {
        this.runRestriction = runRestriction;
    }

    public int getSwimmingRestriction() {
        return swimmingRestriction;
    }

    public void setSwimmingRestriction(int swimmingRestriction) {
        this.swimmingRestriction = swimmingRestriction;
    }

    public static void checkCounter() {
        System.out.println(counter + " copies of " + Animal.class.getSimpleName() + " were created");
    }

    public void run(int obstacleLength) {
        if (obstacleLength > 0) {
            canRun(obstacleLength);
        } else {
            System.out.println("Obstacle length <= 0");
        }
    }

    public void canRun(int obstacleLength) {
        if (getRunRestriction() > obstacleLength && getRunRestriction() > 0) {
            System.out.println(getName() + " ran " + obstacleLength + " m.");
            setRunRestriction(getRunRestriction() - obstacleLength);
        } else if (getRunRestriction() < obstacleLength && getRunRestriction() > 0) {
            System.out.println(getName() + " ran " + getRunRestriction() + " m., it can't run " + obstacleLength);
            setRunRestriction(0);
        } else {
            System.out.println(getName() + " can't run anymore");
        }
    }

    public void swim(int obstacleLength) {
        if (swimable) {
            if (obstacleLength > 0) {
                canSwim(obstacleLength);
            } else {
                System.out.println("Obstacle length <= 0");
            }
        } else {
            System.out.println(this.getClass().getSimpleName() + " " + getName() + " can't swim");
        }
    }

    public void canSwim(int obstacleLength) {
        if (getSwimmingRestriction() > obstacleLength && getSwimmingRestriction() > 0) {
            System.out.println(getName() + " swim " + obstacleLength + " m.");
            setSwimmingRestriction(getSwimmingRestriction() - obstacleLength);
        } else if (getSwimmingRestriction() < obstacleLength && getSwimmingRestriction() > 0) {
            System.out.println(getName() + " swim " + getSwimmingRestriction() + " m.");
            setSwimmingRestriction(0);
        } else {
            System.out.println(getName() + " can't swim anymore");
        }
    }
}
