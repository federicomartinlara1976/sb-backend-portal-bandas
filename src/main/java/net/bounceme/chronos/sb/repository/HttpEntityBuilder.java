package net.bounceme.chronos.sb.repository;

import java.io.IOException;

import org.springframework.http.HttpEntity;
import org.springframework.util.MultiValueMap;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.bounceme.chronos.sb.exception.FirebaseRepositoryException;
import net.bounceme.chronos.sb.service.FirebaseApplicationService;

public class HttpEntityBuilder<T> {

    private final ObjectMapper firebaseObjectMapper;

    private final FirebaseApplicationService firebaseApplicationService;

    private T document;

    private MultiValueMap<String, String> headers;

    private HttpEntityBuilder(ObjectMapper firebaseObjectMapper, FirebaseApplicationService firebaseApplicationService) {
        try {
            this.firebaseObjectMapper = firebaseObjectMapper;
            this.firebaseApplicationService = firebaseApplicationService;
            headers = this.firebaseApplicationService.headers();
        } catch (IOException e) {
            throw new FirebaseRepositoryException(e.getMessage());
        }
    }

    @SuppressWarnings("rawtypes")
	public static HttpEntityBuilder create(ObjectMapper firebaseObjectMapper, FirebaseApplicationService firebaseApplicationService) {
        return new HttpEntityBuilder(firebaseObjectMapper, firebaseApplicationService);
    }

    @SuppressWarnings("rawtypes")
	public HttpEntityBuilder document(T document) {
        this.document = document;
        return this;
    }

    @SuppressWarnings("rawtypes")
	public HttpEntityBuilder header(String headerName, String headerValue) {
        this.headers.add(headerName, headerValue);
        return this;
    }

    public HttpEntity<String> build() {
        try {
            if(document == null) {
                return new HttpEntity<>(headers);
            } else {
                return new HttpEntity<>(firebaseObjectMapper.writeValueAsString(document), headers);
            }
        } catch (IOException e) {
            throw new FirebaseRepositoryException(e.getMessage());
        }
    }

}
