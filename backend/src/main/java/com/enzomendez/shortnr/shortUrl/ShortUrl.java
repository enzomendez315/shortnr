package com.enzomendez.shortnr.shortUrl;

import jakarta.persistence.*;

@Entity
@Table(name = "short_urls")
public class ShortUrl {
	@Id
	@SequenceGenerator(
			name = "short_url_sequence",
			sequenceName = "short_url_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "short_url_sequence"
	)
	private Long id;
	private String shortUrl;
	@ManyToOne
	private Url originalUrl;

}
