package com.surya.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class PasswordResetToken {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Getter
	@Setter
	private Integer id;
	
	
	private @NonNull String token;
	
	@ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
	@JoinColumn(nullable = false, name = "user_id")
	private @NonNull User user;

	private @NonNull  Date expiryDate;

//	public PasswordResetToken(String resetToken, User user, Date expiryDate) {
//		this.expiryDate=expiryDate;
//		this.user=user;
//		this.token=resetToken;
//	}

    public boolean isExpired() {
        return expiryDate.before(new Date());
    }

	public @NonNull User getUser() {
		return user;
	}
}
