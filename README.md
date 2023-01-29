# RestAPIofBlog

SPRING SECURITY


Add Below all Bean in SecurityConfig class file.
1.SecurityFilterChain

    1.Write code for regarding http requet,matching pattern
    
    
    --How internally work--------------------
    BasicAuthenticationFilter
        
        convert() take username and password from header
        and decrypt using Base64 and send to doFiltrInternal() method.

        doFilterInternal() method authenticate
        and give two response success or Failure.
        if success than store into securitycontext and proceed
        and if failure retuen error response.
        --------------------------------


2. Add Bean of UserDetailService. for Inmemory user. 

        If you give role USER or ADMIN than set method level security to your API
3. Add Bean of Password Encoder. to encode password 
4. Create CustomUserdetailsService for load username this file implements UserDetailsService
5. Than autowired customuserdetailsService in Security config
6. add bean of Authentication manager.


JWT IMPLEMENTATION
1.Add JWT related Maven Dependencies
   
         <dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-impl</artifactId>
			<version>0.11.5</version>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-api</artifactId>
			<version>0.11.5</version>
		</dependency>
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-jackson</artifactId>
			<version>0.11.5</version>
			<scope>runtime</scope>
		</dependency>

2.Create JWT AuthenticationEntryPoint

      @Component
      public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {
            @Override
            public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
               response.sendError(HttpServletResponse.SC_UNAUTHORIZED,authException.getMessage());
            }
      }

3.Add JWT Properties in application properties file.
         
      app.jwt-secret = 89fbfac1c9f24aac119d773c6cbc7eb7a75d3d8fd99f7a1b4439a2c58da78893
      app-jwt-expiration-milliseconds = 604800000

4.Create JWtTokenPovider - utility class
5.Create JwtAuthenticationFilter
6.Create JwtAuthResponseDto
7.Configure Jwt in Spring Security
8.Change Login/Signin RestApi to return JWT Token


