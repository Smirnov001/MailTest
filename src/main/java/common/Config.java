package common;

public class Config {
    /**
     * Specify the browser and platform for test:
     * CHROME_WINDOWS
     * MOZILLA_WINDOWS
     **/

    public static final String BROWSER_AND_PLATFORM = "CHROME_WINDOWS";

    /**
     * Clean browser Cookies after each iteration
     **/
    public static final Boolean Clear_Cookies = false;

    /**
     * To keep the browser open after all tests
     **/
    public static final Boolean HOLD_BROWSER_OPEN = true;

    /**
     * Clear the directory with the screen before starting the build
     **/
    public static final Boolean CLEAR_REPORTS_DIR = true;
}