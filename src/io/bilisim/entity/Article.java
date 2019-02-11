package io.bilisim.entity;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Article {
	@NotBlank(message = "author  alaný boþ olamaz!")
	private String author;
	@NotNull(message = "Subject alaný boþ olamaz")
	@Pattern(regexp="A|B|C")
	private String subject;
	@NotEmpty(message = "category listesi bos olamaz")
	private List<@NotNull(message = "category elemanlarý null olamaz") String> category;
	@NotBlank(message = "Title alaný boþ olamaz")
	@Size(max = 30, message = "Title en çok 30 karakter olabilir")
	private String title;
	@FutureOrPresent(message = "lastSaveDate geçmiþte olamaz")
	private LocalDate lastSaveDate;
	@AssertTrue(message="Publish alaný true olmalý")
	private Boolean publish;
	@NotBlank(message = "Text alaný null olamaz")
	@Size(max = 5000, min = 300, message = "Text en az 300 en çok 5000 karakter olabilir")
	private String text;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<String> getCategory() {
		return category;
	}

	public void setCategory(List<String> category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getLastSaveDate() {
		return lastSaveDate;
	}

	public void setLastSaveDate(LocalDate lastSaveDate) {
		this.lastSaveDate = lastSaveDate;
	}

	public Boolean getPublish() {
		return publish;
	}

	public void setPublish(Boolean publish) {
		this.publish = publish;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
