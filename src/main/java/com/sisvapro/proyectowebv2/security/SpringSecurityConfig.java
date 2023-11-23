package com.sisvapro.proyectowebv2.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

@Configuration
public class SpringSecurityConfig{
/*	
	@Bean
	public static BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Autowired
	public void configurerGlobal(AuthenticationManagerBuilder builder) throws Exception {
		PasswordEncoder encoder = passwordEncoder();
		
		UserBuilder users = User.builder().passwordEncoder(encoder::encode);
		builder.inMemoryAuthentication()
        .withUser(users.username("rut01").password(encoder.encode("rut01")).roles("ADMIN", "USER"))
        .withUser(users.username("edu28").password(encoder.encode("edu$28")).roles("ADMIN", "USER"));

		// Imprimir información de depuración
		builder.getDefaultUserDetailsService().loadUserByUsername("rut01");
		builder.getDefaultUserDetailsService().loadUserByUsername("edu28");
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf(AbstractHttpConfigurer::disable).httpBasic(Customizer.withDefaults())
		.authorizeHttpRequests(x -> x
				.requestMatchers("/login/cargar").permitAll()
				.requestMatchers(HttpMethod.POST, "/login/validar").permitAll()
                .anyRequest().authenticated()
		          )
        .formLogin(loginConfigurer ->
            loginConfigurer
                .loginPage("/login/cargar")
                .loginProcessingUrl("/login/validar") // Agregar esta líne
                .permitAll()
        )
        .logout(logoutConfigurer ->
            logoutConfigurer
                .logoutSuccessUrl("/")
                .permitAll()
        );
    return http.build();
}
*/	
}
