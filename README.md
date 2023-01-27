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

