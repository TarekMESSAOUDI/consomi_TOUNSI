package tn.esprit.spring.securities.Services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.User;

@Component
public class UserDetailsImpl implements UserDetails {
	
	private static final long serialVersionUID = 1L;
	Client client;

	private Collection<? extends GrantedAuthority> authorities;

	public UserDetailsImpl(Client user,
			Collection<? extends GrantedAuthority> authorities) {
		this.client = user;
		this.authorities = authorities;
	}
	
	public UserDetailsImpl() {
	}

	public static UserDetailsImpl build(Client user) {
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(user.getRoleUser()));

		return new UserDetailsImpl(user, 
				authorities);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}
	
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	
	public Client getClient () throws Exception {
		return client;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		try {
			return client.isStateUser();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserDetailsImpl user1 = (UserDetailsImpl) o;
		return Objects.equals(client, user1);
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return client.getPasswordUser();
	}
	
	

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return client.getFirstNameUser();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	

}
