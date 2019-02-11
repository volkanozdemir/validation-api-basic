package io.bilisim;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import io.bilisim.entity.Article;

public class Starter {

	public static void main(String[] args) {
		Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
		Set<ConstraintViolation<Article>> violations = validator.validate(initializeInstance());
		violations.forEach(violation -> {
			System.out.println(violation.getMessage());
		});
	}
	
	static Article initializeInstance() {
		Article article = new Article();
		article.setAuthor("");
		article.setCategory(Arrays.asList("A","B",null));
		article.setLastSaveDate(LocalDate.of(2019, 02, 8));
		article.setPublish(false);
		article.setSubject("A");
		article.setText("");
		article.setTitle("");
		return article;
	}
}
