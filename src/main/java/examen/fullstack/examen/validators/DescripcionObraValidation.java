package examen.fullstack.examen.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DescripcionObraValidation implements ConstraintValidator<DescripcionObraValidator, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if (value == null || value.trim().isEmpty()) {

			return false;

			}
		String[] palabras = value.split("\s+");
		return palabras.length >= 5;
	}

}
