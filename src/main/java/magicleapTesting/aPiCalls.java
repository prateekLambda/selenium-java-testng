package magicleapTesting;

import java.io.*;

import static io.restassured.RestAssured.given;

public class aPiCalls {

    private final String username;   //LT_username
    private final String accesskey; //LT_accessKey
    private final String ApiBaseUrl;

    // Authorization with username and accesskey
    aPiCalls(String username, String accesskey) {
        this.username = username;
        this.accesskey = accesskey;
        this.ApiBaseUrl = "https://" + username + ":" + accesskey + "@api.lambdatest.com/automation/api/v1/"; // API base URL with authorization
    }

    // API session detail function
    public void getSessionDetails(String sid) throws IOException {
        System.setOut(new PrintStream(createLogFile(sid)));

        //given().when().get(ApiBaseUrl + "builds").then().log().body();       // Request to fetch all the build details
        given().when().get(ApiBaseUrl + "sessions/" + sid).then().log().body(); // Request to fetch particular session details contains command, visual, video, selenium logs
        //given().when().get(ApiBaseUrl + "lighthouse/report/" + sid).then().log().body(); // Request to fetch performance report if exist
        //https://${apiCredentials}@api.lambdatest.com/automation/api/v1/builds/${buildId}/sessions





    }

    // Create new file to save output Data
    private FileOutputStream createLogFile(String sid) throws FileNotFoundException {

        if (new File( sid + ".json").exists()) {
            System.out.println("file already exists");

        } else {
            return new FileOutputStream( sid + ".json");
        }
        return null;
    }

}
