package APItesting;

import com.example.CDLibrary.typicodestuff.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TypicodeTests {
    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void testGetUser() throws IOException {
        int userId = 2;
        String expectedUserName = "Antonette";
        String request = "https://jsonplaceholder.typicode.com/users/" + userId;

        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpUriRequest httpUriRequest = new HttpGet(request);

        HttpResponse response = client.execute(httpUriRequest);

        User user = mapper.readValue(response.getEntity().getContent(), User.class);
        String actualUserName = user.getUsername();

        assertEquals(expectedUserName, actualUserName);
    }

    @Test
    public void testGetUserCity() throws IOException {
        int userId = 2;
        String expectedUserName = "Antonette";
        String expectedCity = "Wisokyburgh";
        String request = "https://jsonplaceholder.typicode.com/users/" + userId;

        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpUriRequest httpUriRequest = new HttpGet(request);

        HttpResponse response = client.execute(httpUriRequest);

        User user = mapper.readValue(response.getEntity().getContent(), User.class);
        String actualUserName = user.getUsername();
        String actualCity = user.getAddress().getCity();

        assertEquals(expectedUserName, actualUserName);
        assertEquals(expectedCity, actualCity);
    }

    @Test
    public void testGetTenusers() throws IOException {
        int expectedNumberOfUsers = 10;
        String expectedUserName = "Antonette";
        String expectedCity = "Wisokyburgh";
        String request = "https://jsonplaceholder.typicode.com/users/";

        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpUriRequest httpUriRequest = new HttpGet(request);

        HttpResponse response = client.execute(httpUriRequest);

        User[] users = mapper.readValue(response.getEntity().getContent(), User[].class);

        assertEquals(expectedNumberOfUsers, users.length);
    }
}
