package core;

public interface Authentication {
    Object login(String email,String passsword);
    boolean register();
}
