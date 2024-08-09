package APItesting;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.http.HttpClient;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GitHubTests {

    @Test
    public void testWithKnownUser() throws IOException {
        int expectedResult = HttpStatus.SC_OK;
        String request = "https://api.github.com/users/backpacktrainer";

        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpUriRequest httpUriRequest = new HttpGet(request);

        HttpResponse response = client.execute(httpUriRequest);
        int actualResult = response.getStatusLine().getStatusCode();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testWithUnknownUser() throws IOException {
        int expectedResult = HttpStatus.SC_NOT_FOUND;
        String request = "https://api.github.com/users/backpacktrainer42";

        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpUriRequest httpUriRequest = new HttpGet(request);

        HttpResponse response = client.execute(httpUriRequest);
        int actualResult = response.getStatusLine().getStatusCode();

        assertEquals(expectedResult, actualResult);
    }
}
