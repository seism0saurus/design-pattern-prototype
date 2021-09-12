package de.seism0saurus.design.pattern.prototype.optimized;

public class Config {

    public String getSemester() {
        return getSemesterFromFile();
    }

    /**
     * Dont realy loads from a file but simulates a slow process.
     *
     * @return The current semester
     */
    private String getSemesterFromFile() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "2021/1";
    }
}
