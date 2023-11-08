package examen.fullstack.examen.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(CLASS)
@Target(FIELD)
@Constraint(validatedBy = DescripcionObraValidation.class)
public @interface DescripcionObraValidator {
	String mensaje() default "la descripcion de la obra de arte debe contener al menos 5 palabras";
	Class<?>[] groups() default {};
	Class <? extends Payload>[] paylaod() default{};
}

