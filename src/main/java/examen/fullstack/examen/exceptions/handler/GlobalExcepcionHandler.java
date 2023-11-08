package examen.fullstack.examen.exceptions.handler;

import java.net.URI;
import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import examen.fullstack.examen.exceptions.CreacionObraException;

@RestControllerAdvice
public class GlobalExcepcionHandler {

    @ExceptionHandler( CreacionObraException.class )
    public ProblemDetail HandleCreacionObraException(CreacionObraException e) {

        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
        problemDetail.setTitle("Artwork Exception Occurred");
        problemDetail.setType(URI.create("http://cesurformacion.com"));
        problemDetail.setProperty("errorCategory", "Artwork");
        problemDetail.setProperty("timeStamp", Instant.now());

        return problemDetail;
    }

}